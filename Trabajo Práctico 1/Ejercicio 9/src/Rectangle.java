public class Rectangle extends GeometricFigure{
    private double length;
    private double wide;

    public Rectangle(double length, double wide){
        this.length=length;
        this.wide=wide;
    }

    @Override
    public double calculateArea() {
        return wide*length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(wide+length);
    }
}
