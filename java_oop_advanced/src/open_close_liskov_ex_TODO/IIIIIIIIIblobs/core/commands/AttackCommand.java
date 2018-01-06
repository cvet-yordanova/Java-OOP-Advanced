package open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.commands;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.BaseCommand;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;

public class AttackCommand extends BaseCommand {

    @Override
    public String execute() {
        if (super.getBlobRepository().findByName(super.getParams().get(0)) != null && super.getBlobRepository().findByName(super.getParams().get(1)) != null) {
            Blob attacker = super.getBlobRepository().findByName(super.getParams().get(0));
            Blob target = super.getBlobRepository().findByName(super.getParams().get(1));

            attacker.attack(target);
        }

        return null;
    }
}
