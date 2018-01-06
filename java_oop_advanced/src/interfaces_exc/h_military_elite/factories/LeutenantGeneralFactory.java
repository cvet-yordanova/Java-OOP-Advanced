package interfaces_exc.h_military_elite.factories;

import interfaces_exc.h_military_elite.entities.IPrivate;
import interfaces_exc.h_military_elite.entities.ISoldier;
import interfaces_exc.h_military_elite.entities.LeutenantGeneral;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LeutenantGeneralFactory {

    public static IPrivate createLeutenantGeneral(String[] info, Map<Integer, IPrivate> iprivates) {
        Integer id = Integer.parseInt(info[1]);
        String firstName = info[2];
        String lastName = info[3];
        Double salary = Double.parseDouble(info[4]);

        List<IPrivate> privates = new ArrayList<>();

        for (int i = 5; i < info.length; i++) {
            Integer currentId = Integer.parseInt(info[i]);

            if(iprivates.containsKey(currentId)){
                privates.add(iprivates.get(currentId));
            }
        }

        IPrivate newLeutenant = new LeutenantGeneral(id, firstName, lastName, salary, privates);

        return newLeutenant;

    }
}
