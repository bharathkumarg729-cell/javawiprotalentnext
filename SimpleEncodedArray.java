package Assessment;

public class SimpleEncodedArray {
	 public static void findOriginalFirstAndSum(int[] input1, int input2) {
	        int[] original = new int[input2];
	        int first = 0;
	        int sum = 0;
	        int tempSum = 0;

	        for (int i = 0; i < input2 - 1; i++) {
	            tempSum += input1[i];
	        }

	        first = input1[input2 - 1] - tempSum;
	        original[0] = first;
	        sum = first;

	        for (int i = 1; i < input2; i++) {
	            original[i] = input1[i - 1] + original[i - 1];
	            sum += original[i];
	        }

	        System.out.println("First Element of Original Array: " + first);
	        System.out.println("Sum of Original Array: " + sum);
	    }

	    public static void main(String[] args) {
	        int[] encoded = {3, -4, 6, 2, -6, 3};
	        int size = encoded.length;
	        findOriginalFirstAndSum(encoded, size);
	    }

}
