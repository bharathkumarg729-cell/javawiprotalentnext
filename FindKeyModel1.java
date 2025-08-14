package examples;

public class FindKeyModel1 {
	public static int findKey(int input1, int input2, int input3) {
        int[] nums = {input1, input2, input3};
        int largestSum = 0;
        int secondLargestSum = 0;

        for (int num : nums) {
            int[] digits = new int[4];
            for (int i = 0; i < 4; i++) {
                digits[i] = num % 10;
                num /= 10;
            }
            java.util.Arrays.sort(digits);
            largestSum += digits[3];
            secondLargestSum += digits[2];
        }

        return largestSum + secondLargestSum;
    }

    public static void main(String[] args) {
        System.out.println(findKey(3521, 2452, 1352)); 
        System.out.println(findKey(9876, 1234, 5678)); 
    }

}
