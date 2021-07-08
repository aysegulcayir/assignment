package com.capgemini.assignment.models;

public class Plane {
    private String name;
    private int capacity;
    private String captain;

    public Plane() {
    }

    public Plane(String name, int capacity, String captain) {
        this.name = name;
        this.capacity = capacity;
        this.captain = captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }
}
