package ru.geekbrains.lesson1.store3D.models;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {

    private int id;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    private List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    private List<PoligonalModel> models;
    private List<Flash> flashes;

    private List<Camera> cameras;
    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }


    public Type method1(Type t) {
        return new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
    }

    public Type method2(Type t, Type t2) {
        return new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
    }

}
