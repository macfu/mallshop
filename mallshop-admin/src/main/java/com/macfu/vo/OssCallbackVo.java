package com.macfu.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * oss上传成功后的回调参数
 */
@Getter
@Setter
public class OssCallbackVo {
    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBodyType;
}
