import java.util.ArrayList;

public class EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();

    // Add employee
    public boolean addEmployee(Employee employee){
        if (searchEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee);
        return true;
    }


    // View employees
    public void viewEmployees(){
        if (employees.isEmpty()){
            System.out.println("No employees found.");
            return;
        }
        for (Employee employee : employees){
            employee.display();
        }
    }

    // Search employee by ID
    public Employee searchEmployee(int id){
        for (Employee employee : employees){
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    // Update employee
    public boolean updateEmployee(int id, String newName, String newDepartment){
        Employee employee = searchEmployee(id);

        if (employee == null){
            return false;
        }

        employee.setName(newName);
        employee.setDepartment(newDepartment);
        return true;
    }

    // Delete employee
    public boolean deleteEmployee(int id){
        Employee employee = searchEmployee(id);

        if (employee == null){
            return false;
        }

        employees.remove(employee);
        return true;
    }

}
