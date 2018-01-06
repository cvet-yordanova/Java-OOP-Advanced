package enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl;

import enumeration_and_annotation_ex.j_inferno_infiniti2.enumerations.WeaponTypes;

public class Axe extends BaseWeapon {
    public Axe(String name) {
        super(name, WeaponTypes.AXE.getMinDamage(), WeaponTypes.AXE.getMaxDamage(), WeaponTypes.AXE.getSockets());
    }
}
