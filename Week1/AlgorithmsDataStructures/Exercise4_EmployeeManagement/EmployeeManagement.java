package Week1.AlgorithmsDataStructures.Exercise4_EmployeeManagement;

public class EmployeeManagement {

    Employee[] employees =
            new Employee[100];

    int count = 0;

    public void addEmployee(
            Employee employee) {

        employees[count++] = employee;
    }

    public Employee searchEmployee(
            int id) {

        for(int i=0;i<count;i++) {

            if(employees[i].employeeId == id)
                return employees[i];
        }

        return null;
    }

    public void traverse() {

        for(int i=0;i<count;i++) {

            System.out.println(
                employees[i].name);
        }
    }

    public void deleteEmployee(int id) {

        for(int i=0;i<count;i++) {

            if(employees[i].employeeId == id) {

                for(int j=i;j<count-1;j++) {

                    employees[j] =
                        employees[j+1];
                }

                count--;
                break;
            }
        }
    }
}