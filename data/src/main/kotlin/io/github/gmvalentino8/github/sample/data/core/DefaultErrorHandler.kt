package io.github.gmvalentino8.github.sample.data.core

import io.github.gmvalentino8.github.sample.domain.core.DomainError
import io.github.gmvalentino8.github.sample.domain.core.ErrorHandler

/**
 * Default error handler
 *
 * Default implementation of [ErrorHandler]
 */
class DefaultErrorHandler : ErrorHandler {
    override fun handle(throwable: Throwable): DomainError = when (throwable) {
        is DataException -> when (throwable) {
            is DataException.LocalException.DatabaseException -> DomainError.Maintenance(throwable)
            is DataException.RemoteException.ForbiddenException -> DomainError.Server(throwable)
            is DataException.RemoteException.InternalServerException -> DomainError.Server(throwable)
            is DataException.RemoteException.NetworkException -> DomainError.Network(throwable)
            is DataException.RemoteException.NotFoundException -> DomainError.Server(throwable)
            is DataException.RemoteException.ServiceUnavailableException -> DomainError.Server(throwable)
            is DataException.RemoteException.UnauthorizedException -> DomainError.Server(throwable)
            is DataException.RemoteException.UnprocessableException -> DomainError.Server(throwable)
            is DataException.Unknown -> DomainError.Unknown(throwable)
        }
        else -> DomainError.Unknown(throwable)
    }
}
