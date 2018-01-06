package enumeration_and_annotation_ex.j_inferno_infiniti2.engine;


import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api.Weapon;
import enumeration_and_annotation_ex.j_inferno_infiniti2.repositories.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Engine implements Runnable {

    private static final String TERMINATE_COMMAND = "END";
    private static final String COMMAND_CLASS_PATH = "";

    private String params[];
    private Repository<Weapon> weaponRepository;
    private BufferedReader reader;

    public Engine(Repository<Weapon> weaponRepository, BufferedReader reader) {
        this.weaponRepository = weaponRepository;
        this.reader = reader;
    }

    @Override
    public void run() {
        while(true){
            List<String> tokens = null;
            try {
                tokens = new ArrayList<>(Arrays.asList(this.reader.readLine().split("\\s+")));
            } catch (IOException e) {
                e.printStackTrace();
            }


            if(TERMINATE_COMMAND.equalsIgnoreCase(tokens.get(0))){
                break;
            }


        }



    }
}
