package examples;

public class FindPasswordModel1 {
	public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] inputs = {input1, input2, input3, input4, input5};
        int stableCount = 0, unstableCount = 0;

        for (int num : inputs) {
            int[] freq = new int[10];
            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                freq[ch - '0']++;
            }

            int freqValue = 0;
            boolean isStable = true;
            for (int f : freq) {
                if (f > 0) {
                    if (freqValue == 0) {
                        freqValue = f;
                    } else if (freqValue != f) {
                        isStable = false;
                        break;
                    }
                }
            }

            if (isStable) {
                stableCount++;
            } else {
                unstableCount++;
            }
        }

        return (unstableCount * 10) + stableCount;
    }

    public static void main(String[] args) {
        int input1 = 12, input2 = 1313, input3 = 122, input4 = 678, input5 = 898;
        int result = findPassword(input1, input2, input3, input4, input5);
        System.out.println(result);
    }
	

}
