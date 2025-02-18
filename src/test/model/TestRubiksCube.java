package test.model;
import model.RubiksCube;
import model.Block;
import model.Face;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRubiksCube {
    
    @BeforeEach

    void setup() {
        RubiksCube testCube = new RubiksCube();
        Block testMiddleBlock = new Block();
        Block testCornerBlock = new Block();
        Block testEdgeBlock = new Block();
        Face redFace = new Face("red", "front");
        Face blueFace = new Face("blue", "back");
        Face greenFace = new Face("green", "left");
    }




}
