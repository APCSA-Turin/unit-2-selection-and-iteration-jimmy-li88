package U3T1;

public class Prism {
    int length; 
    int width;
    int height;
    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Prism (int sideLength){
        this.length = sideLength;
        this.width = sideLength;
        this.height = sideLength;
    }
    public Prism() {
        this.length = (int)(Math.random() * 90) + 10;;
        this.width = (int)(Math.random() * 90) + 10;;
        this.height = (int)(Math.random() * 90) + 10;;
    }
    public String dimensions() {
        return "length: " + length + ", width: " + width + ", height: " + height;
    }
    public int volume() {
        return length * width * height;
    }
    public int surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
    public int setLength( int length) {
            this.length = length;
            return length;
    }
    public int setWidth( int width) {
            this.width = width;
            return width;
    }
    public int setHeight( int height) {
        this.height = height;
        return height;
    }

}
