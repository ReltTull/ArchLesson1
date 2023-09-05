package ru.geekbrains.lesson1.store3D.models;

public class Camera {

    /**
     * параметр работы камеры
     */
    private boolean isFilmed;
    private Point3D location;
    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    private Angle3D angle;
    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
        isFilmed = false;
    }

    /**
     * Метод переключения камеры, отображает состояние
     */
    public void switchCamera() {
        isFilmed = !isFilmed;
        System.out.println("Camera is filming: " + isFilmed);
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
