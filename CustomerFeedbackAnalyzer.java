package miniproject;
import java.util.*;
import java.util.regex.*;

public class CustomerFeedbackAnalyzer {

    private static final List<String> feedbackList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Customer Feedback Analyzer ---");
            System.out.println("1. Add Feedback");
            System.out.println("2. View All Feedback");
            System.out.println("3. Clean Feedback");
            System.out.println("4. Mask Emails & Phone Numbers");
            System.out.println("5. Count Keyword Occurrences");
            System.out.println("6. Feedback Summary Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> addFeedback();
                    case 2 -> viewFeedback();
                    case 3 -> cleanFeedback();
                    case 4 -> maskSensitiveInfo();
                    case 5 -> countKeyword();
                    case 6 -> feedbackReport();
                    case 7 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                scanner.nextLine();
                choice = 0;
            }

        } while (choice != 7);
    }

    private static void addFeedback() {
        System.out.print("Enter feedback: ");
        String feedback = scanner.nextLine();
        feedbackList.add(feedback);
        System.out.println("Feedback added successfully.");
    }

    private static void viewFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            int i = 1;
            for (String fb : feedbackList) {
                System.out.println(i++ + ". " + fb);
            }
        }
    }

    private static void cleanFeedback() {
        for (int i = 0; i < feedbackList.size(); i++) {
            String cleaned = feedbackList.get(i).trim().replaceAll("[^a-zA-Z0-9@.\\s]", "");
            feedbackList.set(i, cleaned);
        }
        System.out.println("Feedback cleaned successfully.");
    }

    private static void maskSensitiveInfo() {
        Pattern emailPattern = Pattern.compile("[\\w.]+@[\\w.]+");
        Pattern phonePattern = Pattern.compile("\\b\\d{10}\\b");

        for (int i = 0; i < feedbackList.size(); i++) {
            String masked = feedbackList.get(i);
            masked = emailPattern.matcher(masked).replaceAll("[EMAIL]");
            masked = phonePattern.matcher(masked).replaceAll("[PHONE]");
            feedbackList.set(i, masked);
        }
        System.out.println("Sensitive info masked successfully.");
    }

    private static void countKeyword() {
        System.out.print("Enter keyword to count: ");
        String keyword = scanner.nextLine().toLowerCase();
        int count = 0;

        for (String fb : feedbackList) {
            String[] words = fb.toLowerCase().split("\\W+");
            for (String word : words) {
                if (word.equals(keyword)) count++;
            }
        }
        System.out.println("Keyword '" + keyword + "' occurred " + count + " times.");
    }

    private static void feedbackReport() {
        int total = feedbackList.size();
        if (total == 0) {
            System.out.println("Total: 0, Avg: 0, Max: 0, Min: 0");
            return;
        }

        int sum = 0, max = 0, min = Integer.MAX_VALUE;
        for (String fb : feedbackList) {
            int len = fb.trim().split("\\s+").length;
            sum += len;
            max = Math.max(max, len);
            min = Math.min(min, len);
        }
        System.out.println("Total: " + total + ", Avg: " + (sum / total) +
                ", Max: " + max + ", Min: " + min);
    }
}
