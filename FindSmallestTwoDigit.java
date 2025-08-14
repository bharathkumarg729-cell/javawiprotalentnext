package examples;

public class FindSmallestTwoDigit {
	public static int findSmallestTwoDigit(int number) {
        String digits = String.valueOf(number);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length(); i++) {
            for (int j = 0; j < digits.length(); j++) {
                if (i != j) {
                    String twoDigit = "" + digits.charAt(i) + digits.charAt(j);
                    int val = Integer.parseInt(twoDigit);
                    if (val < min) {
                        min = val;
                    }
                }
            }
        }
        return min;
    }

    public static int findSumeetSum(int input1, int input2, int input3, int input4) {
        int sum = 0;
        sum += findSmallestTwoDigit(input1);
        sum += findSmallestTwoDigit(input2);
        sum += findSmallestTwoDigit(input3);
        sum += findSmallestTwoDigit(input4);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSumeetSum(23792, 37221, 10270, 73391)); // Output: 47
        System.out.println(findSumeetSum(26674, 105, 37943, 95278));   // Output: 83
    }

}
