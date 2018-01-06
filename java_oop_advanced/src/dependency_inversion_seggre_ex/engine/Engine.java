package dependency_inversion_seggre_ex.engine;

import dependency_inversion_seggre_ex.contracts.CommandHandler;
import dependency_inversion_seggre_ex.contracts.Reader;
import dependency_inversion_seggre_ex.contracts.Runnable;
import dependency_inversion_seggre_ex.contracts.Writer;
import dependency_inversion_seggre_ex.exeptions.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Engine implements Runnable{
    private static final String TERMINATE_COMMAND = "End";
    private Reader reader;
    private Writer writer;
    private CommandHandler commandHandler;

    public Engine(Reader reader, Writer writer, CommandHandler commandHandler) {
        this.reader = reader;
        this.writer = writer;
        this.commandHandler = commandHandler;
    }

    public CommandHandler getCommandHandler;

    @Override
    public void run() throws IOException {
        while (true) {
            List<String> tokens = new ArrayList<>(Arrays.asList(this.reader.readLine().split("\\\\")));

            if(TERMINATE_COMMAND.equals(tokens.get(0))){
                break;
            }

            try {
                String result = this.commandHandler.executeCommand(tokens.get(0), tokens.stream().skip(1).collect(Collectors.toList()));
                if(result != null){
                    this.writer.writeLine(result);
                }


            } catch (NonExistantModelException | DuplicateModelException | NoSetRaceException | InsufficientContestantsException | RaceAlreadyExistsException | InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


    }
}
