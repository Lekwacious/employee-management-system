package com.lekwacious.employee_app.data.payloads.response;

public class MessageResponse {

    private String message;

    public MessageResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
