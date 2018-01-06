package reflection_ex.c_baracks_wars;


import reflection_ex.c_baracks_wars.contracts.CommandInterpreter;
import reflection_ex.c_baracks_wars.contracts.Repository;
import reflection_ex.c_baracks_wars.contracts.Runnable;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;
import reflection_ex.c_baracks_wars.core.Engine;
import reflection_ex.c_baracks_wars.core.factories.UnitFactoryImpl;
import reflection_ex.c_baracks_wars.data.UnitRepository;
import reflection_ex.c_baracks_wars.interpreters.CommandInterpreterImpl;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		//CommandInterpreter interpreter = new CommandInterpreterImpl(repository, unitFactory);
		//refactor task 4
		CommandInterpreter interpreter = new CommandInterpreterImpl();
		Runnable engine = new Engine(repository, unitFactory, interpreter);
		engine.run();
	}
}
