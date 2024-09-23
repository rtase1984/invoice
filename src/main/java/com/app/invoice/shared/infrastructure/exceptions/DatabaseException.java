package com.app.invoice.shared.infrastructure.exceptions;

public class DatabaseException extends RuntimeException {

    // Constructor que recibe solo un mensaje
    public DatabaseException(String message) {
        super(message);  // Llama al constructor de RuntimeException con el mensaje
    }

    // Constructor que recibe un mensaje y una causa (otra excepción)
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);  // Llama al constructor de RuntimeException con el mensaje y la causa
    }

    // Constructor que recibe solo una causa (otra excepción)
    public DatabaseException(Throwable cause) {
        super(cause);  // Llama al constructor de RuntimeException con la causa
    }

    // Constructor completo con control de supresión y escritura de stack trace
    public DatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);  // Llama al constructor avanzado de RuntimeException
    }
}
