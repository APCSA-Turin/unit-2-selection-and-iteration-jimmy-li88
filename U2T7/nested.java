public class nested {

    public static void main(String[] args) {
    }



public int maxBlock(String str) {
    int maxBlock = 0;
    int currentBlock = 0;
    char previousChar = '\0';

    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);
        if (currentChar == previousChar) {
            currentBlock++;
        } else {
            currentBlock = 1;
            previousChar = currentChar;
        }
        if (currentBlock > maxBlock) {
            maxBlock = currentBlock;
        }
    }
    return maxBlock;
}
}