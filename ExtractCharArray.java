package Tasks7.day7;
public class ExtractCharArray {
    public static void main(String[] args) {
        // Original string
        String str = "Hello, World!";

        // Extracting character array from string
        char[] charArray = str.toCharArray();

        // Displaying the character array
        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}

