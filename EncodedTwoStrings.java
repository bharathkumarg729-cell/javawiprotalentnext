package Assessment;

public class EncodedTwoStrings {
	public static String[] splitWord(String word) {
        int len = word.length();
        int partSize = len / 3;
        int rem = len % 3;

        String part1, part2, part3;

        if (rem == 0) {
            part1 = word.substring(0, partSize);
            part2 = word.substring(partSize, 2 * partSize);
            part3 = word.substring(2 * partSize);
        } else {
            int part1End = partSize;
            int part2End = partSize + partSize + rem;
            part1 = word.substring(0, part1End);
            part2 = word.substring(part1End, part2End);
            part3 = word.substring(part2End);
        }

        return new String[]{part1, part2, part3};
    }

    public static void generatePassword(String input1, String input2) {
        String[] w1 = splitWord(input1);
        String[] w2 = splitWord(input2);

        String password = w2[0] + w1[0] + w1[2] + w2[2];
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        generatePassword("WIPRO", "TECHNOLOGIES");
        generatePassword("MACHINE", "LEARNING");
    }

}
