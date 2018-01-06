package dependency_inversion_seggre_ex.contracts;


import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.models.MotorBoat;

import java.util.List;

public interface Race
{
    int getDistance();

    int getWindSpeed();

    int getOceanCurrentSpeed();

   // void setOceanCurrentSpeed(int oseanCurrentSpeed);

    boolean getAllowsMotorboats();

    void addParticipant(Boat boat) throws DuplicateModelException;

    List<Boat> getParticipants();
}
