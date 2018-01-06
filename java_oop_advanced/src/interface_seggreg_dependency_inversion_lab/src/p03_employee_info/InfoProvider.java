package interface_seggreg_dependency_inversion_lab.src.p03_employee_info;

import java.util.Iterator;
import java.util.List;

public interface InfoProvider {
    List<Employee> getEmployeesByName();
   public Iterable<Employee> getEmployeesBySalary();
}
