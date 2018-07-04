package com.dream.dto;

import lombok.Data;

/**
 * Created by H.J
 * 2018/7/4
 */
@Data
public class FileInfo {

    public FileInfo(String path){
        this.path = path;
    }

    private String path;


}
