package com.tomorrow.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author YinQiming
 * @create 2022-05-13 16:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebResult {
    private Integer code;
    private String message;
    private Map<String,Object> data;

    public static WebResult ok(String message, Map<String,Object> data){
        return new WebResult(200,message,data);
    }

    public static WebResult error(String message){
        return new WebResult(400,message,null);
    }
}
