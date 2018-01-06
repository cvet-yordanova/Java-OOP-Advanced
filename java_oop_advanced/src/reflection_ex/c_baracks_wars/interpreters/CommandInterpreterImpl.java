package reflection_ex.c_baracks_wars.interpreters;

import reflection_ex.c_baracks_wars.contracts.CommandInterpreter;
import reflection_ex.c_baracks_wars.contracts.Executable;
import reflection_ex.c_baracks_wars.contracts.Repository;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter{
    private static final String COMMANDS_PACKAGE_NAME =
            "reflection_ex.c_baracks_wars.core.commands.";
    private static final String COMMAND_SUFFIX = "Command";

    //private String[] data;
    //refactor delete for task 4
//    private BoatRepository repository;
//    private UnitFactory unitFactory;
//
//    public CommandInterpreterImpl(BoatRepository repository, UnitFactory unitFactory) {
//        this.repository = repository;
//        this.unitFactory = unitFactory;
//    }

    @Override
    public Executable interpretCommand(String commandName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String correctCommandName = String.valueOf(commandName.charAt(0)).toUpperCase() + commandName.substring(1);
        Class<?> commandClass = null;
        try {
           commandClass = Class.forName(COMMANDS_PACKAGE_NAME + correctCommandName + COMMAND_SUFFIX);
        } catch (ClassNotFoundException cnfe) {
           throw new RuntimeException("Invalid command!");
        }

       // Constructor<?> constructor = commandClass.getDeclaredConstructor(String[].class, BoatRepository.class, UnitFactory.class);
        Constructor<?> constructor = commandClass.getDeclaredConstructor();
        //Executable command = (Executable) constructor.newInstance(data, this.repository, this.unitFactory);
        //refactor task 4
        Executable command = (Executable) constructor.newInstance();
        return command;
    }
}
