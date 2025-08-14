package test4;
import java.util.HashMap;

public class FindPassword {
	    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
	        int[] inputs = {input1, input2, input3, input4, input5};
	        int stableCount = 0;
	        int unstableCount = 0;

	        for (int num : inputs) {
	            if (isStable(num)) {
	                stableCount++;
	            } else {
	                unstableCount++;
	            }
	        }

	        return unstableCount * 10 + stableCount;
	    }

	    private static boolean isStable(int num) {
	        String s = String.valueOf(num);
	        HashMap<Character, Integer> freq = new HashMap<>();

	        for (char c : s.toCharArray()) {
	            freq.put(c, freq.getOrDefault(c, 0) + 1);
	        }

	        int refFreq = -1;
	        for (int count : freq.values()) {
	            if (refFreq == -1) {
	                refFreq = count;
	            } else if (refFreq != count) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int input1 = 12;
	        int input2 = 1313;
	        int input3 = 122;
	        int input4 = 678;
	        int input5 = 898;

	        int password = findPassword(input1, input2, input3, input4, input5);
	        System.out.println(password);
	    }
	}



