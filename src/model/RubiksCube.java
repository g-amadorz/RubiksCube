package model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Face;

public class RubiksCube {
    private Block[][][] cube;
    private final char[] colors = {'R', 'G', 'B', 'O', 'Y', 'W'}; 

    //EFFECTS: Initializes the cube with a 3x3x3 array of blocks
    public RubiksCube() {
        this.cube = new Block[3][3][3];
        // Task 1 fill the cube with the sides
    }

    //REQUIRES: direction is either "CLOCKWISE" or "COUNTERCLOCKWISE"
    //EFFECTS: Shifts the columns of blocks on the given z-coordinate and rotates them
    //EFFECTS: about the x-axis
    //MODIFIES: this
    public void pivotZAxis(String direction, int grid) {
        return;
    }

    //REQUIRES: direction is either "CLOCKWISE" or "COUNTERCLOCKWISE"
    //EFFECTS: Shifts the grid of blocks on the given y-coordinate and rotates them
    //EFFECTS: about the x-axis
    //MODIFIES: this
    public void pivotXAxis(String direction, int grid) {
        return;
    }
    //REQUIRES: direction is either "CLOCKWISE" or "COUNTERCLOCKWISE"
    //EFFECTS: Shifts the grid of blocks on the given y-coordinate and rotates them
    //EFFECTS: about the x-axis
    //MODIFIES: this
    public void pivotYAxis(String direction, int grid) {
        return;
    }

    //REQUIRES: direction is either "CLOCKWISE" or "COUNTERCLOCKWISE"
    //EFFECTS: Given an Array of Blocks, the blocks' coordinates are swapped 
    //EFFECTS: according to the given direction
    //MODIFIES: this
    public void pivot(ArrayList<Block> blocks, String direction) {
        return;
    }

    //EFFECTS: INSERTS blocks into the cube at given postion
    //MODIFIES: this
    public void setBlock(int x, int y, int z, Block block) {
        this.cube[x][y][z] = block;
    }

    //EFFECTS: Sets the faces of the cube for the middle blocks.
    //MODIFIES: this
    public void setMiddleBlocks() {
        return;
    }
    
    //EFFECTS: Sets the faces of the cube for the edge blocks.
    //MODIFIES: this
    public void setEdgeBlocks() {
        return;
    }
    
    //EFFECTS: Sets the faces of the cube for the corner blocks.
    //MODIFIES: this
    public void setCornerBlocks() {
        return;
    }

    public Block getBlock(int x, int y, int z) {
        return this.cube[x][y][z];
    }

    public Block[][][] getCube() {
        return this.cube;
    }
}
