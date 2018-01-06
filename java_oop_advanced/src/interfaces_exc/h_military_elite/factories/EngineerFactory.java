package interfaces_exc.h_military_elite.factories;

import interfaces_exc.h_military_elite.entities.Engineer;
import interfaces_exc.h_military_elite.entities.IPrivate;
import interfaces_exc.h_military_elite.entities.IRepair;
import interfaces_exc.h_military_elite.entities.Repair;

import java.util.ArrayList;
import java.util.List;

public class EngineerFactory {

    public static IPrivate createEngeneer(String[] info){
        Integer id = Integer.parseInt(info[1]);
        String firstName = info[2];
        String lastName = info[3];
        Double salary = Double.parseDouble(info[4]);
        String corps = info[5];

        List<IRepair> repairs = new ArrayList<>();

        for (int i = 6; i < info.length; i+=2) {
            String repairPart = info[i];
            Integer  hours = Integer.parseInt(info[i+1]);

            Repair repair = new Repair(repairPart, hours);
            repairs.add(repair);

        }

        IPrivate iPrivate = new Engineer(id, firstName, lastName, salary, corps, repairs);

        if(corps.equals("Airforces") || corps.equals("Marines")){
            return iPrivate;
        }else{
            return null;
        }
    }
}
