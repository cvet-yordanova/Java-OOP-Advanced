package enumeration_and_annotation_ex.j_inferno_infiniti2.factories;


import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api.Weapon;
import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl.Axe;
import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl.Knife;
import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl.Sword;

public final class WeaponsFactory {
    private WeaponsFactory(){

    }

    public static Weapon CreateAxeWeapon(String name){
        return new Axe(name);
    }
    public static Weapon CreateSwordWeapon(String name){
        return new Sword(name);
    }
    public static Weapon CreateKnifeWeapon(String name){
        return new Knife(name);
    }
}
