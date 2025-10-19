package org.example.model;

public class Wall {
    private String direcion;

    public Wall(String direcion) {
        this.direcion = direcion;
    }

    public String getDirecion() {
        return direcion;
    }

    public void create(){
        System.out.println("Wall has been built.");
    }
}
