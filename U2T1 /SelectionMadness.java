public class SelectionMadness {

  // no instance variables //
  
  public SelectionMadness() { }

  /* Returns 1 of 5 randomly generated fortunes as a string;
     you should write your own 5 fortunes! (see output for examples)
   */
  public String fortune() {
    int randomFortune = (int)(Math.random() * 5) + 1;
    if (randomFortune == 0) {
      return "You will have a great day!";
    } else if (randomFortune == 1) {
      return "Success is on the horizon.";
    } else if (randomFortune == 2) {
      return "Adventure awaits you.";
    } else if (randomFortune == 3) {
      return "Happiness is coming your way.";
    } else {
      return "Expect the unexpected.";
    }
  }

  /* Returns the largest of three provided integers: num1, num2, or num3
   */
  public int largest(int num1, int num2, int num3) {
    if (num1 >= num2 && num1 >= num3) {
      return num1;
    } else if (num2 >= num1 && num2 >= num3) {
      return num2;
    } else {
      return num3;
    }
  }
  
  /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
  public boolean rightTriangle(int side1, int side2, int side3) {
    /* implement this method */
    int c = largest(side1, side2, side3);
    int a, b;
    if (c == side1) {
      a = side2;
      b = side3;
    } else if (c == side2) {
      a = side1;
      b = side3;
    } else {
      a = side1;
      b = side2;
    }
    return (a * a + b * b == c * c);
  }
}