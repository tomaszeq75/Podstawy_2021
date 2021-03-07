package marzec;

public class Circle_9 implements Movable_10, Resizable_11{
    private Point2D_9 center, point;

    public Circle_9(Point2D_9 center, Point2D_9 point) {
        this.center = center;
        this.point = point;
    }

    public Point2D_9 getCenter() {
        return center;
    }

    public void setCenter(Point2D_9 center) {
        this.center = center;
    }

    public double getRadius(){
        return Math.sqrt(Math.pow(center.getX() - point.getX(), 2.0) + Math.pow(center.getY() - point.getY(), 2.0));
    }

    public double getPerimeter() {
        return Math.PI * getRadius() * 2;
    }

    @Override
    public void move(MoveDirection_10 moveDirection_10) {
        center.setX(center.getX() + moveDirection_10.getX());
        center.setY(center.getY() + moveDirection_10.getY());
    }

    @Override
    public void resize(double resizeFactor) {
        point.setX(center.getX() + resizeFactor * (point.getX()) - center.getX());
        point.setY(center.getY() + resizeFactor * (point.getY()) - center.getY());
    }
}
