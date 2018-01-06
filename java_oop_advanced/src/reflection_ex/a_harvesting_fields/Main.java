package reflection_ex.a_harvesting_fields;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    private static final String PRINT_PATTERN = "%s %s %s";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class harvestClass = RichSoilLand.class;

        Field[] publicFields = harvestClass.getFields();
        Field[]   allFields = harvestClass.getDeclaredFields();

        String line;

        while(!(line = reader.readLine()).equalsIgnoreCase("harvest")){

            switch (line){
                case "public":
                    printPublicFields(publicFields);
                    break;
                case "private":
                    printPrivateFields(allFields);
                    break;
                case "protected":
                    printProtectedFields(allFields);
                    break;
                case "all":
                    printAllFields(allFields);
                    break;
            }
        }

    }

    private static void printPublicFields(Field[] fields) {
        for (Field field : fields) {
            System.out.println(String.format(PRINT_PATTERN, field.getModifiers() == Modifier.PUBLIC ? "public" : "Else", field.getType().getSimpleName(), field.getName()));
        }
    }

    public static void printPrivateFields(Field[] fields) {

        for (Field field : fields) {
            if(Modifier.isPrivate(field.getModifiers())) {
                System.out.println(String.format(PRINT_PATTERN, field.getModifiers() == Modifier.PRIVATE ? "private" : "Else", field.getType().getSimpleName(), field.getName()));
            }
        }
    }

    public static void printProtectedFields(Field[] fields) {

        for (Field field : fields) {
            if(Modifier.isProtected(field.getModifiers())) {
                System.out.println(String.format(PRINT_PATTERN, field.getModifiers() == Modifier.PROTECTED ? "protected" : "Else", field.getType().getSimpleName(), field.getName()));
            }
        }
    }

    public static void printAllFields(Field[] fields) {
        for (Field field : fields) {
            String modifier = field.getModifiers() == Modifier.PRIVATE ? "private" : (field.getModifiers() == Modifier.PROTECTED ? "protected" : "public");
            System.out.println(String.format(PRINT_PATTERN, modifier , field.getType().getSimpleName(), field.getName()));
        }
    }




}
