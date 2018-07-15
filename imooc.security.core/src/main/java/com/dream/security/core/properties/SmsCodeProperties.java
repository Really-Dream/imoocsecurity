package com.dream.security.core.properties;

import lombok.Data;

/**
 * Created by H.J
 * 2018/7/15
 */
@Data
public class SmsCodeProperties {

    private int length = 6;
    private int expireIn = 60;

    private String url;
}
