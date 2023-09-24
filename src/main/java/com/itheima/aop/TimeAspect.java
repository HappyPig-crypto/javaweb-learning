package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * ClassName: TimeAspect
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/23 12:25
 * @Version 1.0
 */
@Slf4j
@Component
@Aspect
public class TimeAspect {
    @Around("execution(* com.itheima.service.*.*(..))")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info(joinPoint.getSignature() + "方法执行耗时: {}ms",end - begin);
        return result;

    }
}
