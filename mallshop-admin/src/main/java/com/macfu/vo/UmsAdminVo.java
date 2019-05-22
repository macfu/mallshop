package com.macfu.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author macfu
 * @description:
 * @date 2019/5/16
 */
@Data
public class UmsAdminVo {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String usernmae;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String emial;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;
}
