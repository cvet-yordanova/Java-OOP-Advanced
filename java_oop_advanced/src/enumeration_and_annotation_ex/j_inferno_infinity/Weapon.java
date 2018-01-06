package enumeration_and_annotation_ex.j_inferno_infinity;

import enumeration_and_annotation_ex.j_inferno_infiniti2.enumerations.GemTypes;

public abstract class Weapon {
    private String name;
    private int minDamage;
    private int maxDamage;
    private Gem[] sockets;
    private int strength;
    private int agility;
    private int vitality;

    public Weapon(String name, int minDamage, int maxDamage, int strength, int agility, int vitality) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.setSockets(1);
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
    }

    protected void setSockets(Integer size){
        this.sockets =  new Gem[size];
    };

    protected Gem[] getSockets() {
        return sockets;
    }

    public void insertGem(Gem gem, Integer ind){
        if(ind >= 0 && ind <= this.sockets.length - 1){
            this.sockets[ind] = gem;
            this.strength += gem.getBonusStrength();
            this.agility += gem.getBonusAgility();
            this.vitality += gem.getBonusVitality();

//            this.minDamage += gem.getBonusStrength() * 2 + gem.getBonusAgility() * 1;
//            this.maxDamage += gem.getBonusStrength() * 3 + gem.getBonusAgility() * 4;

        }
    }

    public void removeGem(Integer ind){
        if(ind >= 0 && ind <= this.sockets.length - 1){
           if(this.sockets[ind] != null){
               Gem gem = this.sockets[ind];

               this.strength -= gem.getBonusStrength();
               this.agility -= gem.getBonusAgility();
               this.vitality -= gem.getBonusVitality();

//               this.minDamage -= gem.getBonusStrength() * 2 + gem.getBonusAgility();
//               this.maxDamage -= gem.getBonusStrength() * 3 + gem.getBonusAgility() * 4;

               this.sockets[ind] = null;

           }
        }
    }

    @Override
    public String toString() {

        for (Gem gem : this.sockets) {
            strength += gem.getBonusStrength();
            agility += gem.getBonusAgility();
            vitality += gem.getBonusVitality();
        }

        minDamage += (strength * 2) + (agility * 3);
        maxDamage += (strength * 3) + (agility * 4);

        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.name,
                this.minDamage,
                this.maxDamage,
                this.strength,
                this.agility,
                this.vitality);
    }
}
