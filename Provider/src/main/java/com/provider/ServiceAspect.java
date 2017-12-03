package com.provider;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

    @Pointcut("execution(public * com.provider.HelloImpl.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        logger.info("方法之前执行");
    }

    @After("log()")
    public void doAfter() {
        logger.info("方法之后执行");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturn(Object object) {
//        logger.info("response={}", object.toString());
    }
}