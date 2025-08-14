package college;

public class palindrome {
    public int getMaxPalindromeRemovals(String input1) {
        input1 = input1.toLowerCase();
        int[] freq = new int[26];
        for (char ch : input1.toCharArray()) {
            freq[ch - 'a']++;
        }
        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }
        if (oddCount == input1.length()) {
            return -1;
        }
        if (oddCount <= 1) {
            return 0;
        }
        return oddCount - 1;
    }

    public static void main(String[] args) {
        palindrome obj = new palindrome();
        String input1 = "Template";  
        int result = obj.getMaxPalindromeRemovals(input1);
        System.out.println("Output: " + result);
    }
}
