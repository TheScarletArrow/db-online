package ru.scarlet.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail constraint) {
        endOfEmail = constraint.value();
    }

    @Override
    public boolean isValid(String valueEntered, ConstraintValidatorContext context) {

        return valueEntered.endsWith(endOfEmail);
    }

}
