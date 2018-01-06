package interfaces_exc.j_mood_3;

public class Demon extends CharacterImpl{

    private Double energy;

    public Demon(String username, Integer level, Double specialPoints) {
        super(username, level, specialPoints);
    }

    @Override
    public void setHashedPassword(String hashedPassword) {
        Integer newPass = super.getUsername().length() * 217;
        super.setHashedPassword(newPass.toString());
    }

    @Override
    public Double getSpecialPoints() {
        return this.energy;
    }

    @Override
    public void setSpecialPoints(Double energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return super.toString()+super.getLevel() * this.energy;
    }
}
