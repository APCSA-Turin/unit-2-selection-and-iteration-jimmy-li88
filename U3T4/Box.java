public class Box {

    private double length;

    private double width;

    private double height;

    public Box(double length, double width, double height) {

        this.length = length;
        this.width = width;
        this.height = height;

    }

    // creates a cube: a box with all dimensions equal to side

    public Box(double side) {

        length = side;
        width = side;
        height = side;

    }

    public double getLength() {

        return length;

    }

    public double getWidth() {

        return width;

    }

    public double getHeight() {

        return height;

    }

    public double volume() {

        return this.length * this.width * this.height;

    }

    public Box greaterVolume(Box otherBox) {

        if (this.volume() > otherBox.volume()) {
            return this;
        } else if (this.volume() == otherBox.volume()) {
            return null;
        } else {
            return otherBox;
        }

    }

    public String boxInfo() {

        return "length: " + length + "width: " + width + "height: " + height;

    }

    public class Shape {
        private Box box;

        public Shape() {
        }

        public Box getBox() {
            return box;
        }

        public void attachBox(Box box) {
            this.box = box;
        }

    }

    public void addToShape(Shape s) {

        s.attachBox(this);

    }

}