import java.util.Scanner;

public class Square implements Shape{
    double n;
    double area;
    double perimeter;
    Square(){
        System.out.println("Enter the length of the Side: ");
        Scanner scan =new Scanner(System.in);
        n=scan.nextDouble();
        scan.close();
    }
    public void calculateArea(){
        area=n*n;
        System.out.println("The area is: "+ area);

    }
    public void calculatePerimeter(){
        perimeter=n*4;
        System.out.println("The perimeter is: "+ perimeter);

    }
}