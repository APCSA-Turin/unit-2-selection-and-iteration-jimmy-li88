
    import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }


   // helper method that returns string containing message to be printed
   private String result(int num) {
       if (num < 1) {
           return "You did not enter a positive integer.";
       }

       if (num % 2 == 0) {
           if (num > 100) {
               return num + " big even number.";
           } else if (num > 50) {
               return num + " medium even number.";
           } else {
               return num + " small even number.";
           }
       } else {
           if (num % 5 == 0 && num % 7 == 0) {
               return num + " Divisible by both 5 and 7!";
           } else if (num % 5 == 0) {
               return num + " divisible by 5!";
           } else if (num % 7 == 0) {
               return num + " divisible by 7!";
           } else {
               return num + " is odd.";
           }
       }
       // complete the code for this method;
       // make no other changes to the program
   }
}


