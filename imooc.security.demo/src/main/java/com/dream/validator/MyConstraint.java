package com.dream.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by H.J
 * 2018/6/29
 */
//注解所适用的地方 -- 方法 -- 字段
@Target({ElementType.METHOD,ElementType.FIELD})
//用来修饰注解的生存范围
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyConstraintValidator.class)
public @interface MyConstraint {

    String message() default "{这是一个测试}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
