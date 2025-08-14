package examples;
public class TraverseArrayKeyModel1 {
    public static int findKey(int[] input1, int input2) {
        int index = 0;
        int result = 0;
        boolean add = true;

        while (index >= 0 && index < input2) {
            int value = input1[index];
            if (value < 0) break;
            int key = Integer.parseInt(String.valueOf(value).substring(0, 1));
            int next = Integer.parseInt(String.valueOf(value).substring(1));
            result = add ? result + key : result - key;
            add = !add;
            index = next;
        }

        boolean hasNegative = false;
        for (int num : input1) {
            if (num < 0) {
                hasNegative = true;
                break;
            }
        }

        if (!hasNegative) {
            int max = input1[0];
            for (int i = 1; i < input2; i++) {
                if (input1[i] > max) {
                    max = input1[i];
                }
            }
            return max;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {74, -56, 15, 71, 92, 23};
        int result = findKey(arr, arr.length);
        System.out.println(result);
    }
}


