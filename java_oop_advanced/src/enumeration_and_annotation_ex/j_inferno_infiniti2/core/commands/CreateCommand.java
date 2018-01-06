package enumeration_and_annotation_ex.j_inferno_infiniti2.core.commands;

import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api.Weapon;
import enumeration_and_annotation_ex.j_inferno_infiniti2.factories.WeaponsFactory;

public class CreateCommand extends BaseCommand {

    @Override
    public String execute() {
        Weapon weapon = null;
        switch (super.getParams()[0]){
            case "AXE":
                weapon = WeaponsFactory.CreateAxeWeapon(super.getParams()[1]);
            break;
            case "SWORD":
                weapon = WeaponsFactory.CreateSwordWeapon(super.getParams()[1]);
                break;
            case "KNIFE":
                weapon = WeaponsFactory.CreateSwordWeapon(super.getParams()[1]);
                break;
        }
        super.getWeaponRepository().add(weapon);
        return null;
    }
}
