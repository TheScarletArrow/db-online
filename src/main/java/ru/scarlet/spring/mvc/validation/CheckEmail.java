package ru.scarlet.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckValidator.class)
public @interface CheckEmail {

    String value() default "xyz.com";
    String message() default "must end with xyz.com";

    public Class<?>[] groups() default {};
    public  Class<? extends Payload>[] payload() default  {};

}
