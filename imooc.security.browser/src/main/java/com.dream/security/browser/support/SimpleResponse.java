package com.dream.security.browser.support;

import lombok.Data;

/**
 * Created by H.J
 * 2018/7/12
 */
@Data
public class SimpleResponse {

    public SimpleResponse(Object content){
        this.content = content;
    }

    private Object content;


}
