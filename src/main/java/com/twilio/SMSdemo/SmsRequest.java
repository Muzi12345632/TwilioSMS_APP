package com.twilio.SMSdemo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {
    //Phonenumber validation not allow null values
    private  final String phonenumber; //destination phonenumber
    private final String message;

    public SmsRequest(@JsonProperty("phonenumber") String phonenumber,
                      @JsonProperty("message") String message) {
        this.phonenumber = phonenumber;
        this.message = message;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phonenumber='" + phonenumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
