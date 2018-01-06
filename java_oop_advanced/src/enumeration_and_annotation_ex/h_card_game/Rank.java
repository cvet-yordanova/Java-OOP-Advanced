package enumeration_and_annotation_ex.h_card_game;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Rank {

    String type() default "Enumeration";
    String category() default  "Rank";
    String description() default "Provides rank constants for a Card class.";


}
