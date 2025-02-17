package model;

public class Face {
    String color;
    String orientation; //Maybe this should be an enum or maybe not needed 

    public Face(String color, String orientation) {
        this.color = color;
        this.orientation = orientation;
    }

    //MODIFES: this
    //EFFECTS: sets the color of the face
    public void setColor(String color) {
        this.color = color;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getColor() {
        return this.color;
    }

    public String getOrientation() {
        return this.orientation;
    }
}
