package com.dream.security.core.properties;

import lombok.Data;

/**
 * Created by H.J
 * 2018/7/15
 */
@Data
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();

    private SmsCodeProperties sms = new SmsCodeProperties();
}
