package dependency_inversion_seggre_ex;

import dependency_inversion_seggre_ex.contracts.*;
import dependency_inversion_seggre_ex.contracts.Runnable;
import dependency_inversion_seggre_ex.controllers.BoatSimulatorControllerImpl;
import dependency_inversion_seggre_ex.core.CommandHandlerImpl;
import dependency_inversion_seggre_ex.engine.Engine;
import dependency_inversion_seggre_ex.database.BoatEngineRepository;
import dependency_inversion_seggre_ex.database.BoatRepository;
import dependency_inversion_seggre_ex.database.BoatSimulatorDatabase;
import dependency_inversion_seggre_ex.io.ConsoleReader;
import dependency_inversion_seggre_ex.io.ConsoleWriter;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        CrudRepository<Boat> boatCrudRepository = new BoatRepository<>();
        CrudRepository<BoatEngine> boatEngineCrudRepository = new BoatEngineRepository();
        Database database = new BoatSimulatorDatabase(boatCrudRepository, boatEngineCrudRepository);

        BoatSimulatorController controller = new BoatSimulatorControllerImpl(database);

        CommandHandler handler = new CommandHandlerImpl(controller);
        Runnable engine = new Engine(reader, writer, handler);

        engine.run();


    }
}
