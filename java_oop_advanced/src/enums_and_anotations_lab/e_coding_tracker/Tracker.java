package enums_and_anotations_lab.e_coding_tracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {

    private static Map<String, List<String>> map = new HashMap<>();
    @Author(name="Pesho")
    public void run(){

    }

    @Author(name="Pesho")
    public static void printMethodsByAuthor(Class<?> cl){
      //  Class myClass = cl.getClass();
        Method[] arr = cl.getDeclaredMethods();

        for (Method method : arr) {
            Author annotation = method.getAnnotation(Author.class);

            if(annotation != null){
                String methodName = method.getName() + "()";
                String annotationValue = annotation.name();
                map.putIfAbsent(annotationValue, new ArrayList<>());
                map.get(annotationValue).add(methodName);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            System.out.println(stringListEntry.getKey() + ": "+ String.join(", ", stringListEntry.getValue()));

        }

    }
}
