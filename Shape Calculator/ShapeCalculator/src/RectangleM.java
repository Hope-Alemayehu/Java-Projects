import java.util.Scanner; 

public class RectangleM extends VariableContainer implements Shape{
    double length;
    double width;
    
    RectangleM(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length: ");
        length =scanner.nextDouble();
        System.out.println("Enter the width: ");
        width =scanner.nextDouble();
        scanner.close();
    }
    public void calculateArea(){
        area=length*width;
        System.out.println("The area of rectangle is: "+area);
    }
    public void calculatePerimeter(){
        perimeter=2*length +2*width;
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
}