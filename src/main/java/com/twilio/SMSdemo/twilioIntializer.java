package com.twilio.SMSdemo;

import com.twilio.Twilio;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class twilioIntializer {

    private final static Logger LOGGER = LoggerFactory.getLogger(twilioIntializer.class);
    private  final  twilioConfiguration twilioConfiguration;

    @Autowired
    public twilioIntializer(com.twilio.SMSdemo.twilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(twilioConfiguration.getAccountSid(),
                twilioConfiguration.getAuthToken());
        LOGGER.info("Twilio init....... with account sid {}", twilioConfiguration.getAccountSid());
    }



}
