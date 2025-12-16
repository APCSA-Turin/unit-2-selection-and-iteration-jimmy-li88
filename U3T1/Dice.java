package U3T1;
    public class Dice {
        private int sides;
        private int rollCounter = 0;

        public Dice(int sides) {
            this.sides = sides;
        }

        public int roll() {
            rollCounter++;
            return (int) (Math.random() * sides) + 1;
        }
        public int getRollValue() {
            return (int) (Math.random() * sides) + 1;
        }
        public int getSides() {
            return sides;
        }

        public int setSides( int sides) {
            this.sides = sides;
            return sides;
        }
        public int getRollCount() {
            return rollCounter;
        }
    }

