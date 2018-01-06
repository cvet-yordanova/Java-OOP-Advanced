package reflection_ex.c_baracks_wars.core;

import reflection_ex.c_baracks_wars.annotations.Inject;
import reflection_ex.c_baracks_wars.contracts.*;
import reflection_ex.c_baracks_wars.contracts.Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Engine implements Runnable {

	private String[] data;
	private Repository repository;
	private UnitFactory unitFactory;
	private CommandInterpreter interpreter;

	public Engine(Repository repository, UnitFactory unitFactory, CommandInterpreter interpreter) {
		this.repository = repository;
		this.unitFactory = unitFactory;
		this.interpreter = interpreter;
	}

	@Override
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();

				if ("fight".equalsIgnoreCase(input)) {
					break;
				}

				String[] data = input.split("\\s+");
				String commandName = data[0];
			//	String result = null;
				//Executable command = this.interpreter.interpretCommand(data, commandName);
				Executable command = this.interpreter.interpretCommand(commandName);
				this.data = data;
				this.injectDependencies(command);
				String result = command.execute();

				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	private void injectDependencies(Executable command) throws IllegalAccessException {
		Field[] commandFields = command.getClass().getSuperclass().getDeclaredFields();
		Field[] engineFields = this.getClass().getDeclaredFields();

		for (Field commandField : commandFields) {
			if(commandField.isAnnotationPresent(Inject.class)){
				for (Field engineField : engineFields) {
					if(commandField.getType().equals(engineField.getType()) && commandField.getName().equals(engineField.getName())){
						commandField.setAccessible(true);
						engineField.setAccessible(true);
						commandField.set(command, engineField.get(this) );
					}
				}
			}
		}
	}
}
