package examples;
import java.util.*;

public class GetSmallestTwoDigit {
	public static int getSmallestTwoDigit(int number) {
        String numStr = String.valueOf(number);
        List<String> twoDigitNumbers = new ArrayList<>();

        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 0; j < numStr.length(); j++) {
                if (i != j) {
                    String pair = "" + numStr.charAt(i) + numStr.charAt(j);
                    twoDigitNumbers.add(pair);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (String s : twoDigitNumbers) {
            int val = Integer.parseInt(s);
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] inputs = {23792, 37221, 10270, 73391, 12005};
        int sum = 0;

        for (int num : inputs) {
            sum += getSmallestTwoDigit(num);
        }

        System.out.println("Sumeet Sum: " + sum);
    }

}
