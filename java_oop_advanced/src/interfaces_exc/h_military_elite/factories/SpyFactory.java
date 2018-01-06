package interfaces_exc.h_military_elite.factories;

import interfaces_exc.h_military_elite.entities.IPrivate;
import interfaces_exc.h_military_elite.entities.ISpy;
import interfaces_exc.h_military_elite.entities.Spy;

public class SpyFactory {
    public static ISpy createSpy(String[] info){
        Integer id = Integer.parseInt(info[1]);
        String firstName = info[2];
        String lastName = info[3];
        String codeNumber = info[4];

        ISpy spy = new Spy(id, firstName, lastName, codeNumber);

        return spy;
    }
}
