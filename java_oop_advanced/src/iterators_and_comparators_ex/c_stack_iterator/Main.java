package iterators_and_comparators_ex.c_stack_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

import static java.util.Arrays.copyOfRange;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack stack = new CustomStack();

        String line;

        while(!(line = reader.readLine()).equalsIgnoreCase("END")){
            String[] command = line.replaceAll(",","").split("\\s+");

            switch (command[0]){
                case "Push":
                    if(command.length > 1){
                       stack.push(copyOfRange(command, 1, command.length));
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    }catch (IllegalStateException ise) {
                        System.out.println(ise.getMessage());
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(true){
            if(stack.getStack().size() == 0) break;

            Integer element = stack.pop();
            sb.append(element).append(System.lineSeparator());
        }

        System.out.println(sb.toString().trim());
        System.out.println(sb.toString().trim());
    }
}
