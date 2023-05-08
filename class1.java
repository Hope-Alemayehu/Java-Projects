import java.util.Scanner;
public class class1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       

       System.out.println("How many circle bitch: ");

       int n = sc.nextInt ();
        double radius[]= new double[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter radius for the "+ (i+1) +" Circle: ");
            radius[i]=sc.nextInt();

        }

        for (int i=0;i<n;i++){
       double area= Math.PI * (radius[i]*radius[i]);
       System.out.println("Area of circle "+(i+1)+" is "+area);

       double circumference =Math.PI*2*radius[i];
       System.out.println("circumfrance of the circle "+(i+1)+" is "+circumference);
        }






    }





}