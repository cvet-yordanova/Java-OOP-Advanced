package enumeration_and_annotation_ex.f_custom_enum_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Suit {


    String type() default "Enumeration";
    String category() default "Suit";
    String description() default "Provides suit constants for a Card class.";

}
