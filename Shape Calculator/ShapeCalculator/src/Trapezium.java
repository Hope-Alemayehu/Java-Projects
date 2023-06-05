import java.util.Scanner;

public class Trapezium implements Shape {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    Trapezium() {
        setInputs();
    }

    private void setInputs() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the length of base 1 of the trapezium: ");
            base1 = scanner.nextDouble();
            if (base1 < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (base1 < 0);

        do {
            System.out.println("Enter the length of base 2 of the trapezium: ");
            base2 = scanner.nextDouble();
            if (base2 < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (base2 < 0);

        do {
            System.out.println("Enter the length of height of the trapezium: ");
            height = scanner.nextDouble();
            if (height < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (height < 0);

        do {
            System.out.println("Enter the length of side 1 of the trapezium: ");
            side1 = scanner.nextDouble();
            if (side1 < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (side1 < 0);

        do {
            System.out.println("Enter the length of side 2 of the trapezium: ");
            side2 = scanner.nextDouble();
            if (side2 < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (side2 < 0);

        scanner.close();
    }

    public double calculateArea() {
        double trapeziumArea = (base1 + base2) * height / 2;
        return trapeziumArea;
    }

    public double calculatePerimeter() {
        double trapeziumPerimeter = base1 + base2 + side1 + side2;
        return trapeziumPerimeter;
    }

    //in the main class
    //     Trapezium t = new Trapezium();
    //     System.out.println("The area of the trapezium is: " + t.calculateArea());
    //     System.out.println("The perimeter of the trapezium is: " + t.calculatePerimeter());
    // }
}
