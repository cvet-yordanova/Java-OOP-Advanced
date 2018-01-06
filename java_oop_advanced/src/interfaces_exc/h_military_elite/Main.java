package interfaces_exc.h_military_elite;

import interfaces_exc.h_military_elite.entities.IPrivate;
import interfaces_exc.h_military_elite.entities.ISoldier;
import interfaces_exc.h_military_elite.entities.ISpy;
import interfaces_exc.h_military_elite.factories.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, ISoldier> soldiers  = new LinkedHashMap<>();
        Map<Integer, IPrivate> iPrivates = new LinkedHashMap<>();
        String line = reader.readLine();

        while(!line.equalsIgnoreCase("End")){
            String[] command = line.split("\\s+");

            switch (command[0]){
                case "Private":
                    IPrivate newPrivate = PrivateFactory.createPrivate(command);
                    soldiers.putIfAbsent(newPrivate.getId(), newPrivate);
                    iPrivates.putIfAbsent(newPrivate.getId(), newPrivate);
                    break;
                case "LeutenantGeneral":
                    IPrivate newLeutenant = LeutenantGeneralFactory.createLeutenantGeneral(command, iPrivates);
                    soldiers.putIfAbsent(newLeutenant.getId(), newLeutenant);
                    break;

                case "Engineer":
                    IPrivate newEngeneer = EngineerFactory.createEngeneer(command);

                    if(newEngeneer != null){
                        soldiers.putIfAbsent(newEngeneer.getId(),newEngeneer);
                    }

                    break;
                case "Commando":
                    IPrivate newCommando = CommandoFactory.createCommando(command);

                    if(newCommando != null){
                        soldiers.putIfAbsent(newCommando.getId(),newCommando);
                    }
                    break;
                case "Spy":
                    ISpy newSpy = SpyFactory.createSpy(command);
                    soldiers.putIfAbsent(newSpy.getId(), newSpy);
                    break;
            }

            line = reader.readLine();
        }

        for (ISoldier iSoldier : soldiers.values()) {
            System.out.println(iSoldier);
        }

    }
}
