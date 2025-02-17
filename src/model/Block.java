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
    }

    public void setPosition(int x, int y, int z) {
        this.position.put("x", x);
        this.position.put("y", y);
        this.position.put("z", z);
    }

    public void addFace(Face face) {
        this.faces.add(face);
    }

    public ArrayList<Face> getFaces() {
        return this.faces;
    }
}
