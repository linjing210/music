package com.qslinjing.music.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 14:13
 * @project music
 */

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class RootModel {

	@Id
	private Long id;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdAt;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updatedAt;
}
