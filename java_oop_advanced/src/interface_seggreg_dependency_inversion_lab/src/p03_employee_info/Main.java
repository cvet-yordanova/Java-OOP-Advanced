package interface_seggreg_dependency_inversion_lab.src.p03_employee_info;

public class Main {

    public static void main(String[] args) {
        Database database = new EmployeeDatabase();
        InfoProvider employeeInfo = new EmployeeInfoProvider(database);
        Formatter formatter = new ConsoleFormatter();

        String output = formatter.format(employeeInfo.getEmployeesByName());
        System.out.println(output);
    }
}
