package test.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import model.Face;

public class TestFace {
    @BeforeEach
    public void setup() {
        
    }

    @Test
    public void testFace() {
        Face testFace = new Face("red", "front");
        assertEquals("red", testFace.getColor());
        assertEquals("front", testFace.getOrientation());
    }

    @Test
    public void testSetColor() {
        Face testFace2 = new Face("blue", "left");
        assertEquals("blue", testFace2.getColor());
        testFace2.setColor("green");
        assertEquals("green", testFace2.getColor());
    }

    @Test
    public void testSetOrientation() {
        Face testFace3 = new Face("yellow", "right");
        assertEquals("right", testFace3.getOrientation());
        testFace3.setOrientation("back");
        assertEquals("back", testFace3.getOrientation());
    }
    
}
