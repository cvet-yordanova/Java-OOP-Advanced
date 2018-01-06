package interface_seggreg_dependency_inversion_lab.src.to_to_2_00;

public class KeyCardCheck extends SecurityCheck implements KeyCardUi{

    private PinCodeUi securityUI;

    public KeyCardCheck(PinCodeUi securityUI) {
        this.securityUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        String code = securityUI.requestKeyCard();
        if (isValid(code)) {
            return true;
        }

        return false;
    }

    private boolean isValid(String code) {
        return true;
    }

    @Override
    public String requestKeyCard() {
        return "enter your pin code";
    }
}
