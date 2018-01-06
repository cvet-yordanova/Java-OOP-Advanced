package interface_seggreg_dependency_inversion_lab.src.p04_recharge;

public class RobotAdapter extends Robot implements Rechargeable{
    public RobotAdapter(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void recharge() {

    }
}
