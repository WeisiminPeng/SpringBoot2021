package com.practice.webrestfulcrud.exception;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("User Not Exist!");
    }
}
