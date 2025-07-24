public class OnlineTest {
    public static void main(String[] args) {
        String questionType = "Essay"; 
        String selectedOption = null;
        int testCasesPassed = 4;
        int totalTestCases = 5;
        int wordCount = 180;
        int minLimit = 200;

         switch (questionType) {
            case "MCQ":
                if (selectedOption != null) {
                    System.out.println("Answer submitted.");
                } else {
                    System.out.println("Warning: Choose an option before submitting.");
                }
                break;
             case "Code":
                if (testCasesPassed == totalTestCases) {
                    System.out.println("All test cases passed. Auto-submitting answer.");
                } else {
                    System.out.println("Some test cases failed. Please review your code.");
                }
                break;
            case "Essay":
                if (wordCount >= minLimit) {
                    System.out.println("Essay submitted successfully.");
                } else {
                    System.out.println("Prompt: Write more to reach the minimum word limit.");
                }
                break;

            default:
                System.out.println("Invalid question type.");

        }
    }
}