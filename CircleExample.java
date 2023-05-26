import java.util.Scanner;

public class CircleExample {
   double radius;
    double area;
    double Circumfrence;
    final double PI=3.14;
    CircleExample(){
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius=scanner.nextDouble();
    }
    void CalculateArea(){
        area=PI*radius*radius;
        System.out.println("The area of the circle is: "+area);
    }
    void CalculateCircumfrence(){
        Circumfrence=PI*radius*2;
        System.out.println("The circumfrence of the circle is: "+Circumfrence);
    }
    public static void main(String[] args) {
        CircleExample test=new CircleExample();
        test.CalculateArea();
        test.CalculateCircumfrence();
    }
}
