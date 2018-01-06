package interfaces_exc.h_military_elite.factories;

import interfaces_exc.h_military_elite.entities.IPrivate;
import interfaces_exc.h_military_elite.entities.Private;

public class PrivateFactory {

    public static IPrivate createPrivate(String[] info){
        Integer id = Integer.parseInt(info[1]);
        String firstName = info[2];
        String lastName = info[3];
        Double salary = Double.parseDouble(info[4]);

        return new Private(id, firstName, lastName, salary);
    }
}
