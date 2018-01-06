package enumeration_and_annotation_ex.f_custom_enum_annotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String classInput = reader.readLine();
        if(classInput.equalsIgnoreCase("Rank")){
           Rank annotation =  RankE.class.getAnnotation(Rank.class);
            System.out.println(String.format("Type = %s, Description = %s", annotation.type(), annotation.description()));
        }else{
            Class suit = SuitE.class;
            Suit annotation =  SuitE.class.getAnnotation(Suit.class);
            System.out.println(String.format("Type = %s, Description = %s", annotation.type(), annotation.description()));
        }
    }
}
