package com.example.eurekaclient1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT,reason = "Invalid credentials")
public class UserAlreadyExistsException extends Throwable {
}
