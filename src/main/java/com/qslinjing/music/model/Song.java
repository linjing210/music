package com.qslinjing.music.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 14:18
 * @project music
 */

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Song extends RootModel {

	private String songName;

	private Singer singer;

	private String songType;

	private User createdBy;

	private User updatedBy;
}



