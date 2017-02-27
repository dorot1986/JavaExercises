package classes.exercise10;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Point2D {
    private double CoordinateX;
    private double CoordinateY;

    public Point2D(double coordinateX, double coordinateY) {
        CoordinateX = coordinateX;
        CoordinateY = coordinateY;
    }

    public Point2D() {
    }

    public double getCoordinateX() {
        return CoordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        CoordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return CoordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        CoordinateY = coordinateY;
    }

    @Override
    public String toString(){
        return "Współrzędne punktu to: x = " + getCoordinateX() + "; y = " + getCoordinateY();
    }
}
