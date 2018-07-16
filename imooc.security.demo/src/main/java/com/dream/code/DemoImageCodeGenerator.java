package com.dream.code;

import com.dream.security.core.validate.code.ImageCode;
import com.dream.security.core.validate.code.ValidateCodeGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by H.J
 * 2018/7/16
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("更高级的图形验证码生成码DemoImageCodeGenerator");
        return null;
    }
}
