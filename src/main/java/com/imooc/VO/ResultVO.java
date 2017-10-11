package com.imooc.VO;

import lombok.Data;

/**
 * http 请求返回idea最外层对象
 * Created by liangweibang on 2017/10/11.
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回的具体内容
     */
    private T data;
}
