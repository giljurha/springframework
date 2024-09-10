package com.mycompany.springframework.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class Ch14Aspect5AfterThrowing {
	@AfterThrowing(
			pointcut="execution(public * com.mycompany.springframework.controller.Ch14Controller.afterThrowing*(..))",
			throwing="e"
			)
	public void method(Throwable e) {
		//메소드 호출 전에 실행하는 공통 코드
		log.info("실행");
		log.info("예외 메세지" + e.getMessage());
	}
}
