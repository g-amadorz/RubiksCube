package test.model;

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
    }

    @Test
    public void testSetColor() {
        
    }
    
}
