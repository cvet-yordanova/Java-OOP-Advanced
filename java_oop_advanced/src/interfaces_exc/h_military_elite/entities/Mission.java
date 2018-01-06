package interfaces_exc.h_military_elite.entities;

public class Mission implements IMission{

    private String codeName;
    private String status;

    public Mission(String codeName, String status) {
        this.codeName = codeName;
        this.status = status;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void completeMission() {

    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.status);
    }
}
