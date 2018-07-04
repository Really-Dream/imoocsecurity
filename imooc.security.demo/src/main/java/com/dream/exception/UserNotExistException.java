package com.dream.exception;

import lombok.Data;

/**
 * Created by H.J
 * 2018/7/4
 */
@Data
public class UserNotExistException extends RuntimeException{

    private static final long serialVersionUID = -7034897190745766923L;

    private String id;

    public UserNotExistException(String id){
        super("user not exist" + id);
        this.id = id;
    }


}
