import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        String properAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String mirrorAlphabet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        System.out.print("Enter a string: ");
        String input = s1.nextLine();
        
        StringBuilder mirrored = new StringBuilder();
        for (char c : input.toCharArray()) {
            // Convert lowercase to uppercase first
            char upper = Character.toUpperCase(c);

            int index = properAlphabet.indexOf(upper);
            if (index != -1) {
                mirrored.append(mirrorAlphabet.charAt(index));
            } else {
                mirrored.append(c); // numbers, spaces, symbols remain the same
            }
        }

        System.out.println("Mirrored string: " + mirrored);

        s1.close();
    }
}
