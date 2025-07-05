import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter book description:");
        String description = scanner.nextLine();
        
        // Convert to lowercase for case-insensitive comparison
        String lowerDescription = description.toLowerCase();
        
        // Split into words and count "uganda"
        String[] words = lowerDescription.split("\\s+");
        int count = 0;
        
        for (String word : words) {
            // Remove any punctuation attached to the word
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.equals("uganda")) {
                count++;
            }
        }
        
        System.out.println("The word 'Uganda' appears " + count + " times.");
        scanner.close();
    }
}