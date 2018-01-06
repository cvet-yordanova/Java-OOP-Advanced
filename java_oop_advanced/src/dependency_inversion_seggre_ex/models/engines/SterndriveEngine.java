package dependency_inversion_seggre_ex.models.engines;

import dependency_inversion_seggre_ex.contracts.Modelable;

public class SterndriveEngine extends BaseBoatEngine  {

    public static final int MULTIPLIER = 7;

    public SterndriveEngine(String model, int horsePower, int displacement) {
        super(model, horsePower, displacement);
    }
    @Override
    protected int calculateCachedOutput(int horsePower, int displacement) {
        return (horsePower * MULTIPLIER) * displacement;
    }
}
