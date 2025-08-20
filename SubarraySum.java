package logicalBuilding1;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        
        int sum = 0, start = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > target) {
                sum -= arr[start++];
            }
            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }
}


