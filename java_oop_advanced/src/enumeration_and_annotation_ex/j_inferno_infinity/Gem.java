package enumeration_and_annotation_ex.j_inferno_infinity;

public abstract class Gem {
    private int bonusStrength;
    private int bonusAgility;
    private int bonusVitality;

    public Gem(int bonusStrength, int bonusAgility, int bonusVitality) {
        this.bonusStrength = bonusStrength;
        this.bonusAgility = bonusAgility;
        this.bonusVitality = bonusVitality;
    }

    public int getBonusStrength() {
        return bonusStrength;
    }

    public int getBonusAgility() {
        return bonusAgility;
    }

    public int getBonusVitality() {
        return bonusVitality;
    }
}
