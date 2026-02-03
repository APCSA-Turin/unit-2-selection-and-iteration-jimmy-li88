package U4T2;

public class ArrayAlgorithms {
    public static double average(int[] numList) {
        double total = 0.0;
        for (int i = 0; i < numList.length; i++) {
            total = total + numList[i];
        }
        return total / numList.length;
    }

    public static int minimum(int[] numList) {
        int min = 0;
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < min) {
                min = numList[i];
            }
        }
        return min;
    }

    public static int howManyContain(String[] strList, String target) {

        int total = 0;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].indexOf(target) != -1) {
                total++;
            }
        }
        return total;
    }

    /**
     * Returns an array containing all characters in myStr, in order.
     *
     * 
     * 
     * PRECONDITION: myStr.length() > 0
     * 
     */

    public static String[] stringToArray(String myStr) {
        String[] array = new String[myStr.length()];
        for (int i = 0; i < myStr.length(); i++) {
            array[i] = myStr.substring(i, i + 1);
        }
        return array;

    }

    /**
     * This method checks each Person in the people array, and if they
     * 
     * are an adult (at least 18 years old), they introduce themselves
     * 
     * (i.e. by calling the introduce() method)
     *
     * 
     * 
     * PRECONDITION: people.length > 0
     * 
     */

    public static void introduceAdults(Person[] people) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }

    }

    /**
     * Prints each String in wordList, on its own line, in reverse order;
     * 
     * the characters of each string are also reversed.
     *
     * 
     * 
     * PRECONDITION: wordList.length > 0
     * 
     */

    public static void reversePrint(String[] wordList) {
        String[] dummy = new String[wordList.length];
        for (int j = 0; j < wordList.length; j++) {
            String temp = wordList[j];
            StringBuilder stringbuilder = new StringBuilder(temp);
            stringbuilder = stringbuilder.reverse();
            String reversedString = stringbuilder.toString();
            dummy[j] = reversedString;
            System.out.println(dummy[j]);
        }

    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] dummy = new int[arr1.length + arr2.length];
        int idx = 0;
        for (int i = 0; i < arr1.length; i++) {
            dummy[idx] = arr1[i];
            idx++;
        }
        for (int j = 0; j < arr2.length; j++) {
            dummy[idx] = arr2[j];
            idx++;
        }
        return dummy;

    }

    /**
     * Changes the first and last element of nums to be num
     *
     * 
     * 
     * THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     * 
     * PRECONDITION: nums.length > 0
     * 
     */

    public static void bookEnd(int[] nums, int num) {

        int firstNum = 0;
        int lastNum = nums.length - 1;
        nums[firstNum] = num;
        nums[lastNum] = num;

    }

    /**
     * Multiplies each number in numList by multiplier.
     *
     * 
     * 
     * THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     * 
     * PRECONDITION: numList.length > 0
     * 
     */

    public static void multiplyBy(int[] numList, int multiplier) {

        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }

    }

    /**
     * Returns an array of ints where each element is the product
     * 
     * of the corresponding element in numList and multiplier.
     *
     * 
     * 
     * THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     * 
     * PRECONDITION: numList.length > 0
     * 
     */

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] dummy = new int[numList.length];
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] = numList[i] * multiplier;
        }
        return dummy;

    }

    /**
     * Adds a "!" to the end of each String in wordList. However, if a
     * 
     * a string already ends in an exclamation point, do NOT add another.
     *
     * 
     * 
     * THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     * 
     * PRECONDITION: wordList.length > 0
     * 
     */

    public static void addExclamation(String[] wordList) {

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].substring(wordList[i].length() - 1).equals("!")) {
                ;
            } else {
                wordList[i] = wordList[i] + "!";
            }
        }
    }

    /**
     * Returns an array of booleans where each element reflects whether
     * 
     * the corresponding element in tempList is at or below the freezing
     * 
     * temperature of 32 (true) or not (false).
     *
     * 
     * 
     * THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     * 
     * PRECONDITION: tempList.length > 0
     * 
     */

    public static boolean[] isFreezing(int[] tempList) {
        boolean[] dummy = new boolean[tempList.length];
        for (int i = 0; i < dummy.length; i++) {
            if (tempList[i] < 32) {
                dummy[i] = true;
            } else {
                dummy[i] = false;
            }
        }
        return dummy;
    }

    /**
     * Shifts all elements in numList to the LEFT one index
     *
     * 
     * 
     * The first element in the array should wrap around
     * 
     * to the back of the array. For example, given the array
     * 
     * {5, 1, 3, 4, 7, 6}, this method modifies the array
     * 
     * to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     * 
     * with the last element wrapping around to the back)
     *
     * 
     * 
     * THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     * 
     * PRECONDITION: numList.length > 0
     * 
     */

    public static void shiftLeft(int[] numList) {
        int firstElement = numList[0];
        for (int i = 1; i < numList.length; i++) {
            numList[i - 1] = numList[i];
        }
        numList[numList.length - 1] = firstElement;

    }

    /**
     * Shifts all elements in numList to the RIGHT one index.
     *
     * 
     * 
     * The last element in the array should wrap around
     * 
     * to the front of the array. For example, given the array
     * 
     * {5, 1, 3, 4, 7, 6}, this method modifies the array
     * 
     * to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     * 
     * with the last element wrapping around to the front)
     *
     * 
     * 
     * THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     * 
     * PRECONDITION: numList.length > 0
     * 
     */

    public static void shiftRight(int[] numList) {

        int lastElement = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = lastElement;

    }

    /**
     * Reverses all elements in an array.
     *
     * 
     * 
     * For example, given the array {5, 1, 3, 4, 7, 6}, this method
     * 
     * modifies the array to {6, 7, 4, 3, 1, 5}.
     * 
     * Should work with all array lengths (both odd and even).
     *
     * 
     * 
     * THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     * 
     * PRECONDITION: numList.length > 0
     * 
     */

    public static void reverse(int[] numlist) {
        int[] numlist2 = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            int temp = numlist[numlist.length - 1 - i];
            numlist2[i] = temp;
        }

        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = numlist2[i];
        }
    }
}
