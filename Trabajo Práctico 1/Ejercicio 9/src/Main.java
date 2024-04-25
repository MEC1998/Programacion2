import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Circle circle1= new Circle(5.4);
        Circle circle2=new Circle(3.1);
        Rectangle rectangle1=new Rectangle(6.5,3.0);
        Rectangle rectangle2=new Rectangle(7.0,4.3);
        EquilateralTriangle triangle1=new EquilateralTriangle(10.0,8.66, 10.0);

        JOptionPane.showMessageDialog(null, "CIRCLE 1\nArea: "+circle1.calculateArea()+"cm\nPerimeter: "+circle1.calculatePerimeter()+"cm\nCIRCLE 2\nArea: "+circle2.calculateArea()+"cm\nPerimeter: "+circle2.calculatePerimeter()+"cm");
        JOptionPane.showMessageDialog(null, "RECTANGLE 1\nArea: "+rectangle1.calculateArea()+"cm\nPerimeter: "+rectangle1.calculatePerimeter()+"cm\nRECTANGLE 2\nArea: "+rectangle2.calculateArea()+"cm\nPerimeter: "+rectangle2.calculatePerimeter()+"cm");
        JOptionPane.showMessageDialog(null, "TRIANGLE 1\nArea: "+triangle1.calculateArea()+"cm\nPerimeter: "+triangle1.calculatePerimeter()+"cm");
    }
}