import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.jar.Attributes.Name;

public class EmployeeRaiseCalculator {
    String employeeName = "Hope Alemayehu";
    String jobTitle = "CEO";
    LocalDate date1 = LocalDate.of(2003, 9, 15); // First date
    LocalDate date2 = LocalDate.of(2023, 5, 25); // Second date
    double salary;

    double startSalary = 15000;
    double rate = 0.05;

    public void yearOfService() {
        long yearsDiff = ChronoUnit.YEARS.between(date1, date2);
        // System.out.println(employeeName);
        // System.out.println(ja);
        System.out.println("Years of service: " + yearsDiff);
    }

    public void salaryRaise() {
        double raiseAmount = startSalary * rate;
        salary = startSalary + raiseAmount;
        System.out.println("The current salary is: " + salary);
    }

    public static void main(String[] args) {
        EmployeeRaiseCalculator test = new EmployeeRaiseCalculator();
        test.yearOfService();
        test.salaryRaise();
    }
}
