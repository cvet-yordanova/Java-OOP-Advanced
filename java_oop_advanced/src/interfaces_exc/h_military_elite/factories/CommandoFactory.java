package interfaces_exc.h_military_elite.factories;

import interfaces_exc.h_military_elite.entities.Commando;
import interfaces_exc.h_military_elite.entities.IMission;
import interfaces_exc.h_military_elite.entities.IPrivate;
import interfaces_exc.h_military_elite.entities.Mission;

import java.util.ArrayList;
import java.util.List;

public class CommandoFactory {
    public static IPrivate createCommando(String[] info){
        Integer id = Integer.parseInt(info[1]);
        String firstName = info[2];
        String lastName = info[3];
        Double salary = Double.parseDouble(info[4]);
        String corps = info[5];

        List<IMission> missions = new ArrayList<>();

        for (int i = 6; i < info.length; i+=2) {
            String missionCode = info[i];
            String missionState = info[i+1];

            if(missionState.equals("inProgress") || missionState.equals("Finished")){
                IMission newMission = new Mission(missionCode, missionState);

                missions.add(newMission);
            }

        }

        IPrivate iPrivate = new Commando(id, firstName, lastName, salary, corps, missions);

        if(corps.equals("Airforces") || corps.equals("Marines")){
            return iPrivate;
        }else{
            return null;
        }
    }
}
