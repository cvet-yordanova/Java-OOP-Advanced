package b_reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter( method -> method.getName().startsWith("get"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " will return " + m.getReturnType()));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter( method -> method.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " and will set field of " + m.getParameterTypes()[0]));

    }
}
