package ru.scarlet.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LongitudeValidator.class)
public @interface CheckFields {

    String value() default "0.0";
    String message() default  "must not be default value (0.0)";

    public Class<?>[] groups() default  {};
    public  Class<? extends Payload>[] payload() default  {};
}
