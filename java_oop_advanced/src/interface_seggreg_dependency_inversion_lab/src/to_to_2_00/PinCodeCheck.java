package interface_seggreg_dependency_inversion_lab.src.to_to_2_00;

public class PinCodeCheck extends SecurityCheck implements PinCodeUi{

    private PinCodeUi securityUI;

    public PinCodeCheck(PinCodeUi securityUI) {
        this.securityUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        int pin = securityUI.requestPinCode();
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return true;
    }

    @Override
    public String requestKeyCard() {
        return "slide your key card";
    }

    @Override
    public int requestPinCode() {
        return 0;
    }
}
