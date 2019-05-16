package com.macfu.bo;

import lombok.Data;

/**
 * @author macfu
 * @description: Controller层的日志封装类
 * @date 2019/5/16
 */
@Data
public class WebLog {
    // 操作描述
    private String description;
    // 操作用户
    private String username;
    // 操作时间
    private Long startTime;
    // 消耗时间
    private Integer spendTime;
    // 根路径
    private String basePath;
    // uri
    private String uri;
    // url
    private String url;
    // 请求类型
    private String method;
    // ip地址
    private String ip;
    private Object parameter;
    private Object result;
}
