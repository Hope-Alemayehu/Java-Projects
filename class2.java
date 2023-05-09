public class class2 {
    
    public  double area(double radius){
        
            double area= Math.PI * (radius * radius );
            return area;
    }
    public  double circumference(double radius){
        
        static double circumference = Math.PI * 2 * radius;
        
}
    public void display(int i,double area,double circumference){
        
       System.out.println("Area of circle "+i+" is "+area);
       System.out.println("Circumfrence  of circle "+i+" is "+ circumference);
   
   
    
}
}

