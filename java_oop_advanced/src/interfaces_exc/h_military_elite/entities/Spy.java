package interfaces_exc.h_military_elite.entities;

public class Spy implements ISpy{

    private Integer id;
    private String firstName;
    private String lastName;
    private String codeNumber;

    public Spy(Integer id, String firstName, String lastName, String codeNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.codeNumber = codeNumber;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d\n" +
                "Code Number: %s",this.firstName, this.lastName, this.id, this.codeNumber);
    }
}
