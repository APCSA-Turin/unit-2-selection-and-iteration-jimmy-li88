package U3T1;

public class Square {
    private int side; 
    private String name;

    public int getSide() {
        return side;
    }
    public String getName() {
        return name;
    }
    public String info(){
        return "side: " + side + ", name: " + name;
    }
}
