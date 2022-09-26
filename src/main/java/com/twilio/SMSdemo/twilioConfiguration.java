package com.twilio.SMSdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class twilioConfiguration {
    private String accountSid;
    private String authToken;
    private String trailnumber;

    //constructor
    public twilioConfiguration() {

    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getTrailnumber() {
        return trailnumber;
    }

    public void setTrailnumber(String trailnumber) {
        this.trailnumber = trailnumber;
    }
}
