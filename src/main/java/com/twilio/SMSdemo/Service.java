package com.twilio.SMSdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@org.springframework.stereotype.Service
public class Service {

    private final Smsend smsend; //uses interface
    @Autowired
    public Service(@Qualifier("twilio") com.twilio.SMSdemo.Smsend smsend) {
        this.smsend = smsend;
    }
    public  void sendSms(SmsRequest smsRequest){
        smsend.sendSms(smsRequest);
    }
}
