package interface_seggreg_dependency_inversion_lab.src.p01_system_resources;

import java.time.LocalTime;

public class TestTime implements TimeProvider {

    @Override
    public int getHour(){
        return LocalTime.now().getHour();
    }

}
