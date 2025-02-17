package model;

public class Face {
    String color;
    String orientation; //Maybe this should be an enum or maybe not needed 

    public Face(String color, String orientation) {
        this.color = color;
        this.orientation = orientation;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
