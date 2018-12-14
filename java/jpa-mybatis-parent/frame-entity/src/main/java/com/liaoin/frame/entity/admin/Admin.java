package com.liaoin.frame.entity.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.ORDER;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;

/**
 * 后台管理员信息表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@NameStyle(Style.camelhump)
@Table(name = "t_admin")
@ApiModel("后台管理员")
public class Admin{

    @Id
    @KeySql(sql = "select T_ADMIN_SEQUENCES.nextval from dual", order = ORDER.BEFORE)
    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("随机串")
    private Integer random;

    @ApiModelProperty("添加时间")
    private Date addTime;


}
