package blob_open_liskov.src.factories;

import blob_open_liskov.src.interfaces.Attack;
import blob_open_liskov.src.interfaces.Factory;
import blob_open_liskov.src.models.attacks.Bloplode;
import blob_open_liskov.src.models.attacks.PutridFart;

public class AttackFactory<T extends Attack> implements Factory<Attack>{

    //todo mit Reflexion zu tun
    //wie implementiert

    public static Attack createUnit(String[] args) {
        if(args[5].equals("PutridFart")){
            return new PutridFart();
        }else{
            return new Bloplode();
        }
    }
}
