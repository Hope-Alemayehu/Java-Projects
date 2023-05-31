import java.util.Scanner; 
public class Parallelogram extends VariableContainer implements Shape{
    double base;
    double height;
    double side1,side2;
   
   
    Parallelogram(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length of base of parallelogram : ");
        base =scanner.nextDouble();
        System.out.println("Enter the length of height of parallelogram : ");
        height =scanner.nextDouble();
        System.out.println("Enter the length of side of parallelogram : ");
        side1 =scanner.nextDouble();
        System.out.println("Enter the length of side of parallelogram : ");
        side2 =scanner.nextDouble();
        scanner.close();
     }
    public void calculateArea(){
        area=base*height;
        
        System.out.println("The area of parallelogram is: "+area);
    }
    public void calculatePerimeter(){
        perimeter=2*(side1*side2);
        System.out.println("The perimeter of paralelogram is: "+perimeter);
    }
}