package com.example.demo.domain.model.asignature;

public class Asignature {
    private final AsignatureId id;
    private final AsignatureName name;

    public Asignature(AsignatureId id, AsignatureName name) {
        this.id = id;
        this.name = name;
    }

    public AsignatureId getId() {
        return id;
    }

    public AsignatureName getName() {
        return name;
    }
}
