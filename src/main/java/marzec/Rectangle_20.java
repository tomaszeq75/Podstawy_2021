package marzec;

public class Rectangle_20 extends Shape_20{
    @Override
    public double calculatePerimeter(double value) {
        return value * 4;
    }

    @Override
    public double calculateArea(double value) {
        return value * value;
    }
}
