package com.Sports.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="facility")
public class SportsFacility {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String location;
    private String name;
    private int capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
}
