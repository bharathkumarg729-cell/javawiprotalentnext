package Assessment;
public class AlternateAddSum {

    public static int AddSub(int N, int opt) {
        int result = 0;

        for (int i = N, pos = 0; i >= 1; i--, pos++) {
            if (opt == 1) {
                if (pos % 2 == 0) result += i;
                else result -= i;
            } else if (opt == 2) {
                if (pos % 2 == 0) result += i;
                else result -= i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result (N = 6, opt = 1): " + AddSub(6, 1));
        System.out.println("Result (N = 6, opt = 2): " + AddSub(6, 2));
    }
}


