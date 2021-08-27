package com.cloud.model.bean.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqq
 * @Date 2021/8/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;

    private String msg;

    private T data;

    public CommonResult(Integer code, String msg){
        this(code, msg, null);
    }
}
