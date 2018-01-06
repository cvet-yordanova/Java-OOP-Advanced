package enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.impl;

import enumeration_and_annotation_ex.j_inferno_infiniti2.constracts.api.Weapon;
import enumeration_and_annotation_ex.j_inferno_infiniti2.enumerations.GemTypes;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class BaseWeapon implements Weapon {
    private String name;
    private int minDamage;
    private int maxDamage;
    private int maxSockets;
    private GemTypes[] gems;
    private int bonusStrength;
    private int bonusAgility;
    private int bonusVitality;

    protected BaseWeapon(String name, int minDamage, int maxDamage, int maxSockets) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.maxSockets = maxSockets;
        this.bonusStrength = 0;
        this.bonusAgility = 0;
        this.bonusVitality = 0;
        this.gems = new GemTypes[this.maxSockets];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addGem(String gemType, Integer ind){
        if(ind < 0 || ind >= this.gems.length && !Arrays.stream(GemTypes.values()).map(GemTypes::name).collect(Collectors.toList()).contains(gemType.toUpperCase())){
            return;
        }

        this.gems[ind] = GemTypes.valueOf(gemType.toUpperCase());
    }

    @Override
    public void removeGem(Integer ind){

        if(ind < 0 || ind >= this.gems.length || this.gems[ind] == null){
            return;
        }

        this.gems[ind] = null;
    }



    @Override
    public String toString() {

        int strength = 0;
        int agility = 0;
        int vitality = 0;
        int minDamage = this.minDamage;
        int maxDamage = this.maxDamage;


        for (GemTypes gem : this.gems) {
            strength += gem.getStrength();
            agility += gem.getAgility();
            vitality += gem.getVitality();
        }

        minDamage += (strength * 2) + (agility * 3);
        maxDamage += (strength * 3) + (agility * 4);

        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%dVitality", this.name, minDamage, maxDamage, strength, agility, vitality );
    }
}
