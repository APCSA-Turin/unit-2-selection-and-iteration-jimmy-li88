public class WhileLoopFun {
  public WhileLoopFun() { }

  public void printDigits(int number) {
    while (number > 0) {
        int digit = number % 10;
        System.out.println(digit);
        number = number / 10;
    }
  }

  public int countLetter(String word, String letter) {
    int count = 0;
    int index = 0;
    while (index < word.length()) {
        if (word.substring(index, index + 1).equals(letter)) {
            count++;
        }
        index++;
    }
    return count;
  }

  public int maxDoubles(int number, int threshold) {
    int count = 0;
    while (number * 2 <= threshold) {
        number = number * 2;
        count++;
    }
    return count;
  }


  public boolean isPrime(int number) {
    if (number <= 1) {
           return false;
       }
       int currentDivisor = 2; 
       while (currentDivisor < number) {
           if (number % currentDivisor == 0) {
               return false;  
           }
           currentDivisor++;
       }
       return true;
  }
}
