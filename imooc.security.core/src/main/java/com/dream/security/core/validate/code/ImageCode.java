package com.dream.security.core.validate.code;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * Created by H.J
 * 2018/7/12
 */
@Data
public class ImageCode extends ValidateCode {

    private BufferedImage image;

    public ImageCode(BufferedImage image,String code,LocalDateTime expireTime){
        super(code,expireTime);
        this.image = image;
    }

    public ImageCode(BufferedImage image,String code,int expireTime){
        super(code,LocalDateTime.now().plusSeconds(expireTime));
        this.image = image;
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(super.getExpireTime());
    }
}
