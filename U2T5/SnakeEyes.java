public class SnakeEyes {
    int number1 = (int)(Math.random() * 6) + 1;
    int number2 = (int)(Math.random() * 6) + 1;
    int counter = 0;
        while (!number1 == 1 && !number2 == 1) {
        number1 = (int)(Math.random() * 6) + 1;
        number2 = (int)(Math.random() * 6) + 1;
        System.out.println("Die 1: " + number1 + ", Die 2: " + number2);
        counter++;
    }
}
