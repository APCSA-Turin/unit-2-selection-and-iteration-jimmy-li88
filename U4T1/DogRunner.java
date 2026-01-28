public class DogRunner {
    public static void main(String[] args) {
        String[] myStrs = { "hi", "bye", "what", "purple" };

        int arrLen = myStrs.length;

        int strLen = myStrs[3].length();

        System.out.println(arrLen + strLen);

        String str = myStrs[2].substring(1, 3);

        System.out.println(str);

    }
}
