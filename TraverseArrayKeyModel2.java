package examples;

public class TraverseArrayKeyModel2 {
	public static int findKey(int[] input1, int input2) {
        int index = 0;
        int result = 0;
        boolean subtract = false;

        while (index >= 0 && index < input2) {
            int value = input1[index];
            if (value < 0) break;
            String s = String.valueOf(value);
            int key = Integer.parseInt(s.substring(1));
            int next = Integer.parseInt(s.substring(0, 1));
            result = subtract ? result - key : result + key;
            subtract = !subtract;
            index = next;
        }

        boolean hasNegative = false;
        for (int i = 0; i < input2; i++) {
            if (input1[i] < 0) {
                hasNegative = true;
                break;
            }
        }

        if (!hasNegative) {
            int min = input1[0];
            for (int i = 1; i < input2; i++) {
                if (input1[i] < min) {
                    min = input1[i];
                }
            }
            return min;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {47, -65, 51, 17, 29, 32};
        int input2 = input1.length;
        int result = findKey(input1, input2);
        System.out.println(result);
    }

}
