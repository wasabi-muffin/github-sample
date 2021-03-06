package io.github.gmvalentino8.github.sample.ui.core

import androidx.lifecycle.SavedStateHandle
import io.github.gmvalentino8.github.sample.presentation.core.contract.Event
import io.github.gmvalentino8.github.sample.presentation.core.contract.State
import io.github.gmvalentino8.github.sample.presentation.core.contract.ViewState

private const val StateKey = "StateKey"
private const val EventKey = "EventKey"
private const val EventsKey = "EventsKey"

fun <VS : ViewState, E : Event> SavedStateHandle.saveState(state: State<VS, E>) {
    set(StateKey, state.viewState)
    set(EventKey, state.event)
    set(EventsKey, state.events)
}

fun <VS : ViewState, E : Event> SavedStateHandle.getState(): State<VS, E>? {
    return get<VS>(StateKey)?.let { viewState ->
        get<List<E>>(EventsKey)?.let { events ->
            State(viewState, get(EventKey), events)
        }
    }
}

fun SavedStateHandle.hasSavedState(): Boolean =
    contains(StateKey) && contains(EventsKey)

fun SavedStateHandle.onInit(block: () -> Unit) {
    if (!hasSavedState()) block()
}
