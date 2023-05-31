import java.util.Scanner; 

class Square extends VariableContainer implements Shape{
    double side;
    
    Square(){
       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter the length of sides of square: ");
       side =scanner.nextDouble();
       scanner.close();
    }
   public void calculateArea(){
        area=side*side;
        System.out.println("The area of rectangle is: "+area);
    }
   public void calculatePerimeter(){
        perimeter=4*side;
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
    

}
