import java.util.Scanner;
class Teacher extends Employee {
    private String department;

    public Teacher() {
        System.out.println("Enter the department: ");
        Scanner scan = new Scanner(System.in);
        department = scan.nextLine();
        scan.close();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void teach() {
        System.out.println("I teach " + getDepartment());
    }
}