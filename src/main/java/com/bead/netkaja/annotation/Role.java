package com.bead.netkaja.annotation;

import com.bead.netkaja.model.Customer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Role {
    Customer.Role[] value() default {Customer.Role.CUSTOMER};
}
