public class nestedRunner {
    public static void main(String[] args) {
        nested test = new nested();
        System.out.println(test.maxBlock("hoopla")); // Expected output: 2
        System.out.println(test.maxBlock("abbCCCddBBBxx")); // Expected output: 3
        System.out.println(test.maxBlock("")); // Expected output: 0
    }
}
