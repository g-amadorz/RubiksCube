package test.model;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import model.Block;
import model.Face;

public class TestBlock {

    public void testBlock() {
        Block testBlock = new Block();
        assertEquals(0, testBlock.getFaces().size());
        assertEquals(0, (int) testBlock.getPosition("x"));
        assertEquals(0, (int) testBlock.getPosition("y"));
        assertEquals(0, (int) testBlock.getPosition("z"));
    }

    public void testSetFace() {
        Block testBlock = new Block();
        Face redFace = new Face("red", "front");
        Face blueFace = new Face("blue", "back");
        Face greenFace = new Face("green", "left");
        assertEquals(0, testBlock.getFaces().size());
        testBlock.addFace(redFace);
        testBlock.addFace(greenFace);
        assertEquals(1, testBlock.getFaces().size());
        assertEquals(testBlock.getFaces().get(0), redFace);
        assertEquals(testBlock.getFaces().get(1), greenFace);
        testBlock.setFace(blueFace, 0);
        assertEquals(testBlock.getFaces().get(0), blueFace);
        assertEquals(testBlock.getFaces().get(1), greenFace);

    }

    public void testSetPosition() {
        Block testBlock = new Block();
        assertEquals(0, (int) testBlock.getPosition("x"));
        assertEquals(0, (int) testBlock.getPosition("y"));
        assertEquals(0, (int) testBlock.getPosition("z"));
        testBlock.setPosition(1, 2, 3);
        assertEquals(1, (int) testBlock.getPosition("x"));
        assertEquals(2, (int) testBlock.getPosition("y"));
        assertEquals(3, (int) testBlock.getPosition("z"));
    }

    public void testAddFace() {
        Block testBlock = new Block();
        Face redFace = new Face("red", "front");
        assertEquals(0, testBlock.getFaces().size());
        testBlock.addFace(redFace);
        assertEquals(1, testBlock.getFaces().size());
    }
}