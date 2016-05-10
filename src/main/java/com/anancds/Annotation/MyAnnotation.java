package com.anancds.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.METHOD, ElementType.TYPE})
public @interface MyAnnotation {
    String color();

    String value() default "";

    int[] array() default {1, 2, 3};

    Gender gender() default Gender.MAN;

    MetaAnnotation metaAnnotation() default @MetaAnnotation(birthday = "1988-2-18");

}
