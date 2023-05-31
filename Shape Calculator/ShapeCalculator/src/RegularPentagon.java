import java.util.Scanner;
public class RegularPentagon extends VariableContainer implements Shape {
    double side;
    
    RegularPentagon(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the side of Regular Pentagon: ");
        side =scanner.nextDouble();
        scanner.close();

    }
    public void calculateArea(){
        area=(0.25*Math.sqrt((5*(5+2*Math.sqrt(5))))*(side*side))/2;
        System.out.println("The area of Regular Hexagon is: "+area);
    }
    public void calculatePerimeter(){
        perimeter=5*side;
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
    
}