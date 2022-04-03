package com.example.demo.Parsing;

import com.fasterxml.jackson.annotation.JsonView;

public class Resp {

    @JsonView
    private String value;
    Stat StatObject;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Stat getStatObject() {
        return StatObject;
    }

    public void setStatObject(Stat StatObject) {
        StatObject = StatObject;
    }

}
