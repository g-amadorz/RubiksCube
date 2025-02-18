package model;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Block {
    private ArrayList<Face> faces;
    private Map<String, Integer> position;

    public Block() {
        this.faces = new ArrayList<Face>();
        this.position = new HashMap<String, Integer>();
        this.position.put("x", 0);
        this.position.put("y", 0);
        this.position.put("z", 0);
    }

    //EFFECTS: Sets the face at the given index to the given face
    //MODIFIES: THIS
    public void setFace(Face face, int index) {
        return;
    }

    //EFFECTS: Sets the position of the block to the given x, y, and z values
    //MODIFIES: THIS
    public void setPosition(int x, int y, int z) {
        this.position.put("x", x);
        this.position.put("y", y);
        this.position.put("z", z);
    }

    //EFFECTS: Adds the given face to the block
    //MODIFIES: THIS    
    public void addFace(Face face) {
        this.faces.add(face);
    }

    //For testing purposes
    public void removeFace(int index) {
        this.faces.remove(index);
    }

    //For testing purposes
    public void resetFaces() {
        this.faces = new ArrayList<Face>();
    }

    public ArrayList<Face> getFaces() {
        return this.faces;
    }

    public Integer getPosition(String key) {
        return this.position.get(key);
    }
}
