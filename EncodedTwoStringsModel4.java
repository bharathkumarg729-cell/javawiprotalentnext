package Assessment;

public class EncodedTwoStringsModel4 {
	public static String[] splitWord(String word) {
        int len = word.length();
        int base = len / 3;
        int rem = len % 3;

        int p1Len, p2Len, p3Len;

        if (rem == 0) {
            p1Len = base;
            p2Len = base;
            p3Len = base;
        } else if (rem == 1) {
            p1Len = base;
            p2Len = base + 1;
            p3Len = base;
        } else {
            p1Len = base + 1;
            p2Len = base;
            p3Len = base + 1;
        }

        String part1 = word.substring(0, p1Len);
        String part2 = word.substring(p1Len, p1Len + p2Len);
        String part3 = word.substring(p1Len + p2Len);

        return new String[]{part1, part2, part3};
    }

    public static void generatePassword(String input1, String input2) {
        String[] w1 = splitWord(input1);
        String[] w2 = splitWord(input2);

        String password = w2[2] + w1[1] + w2[1] + w1[0];
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        generatePassword("WIPRO", "TECHNOLOGIES");   
        generatePassword("MACHINE", "LEARNING");         }

}
