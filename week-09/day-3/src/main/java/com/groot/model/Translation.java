package com.groot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Translation {

    private String received;
    private String translated;

    public Translation(String received){
        this.received = received;
        this.translated = "I am Groot!";
    }
}
