package classes.exercise10;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Point3D extends Point2D {
    private double CoordinateZ;

    public Point3D(double coordinateX, double coordinateY, double coordinateZ) {
        super(coordinateX, coordinateY);
        CoordinateZ = coordinateZ;
    }

    public Point3D() {
    }

    public double getCoordinateZ() {
        return CoordinateZ;
    }

    public void setCoordinateZ(double coordinateZ) {
        CoordinateZ = coordinateZ;
    }
    @Override
    public String toString(){
        return "Współrzędne punktu to: x = " + getCoordinateX() + "; y = " + getCoordinateY() + "; z = " + getCoordinateZ();
    }
}
