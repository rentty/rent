package com.rent.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author BABA
 * @date 2019/9/30 9:26
 *
 * Example:
 */
@ApiModel(value = "全局异常")
public class RentException extends RuntimeException{//要么抛出要么捕获

    @ApiModelProperty(value = "状态码")
    private Integer code;
    /**
     * 接受状态码和消息
     * @param code
     * @param message
     */
    public RentException(Integer code, String message){
        super(message);
        this.code = code;
    }
    /**
     * 接受枚举类型
     * @param ResultCode
     */
    public RentException(ResultCode resultCode){
        super(resultCode.getMessage());
        this.code = resultCode.getCode();
    }

    @Override
    public String toString() {
        return "RentException{" +
                "message=" + this.getMessage() +
                ", code=" + code +
                '}';
    }
}
