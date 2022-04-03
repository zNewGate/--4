package com.example.demo.Parsing;

import com.fasterxml.jackson.annotation.JsonView;


public class Req {

    @JsonView
    private String IDRequest;
    Mss MessagesObject;

    public String getIDRequest() {
        return IDRequest;
    }

    public void setIDRequest(String IDRequest) {
        this.IDRequest = IDRequest;
    }

    public Mss getMss() {
        return MessagesObject;
    }

    public void setMessages( Mss messagesObject ) {
        this.MessagesObject = messagesObject;
    }

}
