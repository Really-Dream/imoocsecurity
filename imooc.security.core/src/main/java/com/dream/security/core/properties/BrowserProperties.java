package com.dream.security.core.properties;

import lombok.Data;
import sun.security.util.SecurityConstants;

/**
 * Created by H.J
 * 2018/7/12
 */
@Data
public class BrowserProperties {

    private SessionProperties session = new SessionProperties();

    private String signUpUrl = "/imooc-signUp.html";

    private String loginPage = "/dream-signIn.html";

    private LoginResponseType loginType = LoginResponseType.JSON;

    private int rememberMeSeconds = 3600;

}
