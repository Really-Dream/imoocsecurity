package com.dream.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by H.J
 * 2018/6/29
 */
public class MyConstraintValidator implements ConstraintValidator<MyConstraint,Object> {


    @Override
    public void initialize(MyConstraint myConstraint) {
        System.out.println("init my validator");
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println(o);
        return false;
    }
}
