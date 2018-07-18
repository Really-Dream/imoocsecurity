package com.dream.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by H.J
 * 2018/7/16
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);
}
