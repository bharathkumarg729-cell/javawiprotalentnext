package examples;
import java.util.*;
public class FindLargestThreeDigit {
	public static int findLargestThreeDigit(int number) {
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

        int max = Integer.MIN_VALUE;
        for (int val : threeDigitNumbers) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static int findSumeetSum(int input1, int input2, int input3, int input4, int input5) {
        return findLargestThreeDigit(input1)
             + findLargestThreeDigit(input2)
             + findLargestThreeDigit(input3)
             + findLargestThreeDigit(input4)
             + findLargestThreeDigit(input5);
    }

    public static void main(String[] args) {
        int sum1 = findSumeetSum(23792, 37221, 10270, 73391, 12005);
        int sum2 = findSumeetSum(26674, 105, 37943, 95278, 27845);

        System.out.println("Sum1: " + sum1);  // Output: 3920
        System.out.println("Sum2: " + sum2);  // Output: 4112
    }

}
