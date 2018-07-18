package com.dream.security.core.validate.code;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * Created by H.J
 * 2018/7/12
 */
@Data
public class ValidateCode {

    private String code;

    private LocalDateTime expireTime;

    public ValidateCode(String code, LocalDateTime expireTime){
        this.code = code;
        this.expireTime = expireTime;
    }

    public ValidateCode(String code, int expireTime){
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireTime);
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
