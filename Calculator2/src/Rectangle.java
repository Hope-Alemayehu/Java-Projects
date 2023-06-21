
class Rectangle implements Shape {
    double length;
    double width;
    double area;
    double perimeter;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
    }

    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
