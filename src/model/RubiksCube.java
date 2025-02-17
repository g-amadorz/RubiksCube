package model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Face;

public class RubiksCube {
    private Block[][][] cube;

    public final Map<String, String> colors = new HashMap<String, String>() {
        {
            put("red", "R");
            put("blue", "B");
            put("green", "G");
            put("yellow", "Y");
            put("orange", "O");
            put("white", "W");
        }
    };

    //EFFECTS: Initializes the cube with a 3x3x3 array of blocks
    public RubiksCube() {
        this.cube = new Block[3][3][3];
        Integer zCoordinate = 2;    
        // Task 1 fill the cube with the sides/
    }
    //EFFECTS: Shifts the side of the cube on a given axis
    //MODIFIES: this
    public void shiftSide() {
        return;
    }
    //EFFECTS: INSERTS blocks into the cube
    //MODIFIES: this
    public void insertBlock(Block block){
        return;
    }

    public Block[][][] getCube() {
        return this.cube;
    }
}
