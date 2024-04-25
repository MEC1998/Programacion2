public class EquilateralTriangle extends GeometricFigure{
    private double side;
    private double length;
    private double wide;

    public EquilateralTriangle(double side, double length, double wide){
        this.side=side;
        this.length=length;
        this.wide=wide;
    }

    @Override
    public double calculateArea() {
        return (wide*length)/2;
    }

    @Override
    public double calculatePerimeter() {
        return side*3;
    }
}
