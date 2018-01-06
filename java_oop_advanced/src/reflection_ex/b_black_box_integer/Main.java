package reflection_ex.b_black_box_integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        Constructor ctor = PeshoslavClass.class.getCon

        Class pesho = PeshoslavClass.class;
        Constructor ctor = pesho.getDeclaredConstructor();
        ctor.setAccessible(true);
        PeshoslavClass obj = (PeshoslavClass) ctor.newInstance();

        String line;

        while(!(line = reader.readLine()).equalsIgnoreCase("end")){
            String[] info = line.split("_");

            Method method = null;

            switch (info[0]){
                case "add":
                    method = obj.getClass().getDeclaredMethod("add", int.class);
                    method.setAccessible(true);
                    method.invoke(obj, Integer.parseInt(info[1]));
                    printResult(obj);
                    break;
                case "subtract":
                    method = obj.getClass().getDeclaredMethod("subtract", int.class);
                    method.setAccessible(true);
                    method.invoke(obj, Integer.parseInt(info[1]));
                    printResult(obj);
                    break;
                case "divide":
                    method = obj.getClass().getDeclaredMethod("divide", int.class);
                    method.setAccessible(true);
                    method.invoke(obj, Integer.parseInt(info[1]));
                    printResult(obj);
                    break;
                case "multiply":
                    method = obj.getClass().getDeclaredMethod("multiply", int.class);
                    method.setAccessible(true);
                    method.invoke(obj, Integer.parseInt(info[1]));
                    printResult(obj);
                    break;
                case "rightShift":
                    method = obj.getClass().getDeclaredMethod("rightShift", int.class);
                    method.setAccessible(true);
                    method.invoke(obj, Integer.parseInt(info[1]));
                    printResult(obj);
                    break;
                case "leftShift":
                    method = obj.getClass().getDeclaredMethod("leftShift", int.class);
                    method.setAccessible(true);
                    method.invoke(obj, Integer.parseInt(info[1]));
                    printResult(obj);
                    break;
            }
        }

    }

    private static void printResult(PeshoslavClass obj) throws NoSuchFieldException, IllegalAccessException {
        Field field = obj.getClass().getDeclaredField("innerValue");
        field.setAccessible(true);
        System.out.println(field.get(obj));
    }
}
