package com.dream.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by H.J
 * 2018/7/4
 */
@Aspect
@Component
public class TimeAspect {

//    @Around("execution(* com.dream.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable{

        System.out.println("time aspect start");

        Object[] args = pjp.getArgs();
        for(Object arg : args){
            System.out.println("args is :" + arg);
        }

        Long start = new Date().getTime();

        Object object =  pjp.proceed();

        System.out.println("time aspect 耗时： "+ (new Date().getTime() - start));

        System.out.println("time aspect end");

        return object;
    }

}
