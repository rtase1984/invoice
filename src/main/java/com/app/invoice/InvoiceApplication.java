package com.app.invoice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvoiceApplication {

    private Logger logger = LoggerFactory.getLogger(InvoiceApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(InvoiceApplication.class, args);
    }

}
