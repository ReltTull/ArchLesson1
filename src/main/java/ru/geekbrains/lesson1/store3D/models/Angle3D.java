package ru.geekbrains.lesson1.store3D.models;

public class Angle3D {

    /**
     * угол горизонтального склонения
     */
    private double horizontalTiltAngle;

    public double getHorizontalTiltAngle() {
        return horizontalTiltAngle;
    }
    public void setHorizontalTiltAngle(double input) {
        this.horizontalTiltAngle = input;
    }

    /**
     * угол вертикального склонения
     */
    private double verticalTiltAngle;

    public double getVerticalTiltAngle() {
        return verticalTiltAngle;
    }
    public void setVerticalTiltAngle(double input) {
        this.verticalTiltAngle = input;
    }

    public Angle3D(double horizAngle, double verticalAngle) {
        this.horizontalTiltAngle = horizAngle;
        this.verticalTiltAngle = verticalAngle;
    }
}
