package com.qslinjing.music.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 14:26
 * @project music
 */

@MapperScan("com.qslinjing.music.mapper")
@Configuration
public class TkMybatisConfig {
}
