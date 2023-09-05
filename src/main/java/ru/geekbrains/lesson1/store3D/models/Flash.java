package ru.geekbrains.lesson1.store3D.models;

import java.awt.*;

public class Flash {
    private Point3D location;
    public Point3D getLocation() {
        return location;
    }
    public void setLocation(Point3D location) {
        this.location = location;
    }

    private Angle3D angle;
    public Angle3D getAngle() { return angle; }
    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    private Color color;
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    private float power;
    public float getPower() {
        return power;
    }
    public void setPower(float power) {
        this.power = power;
    }

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    /**
     * задаем новый угол наклона
     * @param newAngle
     */
    public void rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    /**
     * задаем новую позицию в пространстве
     * @param newLocation
     */
    public void move(Point3D newLocation) {
        this.location = newLocation;
    }
}
