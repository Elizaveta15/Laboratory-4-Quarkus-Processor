package org.acme;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Animal {
    private Integer id;
    private String name;

    public Animal() {
    }

    public Animal(Animal animal) {
        this.id = 7;
        this.name = animal.name;
    }

    public Animal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Animal(String name) {
        this.id = 5;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}