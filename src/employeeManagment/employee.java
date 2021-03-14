package employeeManagment;

public class employee {

    private String name;
    private String surname;
    private double salary;
    private char gender;
    private int department;

    public employee(String name, String surname, double salary, char gender, int department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.gender = gender;
        this.department = department;
    }
    

    public boolean IfWorkInDepartment(int department) {
        if (this.department == department) {

        }
        return true;

    }
}
