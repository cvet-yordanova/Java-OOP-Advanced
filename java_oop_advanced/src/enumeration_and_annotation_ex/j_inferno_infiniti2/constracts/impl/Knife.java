package enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl;

import enumeration_and_annotation_ex.j_inferno_infiniti2.enumerations.WeaponTypes;

public class Knife extends BaseWeapon {
    public Knife(String name) {
        super(name, WeaponTypes.KNIFE.getMinDamage(), WeaponTypes.KNIFE.getMaxDamage(), WeaponTypes.KNIFE.getSockets());
    }
}
