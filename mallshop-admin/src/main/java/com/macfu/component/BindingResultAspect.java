package com.macfu.component;

import com.macfu.common.api.Result;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * @author macfu
 * @description: HibernateValidate
 * @date 2019/5/16
 */
@Aspect
@Component
@Order(2)
public class BindingResultAspect {

    @Pointcut("execution(public * com.macfu.controller.*.*(..))")
    public void BindingResult() {

    }

    @Around("BindingResult()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult result = (BindingResult) arg;
                if (result.hasErrors()) {
                    FieldError fieldError = result.getFieldError();
                    if (fieldError != null) {
                        return Result.validateFailed(fieldError.getDefaultMessage());
                    } else {
                        return Result.validateFailed();
                    }
                }
            }
        }
        return joinPoint.proceed();
    }
}
