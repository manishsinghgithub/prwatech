package com.prwatech.common.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@ResponseStatus(value = HttpStatus.LOCKED)
public class LockedException extends RuntimeException{

    public LockedException(String message){
        super(message);
    }
}
