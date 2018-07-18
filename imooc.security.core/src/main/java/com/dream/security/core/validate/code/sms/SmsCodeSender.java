package com.dream.security.core.validate.code.sms;

/**
 * Created by H.J
 * 2018/7/19
 */
public interface SmsCodeSender {

    void send(String mobile,String code);
}
