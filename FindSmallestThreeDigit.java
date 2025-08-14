package examples;
import java.util.*;

public class FindSmallestThreeDigit {
	public static int findSmallestThreeDigit(int number) {
        String numStr = String.format("%05d", number);
        List<Integer> threeDigitNumbers = new ArrayList<>();

        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 0; j < numStr.length(); j++) {
                for (int k = 0; k < numStr.length(); k++) {
                    if (i != j && j != k && i != k) {
                        String triplet = "" + numStr.charAt(i) + numStr.charAt(j) + numStr.charAt(k);
                        int val = Integer.parseInt(triplet);
                        threeDigitNumbers.add(val);
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int val : threeDigitNumbers) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static int findSumeetSum(int input1, int input2, int input3, int input4, int input5) {
        return findSmallestThreeDigit(input1)
             + findSmallestThreeDigit(input2)
             + findSmallestThreeDigit(input3)
             + findSmallestThreeDigit(input4)
             + findSmallestThreeDigit(input5);
    }

    public static void main(String[] args) {
        int sum1 = findSumeetSum(23792, 37221, 10270, 73391, 12005);
        int sum2 = findSumeetSum(26674, 105, 37943, 95278, 27845);

        System.out.println("Sum1: " + sum1);  // Output: 480
        System.out.println("Sum2: " + sum2);  // Output: 1097
    }
}



