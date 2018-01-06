package reflection_ex.c_baracks_wars.core.factories;

import reflection_ex.c_baracks_wars.contracts.Unit;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;
import reflection_ex.c_baracks_wars.models.units.AbstractUnit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"reflection_ex.c_baracks_wars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
		Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
		Constructor<?> constructor = unitClass.getDeclaredConstructor();
		constructor.setAccessible(true);

		Unit unit = (Unit) constructor.newInstance();
		return  unit;
	}
}
