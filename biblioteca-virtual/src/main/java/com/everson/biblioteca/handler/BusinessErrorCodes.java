package com.everson.biblioteca.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

public enum BusinessErrorCodes {

    NO_CODE(0, NOT_IMPLEMENTED, "No code provided"),

    INCORRECT_CURRENT_PASSWORD(300, BAD_REQUEST, "Incorrect current password"),

    PASSWORDS_DO_NOT_MATCH(301, BAD_REQUEST, "Passwords do not match"),

    ACCOUNT_LOCKED(302, FORBIDDEN, "Account is locked"),

    ACCOUNT_DISABLED(303, FORBIDDEN, "Account is disabled"),

    BAD_CREDENTIALS(304, UNAUTHORIZED, "Login and/or password incorrect.");;

    @Getter
    private final int code;

    @Getter
    private final String description;

    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }


}
