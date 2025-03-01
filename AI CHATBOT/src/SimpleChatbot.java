import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! How can I help you?");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Chatbot: Hello! How are you?");
            } else if (userInput.contains("how are you")) {
                System.out.println("Chatbot: I'm just a bot, but I'm doing great!");
            } else if (userInput.contains("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day.");
                break;
            } else {
                System.out.println("Chatbot: I'm not sure how to respond to that.");
            }
        }

        scanner.close();
    }
}
