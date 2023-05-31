import java.util.Scanner; 

public class Circle extends VariableContainer implements Shape{
    
    final double  PI =3.14;
    double radius;
    
    Circle() {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        
        radius =scanner.nextDouble();
        scanner.close();
    }
    
    
    public void calculateArea(){
        area = PI*radius*radius;
        System.out.println("The Area of the circle is: "+ area);
    }
    public void calculatePerimeter(){
        perimeter = PI*2*radius;
        System.out.println("The Circumfrence of the circle is: "+ perimeter);
    
    }
}