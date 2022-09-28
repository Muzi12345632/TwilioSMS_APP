package com.twilio.SMSdemo;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.logging.Logger;

@Service("twilio")
public class twilioSmsender implements Smsend {
    private static final Logger LOGGER = LoggerFactory.getLogger(twilioSmsender.class);
    private  final twilioConfiguration twilioConfiguration;
    @Autowired
    public twilioSmsender(com.twilio.SMSdemo.twilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }
    @Override
    public void sendSms(SmsRequest smsRequest) {
        if(isPhonenumber(smsRequest.getPhonenumber())){
        PhoneNumber to = new PhoneNumber(smsRequest.getPhonenumber());
        PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrailnumber());
        String message = smsRequest.getMessage();
        MessageCreator creator = Message.creator(to , from, message);
        creator.create();
        LOGGER.info("Send sms {}" + smsRequest);
        } else{
            throw new IllegalArgumentException("Phonemuber"+ smsRequest.getPhonenumber()+ "number is not valid");
        }

    }

    private boolean isPhonenumber(String phonenumber) {
        //TODO Implement phone number validation
        return true;
    }
}
