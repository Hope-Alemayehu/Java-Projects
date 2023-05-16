import java.util.Scanner;
public class class1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       

       System.out.println("How many circle: ");

       int n = sc.nextInt ();
         double[] radius= new double[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter radius for the "+ (i+1) +" Circle: ");
            radius[i]=sc.nextDouble();

        }

        class2 cl2 =new class2();
        for (int i=0;i<n;i++){
            double area=cl2.area(radius[i]);
            double circumference=cl2.circumference(radius[i]);
            cl2.display(i+1, area, circumference);
        }
        




    }





}