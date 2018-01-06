package dependency_inversion_seggre_ex.models;

import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.Utility.Validator;
import dependency_inversion_seggre_ex.contracts.Boat;
import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;

import java.util.*;

public class RaceImpl implements dependency_inversion_seggre_ex.contracts.Race {
    private int distance;
    private int windSpeed;
    private int oceanCurrentSpeed;
    private Map<String, Boat> registeredBoats;
    private boolean allowsMotorBoats;

    public RaceImpl(int distance, int windSpeed, int oceanCurrentSpeed, boolean allowsMotorBoats) {
        this.setDistance(distance);
        this.windSpeed = windSpeed;
        this.oceanCurrentSpeed = oceanCurrentSpeed;
        this.allowsMotorBoats = allowsMotorBoats;
        this.registeredBoats = new LinkedHashMap<>();
    }

    @Override
    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        Validator.ValidatePropertyValue(distance, "Distance");
        this.distance = distance;
    }

    @Override
    public int getWindSpeed() {
        return windSpeed;
    }
    public int getOceanCurrentSpeed() {
        return oceanCurrentSpeed;
    }

    @Override
    public boolean getAllowsMotorboats() {
        return allowsMotorBoats;
    }

    private void setAllowsMotorBoats(Boolean allowsMotorBoats) {
        this.allowsMotorBoats = allowsMotorBoats;
    }

    @Override
    public void addParticipant(Boat boat) throws DuplicateModelException {
        if (this.registeredBoats.containsKey(boat.getModel())) {
            throw new DuplicateModelException(Constants.DuplicateModelMessage);
        }
        this.registeredBoats.put(boat.getModel(), boat);
    }

    public List<Boat> getParticipants() {
        return new ArrayList<>(this.registeredBoats.values());
    }
}