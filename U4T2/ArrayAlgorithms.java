package U4T2;

public class ArrayAlgorithms {
    public static double average(int[] numList) {
        double total = 0.0; 
        for (int i = 0; i < numList.length ; i++){
            total = total + numList[i];
        }
        return total / numList.length;
  }
  public static int minimum(int[] numList) {
    int min = 0; 
    for (int i = 0; i < numList.length; i++){
        if (numList[i]< min){
            min = numList[i];
        }
    }
    return min; 
  }
  public static int howManyContain(String[] strList, String target) {

    int total = 0; 
    for (int i = 0; i < strList.length; i++){
        if (strList[i].indexOf(target) != -1 ){
            total++;
        }
    }
    return total; 
}
/** Returns an array containing all characters in myStr, in order.

   *

   *  PRECONDITION: myStr.length() > 0

   */

  public static String[] stringToArray(String myStr) {
    String[] array = new String[myStr.length()];
    for (int i = 0; i < myStr.length(); i++){
        array[i] = myStr.substring(i, i + 1 );
    }
    return array; 

  }
   /**  This method checks each Person in the people array, and if they

    *  are an adult (at least 18 years old), they introduce themselves

    *  (i.e. by calling the introduce() method)

    *

    *  PRECONDITION: people.length > 0

    */

  public static void introduceAdults(Person[] people) {

    for (int i = 0; i < people.length; i++){
        if (people[i].getAge() >= 18){
            people[i].introduce();
        }
    }

  }
  /** Prints each String in wordList, on its own line, in reverse order;

   *  the characters of each string are also reversed.

   *

   *  PRECONDITION: wordList.length > 0

   */

  public static void reversePrint(String[] wordList) {
    String[] dummy = new String[wordList.length];
    for (int j = 0; j < wordList.length; j++){
        String temp = wordList[j];
        StringBuilder stringbuilder = new StringBuilder(temp);
        stringbuilder = stringbuilder.reverse();
        String reversedString = stringbuilder.toString();
        dummy[j] = reversedString; 
        System.out.println(dummy[j]);
    }

  }

   

  public static int[] combine(int[] arr1, int[] arr2){
    int[] dummy = new int[arr1.length +arr2.length];
    int idx = 0; 
    for (int i = 0; i < arr1.length; i ++){
        dummy[idx] = arr1[i];
        idx++; 
    }
    for (int j = 0; j < arr2.length; j++){
        dummy[idx] = arr2[j];
        idx++;
    }
    return dummy; 

  }
}
