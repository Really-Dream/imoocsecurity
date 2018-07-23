package com.dream.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by H.J
 * 2018/7/23
 */
public interface ValidateCodeProcessor {

    /**
     * 验证码放入session时的前缀
     */
    String SESSION_KEY_PREFIX = "SESSION_KEY_CODE_";

    /**
     * 创建校验码
     */
    void create(ServletWebRequest request) throws Exception;
}
