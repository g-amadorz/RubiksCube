package model;

public class EdgeBlock extends Block {
    public EdgeBlock() {
        super();
        
    }
    
    //EFFECTS: Returns the type of block
    public String getType() {
        return "edge";
    }
    
    //EFFECTS: Returns the number of faces on the block
    public int getNumFaces() {
        return 2;
    }
    
}
