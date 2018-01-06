package enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl;

import enumeration_and_annotation_ex.j_inferno_infiniti2.enumerations.WeaponTypes;

public class Sword extends BaseWeapon {
    public Sword(String name) {
        super(name, WeaponTypes.SWORD.getMinDamage(), WeaponTypes.SWORD.getMaxDamage(), WeaponTypes.SWORD.getSockets());
    }
}
