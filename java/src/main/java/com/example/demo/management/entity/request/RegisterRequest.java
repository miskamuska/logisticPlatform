package com.example.demo.management.entity.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel("注册实体类")
public class RegisterRequest {

    @ApiModelProperty(value = "电话")
    @NotBlank(message = "请输入您的电话")
    private String loginId;

    @ApiModelProperty(value = "姓名")
    @NotBlank(message = "请输入您的姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    @NotBlank(message = "请输入您的密码")
    private String password;

    @ApiModelProperty(value = "第二次密码")
    @NotBlank(message = "请再次输入您的密码")
    private String password1;

    @ApiModelProperty(value = "身份")
    private int type;


}
