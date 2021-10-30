package com.qslinjing.music.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 14:19
 * @project music
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class Singer extends RootModel{

	private String singerName;

	private String nickName;

	private String desc;

	private String remark;

	private Date birthday;

	private String image;

	private String company;
}
