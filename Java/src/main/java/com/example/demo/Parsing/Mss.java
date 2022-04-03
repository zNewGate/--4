package com.example.demo.Parsing;


import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

public class Mss {

    @JsonView
    private String id;
    @JsonView
    private String Name;

}
