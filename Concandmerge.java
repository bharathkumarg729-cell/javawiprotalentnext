package array;

import java.util.Arrays;

public class Concandmerge {
	public static void main(String[] args) {
		int[] my_array1 = {10,20,30};
		int[] my_array2 = {15,25,35};
		int[] result = new int[my_array1.length + my_array2.length];
		System.arraycopy(my_array1, 0, result, 0, my_array1.length);
		System.arraycopy(my_array2, 0, result, my_array1.length, my_array2.length);
		System.out.println("Concatenated Array = " + Arrays.toString(result));
		
		int[] merged =new int[my_array1.length + my_array2.length];
		System.arraycopy(my_array1, 0, merged, 0, my_array1.length);
		System.arraycopy(my_array2, 0, merged, my_array1.length, my_array2.length);
		System.out.println("Merged Array = " + Arrays.toString(merged));
	}

}
