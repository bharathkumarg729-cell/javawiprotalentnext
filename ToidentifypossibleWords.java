package college;
import java.util.List;
import java.util.ArrayList;

public class ToidentifypossibleWords {
    public String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase();
        String[] candidates = input2.toLowerCase().split(":");
        List<String> matches = new ArrayList<>();

        for (String word : candidates) {
            if (word.length() != input1.length()) continue;
            boolean isMatch = true;
            for (int i = 0; i < word.length(); i++) {
                if (input1.charAt(i) != '_' && input1.charAt(i) != word.charAt(i)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                matches.add(word.toUpperCase());
            }
        }

        if (matches.isEmpty()) {
            return "ERROR-009";
        }

        return String.join(" ", matches);
    }

    public static void main(String[] args) {
        ToidentifypossibleWords obj = new ToidentifypossibleWords();

        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";

        String result = obj.identifyPossibleWords(input1, input2);
        System.out.println("Output: " + result);
    }
}
