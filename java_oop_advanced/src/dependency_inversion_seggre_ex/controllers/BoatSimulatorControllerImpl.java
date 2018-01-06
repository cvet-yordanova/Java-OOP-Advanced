package dependency_inversion_seggre_ex.controllers;


import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.contracts.Boat;
import dependency_inversion_seggre_ex.contracts.BoatEngine;
import dependency_inversion_seggre_ex.contracts.Database;
import dependency_inversion_seggre_ex.contracts.Race;
import dependency_inversion_seggre_ex.exeptions.*;
import dependency_inversion_seggre_ex.factories.BoatEngineFactory;
import dependency_inversion_seggre_ex.factories.BoatFactory;
import dependency_inversion_seggre_ex.factories.RaceFactory;
import dependency_inversion_seggre_ex.models.RaceImpl;

import java.util.*;

public class BoatSimulatorControllerImpl implements dependency_inversion_seggre_ex.contracts.BoatSimulatorController {
    private LinkedHashMap<Double, Boat> map;
    private Database database;
    private Race currentRace;

    public BoatSimulatorControllerImpl(Database database) {
        this.database = database;
    }

    @Override
    public String createBoatEngine(String model, int horsepower, int displacement, String engineType) throws DuplicateModelException {
        BoatEngine engine = null;
        switch (engineType) {
            case "Jet":
                engine = BoatEngineFactory.createJetEngine(model, horsepower, displacement);
                break;
            case "Sterndrive":
                engine = BoatEngineFactory.createJetEngine(model, horsepower, displacement);
                break;
        }

        this.database.getEngines().add(engine);
        return String.format(
                "Engine model %s with %s HP and displacement %s cm3 created successfully.",
                model,
                horsepower,
                displacement);
    }

    @Override
    public String createRowBoat(String model, int weight, int oars) throws DuplicateModelException {
        Boat boat = BoatFactory.createRowBoat(model, weight, oars);
        this.database.getBoats().add(boat);
        return String.format("Row boat with model %s registered successfully.", model);
    }


    @Override
    public String createSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException {
        Boat boat = BoatFactory.createSailBoat(model, weight, sailEfficiency);
        this.database.getBoats().add(boat);
        return String.format("Sail boat with model %s registered successfully.", model);
    }

    @Override
    public String createPowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel) throws NonExistantModelException, DuplicateModelException {
        BoatEngine firstEngine = this.database.getEngines().findByModel(firstEngineModel);
        BoatEngine secondEngine = this.database.getEngines().findByModel(secondEngineModel);
        Boat boat = BoatFactory.createPowerBoat(model, weight, firstEngine, secondEngine);
        this.database.getBoats().add(boat);
        return String.format("Power boat with model %s registered successfully.", model);
    }

    @Override
    public String createYacht(String model, int weight, String engineModel, int cargoWeight) throws NonExistantModelException, DuplicateModelException {
        BoatEngine engine = this.database.getEngines().findByModel(engineModel);
        Boat boat = BoatFactory.createYacht(model, weight, engine, cargoWeight);
        this.database.getBoats().add(boat);
        return String.format("Yacht with model %s registered successfully.", model);
    }

    @Override
    public String openRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats) throws RaceAlreadyExistsException {
        Race race = RaceFactory.createRace(distance, windSpeed, oceanCurrentSpeed, allowsMotorboats);
        this.validateRaceIsEmpty();
        this.currentRace = race;
        return
                String.format(
                        "A new race with distance %s meters, wind speed %s m/s and ocean current speed %s m/s has been set.",
                        distance, windSpeed, oceanCurrentSpeed);
    }

    @Override
    public String signUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException {
        Boat boat = this.database.getBoats().findByModel(model);
        if (!this.currentRace.getAllowsMotorboats() && boat.hasEngine()) {
            throw new IllegalArgumentException(Constants.IncorrectBoatTypeMessage);
        }
        this.currentRace.addParticipant(boat);
        return String.format("Boat with model %s has signed up for the current Race.", model);
    }

    @Override
    public String startRace() throws InsufficientContestantsException, NoSetRaceException {
                this.validateRaceIsSet();
        List<Boat> participants = this.currentRace.getParticipants();
        if (participants.size() < 3) {
            throw new InsufficientContestantsException(Constants.InsufficientContestantsMessage);
        }


        for (int i = 0; i < 3; i++) {
            findFastest(participants);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Double, Boat> doubleMotorBoatEntry : map.entrySet()) {
            result.append(String.format("First place: %s Model: %s Time: %s",
                    doubleMotorBoatEntry.getValue().getClass().getSimpleName().toString(),
                    doubleMotorBoatEntry.getValue().getModel(),
                    isFinished(doubleMotorBoatEntry.getKey())));
        }

        this.currentRace = null;

        return result.toString();
    }

    @Override
    public String getStatistic() {
        return null;
    }

    private String isFinished(Double key) {
        if (key == Double.NEGATIVE_INFINITY) {
            return "Did not finish!";
        }
        return String.format("%f.2 sec", key);
    }

   private void findFastest(List<Boat> participants) {
       Double bestTime = 0.0;
       Boat winner = null;
       for (Boat participant : participants) {
           Double speed = participant.calculateRaceSpeed(this.currentRace);
           Double time = this.currentRace.getDistance() / speed;
           if (time < bestTime) {
               bestTime = time;
               winner = participant;
           }
       }
       map.put(bestTime, winner);
       participants.remove(winner);
   }
   private void validateRaceIsSet() throws NoSetRaceException {
        if (this.currentRace == null) {
            throw new NoSetRaceException(Constants.NoSetRaceMessage);
        }
    }

    private void validateRaceIsEmpty() throws RaceAlreadyExistsException {
        if (this.currentRace != null) {
            throw new RaceAlreadyExistsException(Constants.RaceAlreadyExistsMessage);
        }
    }
}
