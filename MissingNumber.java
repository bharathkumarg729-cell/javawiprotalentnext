package logicalBuilding1;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5; 
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) arrSum += num;
        
        System.out.println("Missing number: " + (sum - arrSum));
    }
}

