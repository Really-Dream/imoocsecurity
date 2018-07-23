package com.dream.security.core.validate.code.sms;

/**
 * Created by H.J
 * 2018/7/19
 */
public class DefaultSmsCodeSender implements SmsCodeSender {


    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机" + mobile + "发送验证码" + code);
    }
}
