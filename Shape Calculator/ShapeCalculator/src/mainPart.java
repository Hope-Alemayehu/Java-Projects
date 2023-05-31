//Description:
//It allows users to calculate the area and perimeter of different
//geometric shape.The project uses abstraction and interface to
//define the necessary class and interaction



interface Shape{
    void calculateArea();
    void calculatePerimeter();

}



public class mainPart {
    public static void main(String[] args) {
    //     Square s= new Square();
    //     s.calculateArea();
    //     s.calculatePerimeter();

        // Circle c= new Circle();
        // c.calculateArea();
        // c.calculatePerimeter();

    //     Rectangle r=new Rectangle();
    //     r.calculateArea();
    //     r.calculatePerimeter();
           
        //    Prallelogram p= new Prallelogram();
        //    p.calculateArea();
        //    p.calculatePerimeter();

//         RegularHexagon RegHex =new RegularHexagon();
//         RegHex.calculateArea();
//         RegHex.calculatePerimeter();
        RegularPentagon RegPent =new RegularPentagon();
        RegPent.calculateArea();
        RegPent.calculatePerimeter();


}
}
