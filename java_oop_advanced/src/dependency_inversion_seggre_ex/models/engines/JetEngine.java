package dependency_inversion_seggre_ex.models.engines;

public class JetEngine extends BaseBoatEngine
{
    private static final int MULTIPLIER = 5;

    public JetEngine(String model, int horsePower, int displacement) {
        super(model, horsePower, displacement);
    }

    @Override
    protected int calculateCachedOutput(int horsePower, int displacement) {
        return (horsePower * MULTIPLIER * displacement);
    }
}
