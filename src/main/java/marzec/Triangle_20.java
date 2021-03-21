package marzec;

public class Triangle_20 extends Shape_20 {

    @Override
    public double calculatePerimeter(double value) {
        return value * 3;
    }

    @Override
    public double calculateArea(double value) {
        return value * value * Math.sqrt(3) / 4;
    }
}
