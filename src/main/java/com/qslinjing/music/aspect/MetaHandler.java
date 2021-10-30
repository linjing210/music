package com.qslinjing.music.aspect;

import com.qslinjing.music.model.RootModel;
import com.qslinjing.music.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.util.Date;
import java.util.List;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 18:26
 * @project music
 */

@Aspect
@Component
public class MetaHandler {

	@Before(value = "execution(public * com.qslinjing.music.mapper.*.update*(..))")
	private void update(JoinPoint joinPoint){
		System.out.println(joinPoint.getKind());
		Object[] args = joinPoint.getArgs();
		fill("update", args);
		System.out.println("--------update execute--------");
	}

	@Before(value = "execution(public * com.qslinjing.music.mapper.*.insert*(..))")
	private void insert(JoinPoint joinPoint){
		System.out.println(joinPoint.getKind());
		Object[] args = joinPoint.getArgs();
		fill("insert", args);
		System.out.println("--------insert execute-------");
	}

	private void fillUpdate(Object arg){
		RootModel param = (RootModel) arg;
		param.setUpdatedAt(new Date());
	}

	private void fillInsert(Object arg){
		RootModel param = (RootModel) arg;
		param.setCreatedAt(new Date());
		param.setUpdatedAt(new Date());
	}

	private void fill(String type, Object... args){
		for (int i = 0; i < args.length; i++) {
			if(args[i] instanceof RootModel) {
				if ("insert".equals(type)) {
					fillInsert(args[i]);
				} else {
					fillUpdate(args[i]);
				}
			}else if(args[i] instanceof List){
				List argList = (List) args[i];
				for (int j = 0; j < argList.size(); j++) {
					Object arg = argList.get(i);
					if(arg instanceof RootModel) {
						if ("insert".equals(type)) {
							fillInsert(arg);
						} else {
							fillUpdate(arg);
						}
					}
				}
			}
		}
	}

}
