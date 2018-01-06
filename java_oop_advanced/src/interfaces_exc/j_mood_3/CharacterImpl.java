package interfaces_exc.j_mood_3;

import java.text.DecimalFormat;

public class CharacterImpl implements Character{

    private String username;
    private String hashedPassword;
    private Integer level;
    private Double specialPoints;

    public CharacterImpl(String username, Integer level, Double specialPoints) {
        this.username = username;
        this.setHashedPassword(hashedPassword);
        this.level = level;
        this.setSpecialPoints(specialPoints);
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setSpecialPoints(Double specialPoints) {
        this.specialPoints = specialPoints;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public Double getSpecialPoints() {
        return this.specialPoints;
    }

    @Override
    public String toString() {
        DecimalFormat dm = new DecimalFormat("#####.#####");
        return String.format("\"%s\" | \"%s\" -> %s\n",
                this.username, this.hashedPassword, this.getClass().getSimpleName());

    }
}
