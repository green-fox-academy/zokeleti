package com.groot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Error {

    String error;

    public Error(){
        this.error = "I am Groot!";
    }
}
