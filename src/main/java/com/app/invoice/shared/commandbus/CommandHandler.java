package com.app.invoice.shared.commandbus;

public interface CommandHandler<T extends Command> {
    void handle(T command);
}
