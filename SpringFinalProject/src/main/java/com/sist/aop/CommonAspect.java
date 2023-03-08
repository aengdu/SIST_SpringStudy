package com.sist.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonAspect {
    @Around("execution(" *com.sist.web.*Controller.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        Object obj = null;
        return obj;
    }
}