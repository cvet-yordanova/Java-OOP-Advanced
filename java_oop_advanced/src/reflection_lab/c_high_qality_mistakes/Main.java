package reflection_lab.c_high_qality_mistakes;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Arrays.stream(Reflection.class.getDeclaredFields())
                .filter( field -> !Modifier.isPrivate(field.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
        .forEach(f -> System.out.println(f.getName() + " must be private!"));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter( method -> method.getName().startsWith("get"))
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " have to be public!"));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter( method -> method.getName().startsWith("set"))
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " have to be private!"));

    }
}
