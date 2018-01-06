package dependency_inversion_seggre_ex.core;

import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.annotations.Inject;
import dependency_inversion_seggre_ex.contracts.BoatSimulatorController;
import dependency_inversion_seggre_ex.contracts.Executable;
import dependency_inversion_seggre_ex.enumeration.EngineType;
import dependency_inversion_seggre_ex.exeptions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CommandHandlerImpl implements dependency_inversion_seggre_ex.contracts.CommandHandler {
    private static final String COMMAND_CLASS_PATH = "dependency_inversion_seggre_ex.commands.";
    private static final String COMMAND_CLASS_NAME_SUFFIX = "Command";
    private BoatSimulatorController controller;
    private List<String> params;

    public CommandHandlerImpl(BoatSimulatorController controller ) {
        this.controller = controller;
    } 


    public String executeCommand(String name, List<String> parameters) throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException, NoSetRaceException, InsufficientContestantsException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        this.params = parameters;
        Class<?> commandClass = Class.forName(COMMAND_CLASS_PATH + name + COMMAND_CLASS_NAME_SUFFIX);
        Constructor<?> constructor = commandClass.getDeclaredConstructor();
        Executable command = (Executable) constructor.newInstance();
        injectDependencies(command);

        String result = command.execute();
        return result;








//        switch (name) {
//            case "CreateBoatEngine":
//                EngineType engineType;
//                if (parameters.get(3).equals("Jet")) {
//                    return this.controller.createBoatEngine(
//                            parameters.get(0),
//                            Integer.parseInt(parameters.get(1)),
//                            Integer.parseInt(parameters.get(2)),
//                            "Jet");
//                } else if (parameters.get(3).equals("Sterndrive")) {
//                    return this.controller.createBoatEngine(
//                            parameters.get(0),
//                            Integer.parseInt(parameters.get(1)),
//                            Integer.parseInt(parameters.get(2)),
//                            "Sterndrive");
//                }
//
//                throw new IllegalArgumentException(Constants.IncorrectEngineTypeMessage);
//
//            case "CreateRowBoat":
//                return this.controller.createRowBoat(
//                        parameters.get(0),
//                        Integer.parseInt(parameters.get(1)),
//                        Integer.parseInt(parameters.get(2)));
//            case "CreateSailBoat":
//                return this.controller.createSailBoat(
//                        parameters.get(0),
//                        Integer.parseInt(parameters.get(1)),
//                        Integer.parseInt(parameters.get(2)));
//            case "CreatePowerBoat":
//                return this.controller.createPowerBoat(
//                        parameters.get(0),
//                        Integer.parseInt(parameters.get(1)),
//                        parameters.get(2),
//                        parameters.get(3));
//            case "CreateYacht":
//                return this.controller.createYacht(
//                        parameters.get(0),
//                        Integer.parseInt(parameters.get(1)),
//                        parameters.get(2),
//                        Integer.parseInt(parameters.get(3)));
//            case "OpenRace":
//                return this.controller.openRace(
//                        Integer.parseInt(parameters.get(0)),
//                        Integer.parseInt(parameters.get(1)),
//                        Integer.parseInt(parameters.get(2)),
//                        Boolean.parseBoolean(parameters.get(3)));
//            case "SignUpBoat":
//                return this.controller.signUpBoat(parameters.get(0));
//            case "StartRace":
//                return this.controller.startRace();
//            case "GetStatistic":
//                return this.controller.getStatistic();
//            default:
//                throw new IllegalArgumentException();
//        }
    }
    
    private void injectDependencies(Executable executable) throws IllegalAccessException {
        Field[] fieldsBaseCommand = executable.getClass().getSuperclass().getDeclaredFields();
        Field[] fieldsCommand = executable.getClass().getDeclaredFields();
        
        Field[] allFields = null;
        if(fieldsCommand.length > 0){
            allFields = new Field[fieldsBaseCommand.length + fieldsCommand.length];
            System.arraycopy(fieldsBaseCommand, 0, allFields, 0, fieldsBaseCommand.length);
            System.arraycopy(fieldsCommand, 0, allFields, fieldsBaseCommand.length, fieldsCommand.length);
        }

        for (Field field : fieldsCommand.length > 0 ? allFields : fieldsBaseCommand) {
            if(field.isAnnotationPresent(Inject.class)){
                Field[] currentFields = this.getClass().getDeclaredFields();
                for (Field currentField : currentFields) {
                     if(field.getType().equals(currentField.getType())){
                         field.setAccessible(true);
                         field.set(executable, currentField.get(this));
                     }
                }
            }
            
        }
        
    }


}
