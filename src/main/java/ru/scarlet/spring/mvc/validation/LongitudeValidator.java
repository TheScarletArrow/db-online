package ru.scarlet.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LongitudeValidator implements ConstraintValidator<CheckFields, Double> {
    private String longitude;

    @Override
    public void initialize(CheckFields constraintAnnotation) {
        longitude = (constraintAnnotation.value());
    }

    @Override
    public boolean isValid(Double s, ConstraintValidatorContext constraintValidatorContext) {
        return !(s.equals(longitude) || (s.equals("0.0")));
    }
}
