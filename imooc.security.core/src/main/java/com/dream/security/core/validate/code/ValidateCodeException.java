package com.dream.security.core.validate.code;


import org.springframework.security.core.AuthenticationException;

/**
 * Created by H.J
 * 2018/7/12
 */
public class ValidateCodeException extends AuthenticationException {

    private static final long serialVersionUID = -7285211538095468156L;

    public ValidateCodeException(String msg){
        super(msg);
    }
}
