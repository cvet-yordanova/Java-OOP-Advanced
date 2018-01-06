package interfaces_exc.j_mood_3;

public class Archangel extends CharacterImpl{
    private Double mana;

    public Archangel(String username, Integer level, Double specialPoints) {
        super(username, level, specialPoints);
    }

    @Override
    public Double getSpecialPoints() {
        return this.mana;
    }

    @Override
    public void setSpecialPoints(Double specialPoints) {
        this.mana = specialPoints;
    }

    @Override
    public void setHashedPassword(String hashedPassword) {
        StringBuilder sb = new StringBuilder();

        String username = super.getUsername();

        for (int i = username.length() - 1; i >= 0; i--) {
            sb.append(username.charAt(i));
        }

        Integer add = username.length() * 21;

        sb.append(add.toString());
        super.setHashedPassword(sb.toString());

    }

    @Override
    public String toString() {
        return super.toString()+String.format("%.0f",super.getLevel() * this.mana);
    }
}
