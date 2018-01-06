package enumeration_and_annotation_ex.j_inferno_infiniti2.core.commands;

import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api.Weapon;
import enumeration_and_annotation_ex.j_inferno_infiniti2.repositories.Repository;

public abstract class BaseCommand implements Command{
    private String[] params;
    private Repository<Weapon> weaponRepository;

    public BaseCommand() {
    }

    public String[] getParams() {
        return this.params;
    }

    public Repository<Weapon> getWeaponRepository() {
        return weaponRepository;
    }
}
