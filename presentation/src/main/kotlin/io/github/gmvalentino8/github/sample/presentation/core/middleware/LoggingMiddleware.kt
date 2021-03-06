package io.github.gmvalentino8.github.sample.presentation.core.middleware

import io.github.gmvalentino8.github.sample.presentation.core.contract.Action
import io.github.gmvalentino8.github.sample.presentation.core.contract.Contract
import io.github.gmvalentino8.github.sample.presentation.core.contract.Event
import io.github.gmvalentino8.github.sample.presentation.core.contract.Intent
import io.github.gmvalentino8.github.sample.presentation.core.contract.Result
import io.github.gmvalentino8.github.sample.presentation.core.contract.State
import io.github.gmvalentino8.github.sample.presentation.core.contract.ViewState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.onEach

/**
 * Logging middleware
 *
 * Middleware to log state machine inputs/outputs
 */
class LoggingMiddleware<I : Intent, A : Action, R : Result, VS : ViewState, E : Event>(
    private val verbose: Boolean = true,
    private val intentPrefix: String = "Intent:",
    private val actionPrefix: String = "Action:",
    private val resultPrefix: String = "Result:",
    private val statePrefix: String = "State:",
    private val log: (message: String) -> Unit,
) : IntentMiddleware<I, VS, E>, ActionMiddleware<A, VS, E>, ResultMiddleware<R, VS, E>, StateMiddleware<VS, E> {
    override fun modifyIntents(input: Flow<I>, state: StateFlow<State<VS, E>>): Flow<I> = input.onEach { intent ->
        log("$intentPrefix ${intent.message()}")
    }

    override fun modifyActions(input: Flow<A>, state: StateFlow<State<VS, E>>): Flow<A> = input.onEach { action ->
        log("$actionPrefix ${action.message()}")
    }

    override fun modifyResults(input: Flow<R>, state: StateFlow<State<VS, E>>): Flow<R> = input.onEach { result ->
        log("$resultPrefix ${result.message()}")
    }

    override fun modifyStates(input: Flow<State<VS, E>>): Flow<State<VS, E>> = input.onEach { state ->
        log("$statePrefix ${state.message()}")
    }

    private fun Contract.message(): String {
        return if (verbose) {
            toString()
        } else {
            if (this is State<*, *>) {
                this.viewState::class.simpleName ?: toString()
            } else {
                this::class.simpleName ?: toString()
            }
        }
    }
}
