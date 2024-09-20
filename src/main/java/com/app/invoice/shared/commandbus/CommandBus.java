package com.app.invoice.shared.commandbus;

public interface CommandBus {
    void dispatch(Command command) throws CommandHandlerExecutionError;
}
