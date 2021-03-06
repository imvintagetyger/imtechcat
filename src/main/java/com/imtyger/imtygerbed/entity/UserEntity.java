package com.imtyger.imtygerbed.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @ClassName UserEntity
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/6/1 11:44
 * @Version 1.0
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "users")
public class UserEntity {

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	@TableField(value = "username")
	@NotEmpty
	private String username;

	@TableField(value = "password")
	@NotEmpty
	private String password;

	@TableField(value = "nickName")
	@NotEmpty
	private String nickName;//昵称

	@TableField(value = "avatar")
	@NotEmpty
	private String avatar;//头像图标

	@TableField(value = "createdAt")
	@NotEmpty
	private Date createdAt;//注册时间

	@TableField(value = "updatedAt")
	@NotEmpty
	private Date updatedAt;//最后更新时间



}
