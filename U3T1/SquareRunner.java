package U3T1;

public class SquareRunner {
    public static void main(String[] args) {
        Square mySquare = new Square();
        String squareName = mySquare.getName();
        if (squareName.equals("cool square")){
            System.out.println("This is a cool square!");
        } else {
            System.out.println("This is not a cool square.");
        }
    }
}