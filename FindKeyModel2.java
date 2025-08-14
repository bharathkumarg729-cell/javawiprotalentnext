package examples;

public class FindKeyModel2 {
	public static int findKey(int input1, int input2, int input3) {
        int[] thousands = {
            input1 / 1000,
            input2 / 1000,
            input3 / 1000
        };

        int[] hundreds = {
            (input1 / 100) % 10,
            (input2 / 100) % 10,
            (input3 / 100) % 10
        };

        int[] tens = {
            (input1 / 10) % 10,
            (input2 / 10) % 10,
            (input3 / 10) % 10
        };

        int[] units = {
            input1 % 10,
            input2 % 10,
            input3 % 10
        };

        int tMin = Math.min(thousands[0], Math.min(thousands[1], thousands[2]));
        int hMax = Math.max(hundreds[0], Math.max(hundreds[1], hundreds[2]));
        int teMin = Math.min(tens[0], Math.min(tens[1], tens[2]));
        int uMax = Math.max(units[0], Math.max(units[1], units[2]));

        int key = tMin * 1000 + hMax * 100 + teMin * 10 + uMax;
        return key;
    }

    public static void main(String[] args) {
        System.out.println(findKey(3521, 2452, 1352)); 
        System.out.println(findKey(4312, 8921, 7890)); 
    }

}
