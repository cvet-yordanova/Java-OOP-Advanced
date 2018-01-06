package enumeration_and_annotation_ex.j_inferno_infiniti2.repositories;

import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api.Weapon;

import java.util.HashMap;
import java.util.Map;

public class WeaponRepository<T extends Weapon> implements Repository<Weapon> {
    private Map<String, Weapon> weapons;

    public WeaponRepository() {
        this.weapons = new HashMap<>();
    }

    public Map<String, Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public void add(Weapon weapon) {
        this.weapons.putIfAbsent(weapon.getName(), weapon);
    }
}
