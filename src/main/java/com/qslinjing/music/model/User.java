package com.qslinjing.music.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 14:12
 * @project music
 */

@Getter
@Setter
@ToString(callSuper = true)
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class User extends RootModel{
	private String account;

	private String username;

	private String password;

	private String userType;

}
