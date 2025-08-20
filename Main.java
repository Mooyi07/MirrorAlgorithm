import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        String properAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String mirrorAlphabet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        try (BufferedReader br = new BufferedReader(new FileReader("inputs.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Input string: " + line);

                StringBuilder mirrored = new StringBuilder();
                for (char c : line.toCharArray()) {
                    // Convert lowercase to uppercase first
                    char upper = Character.toUpperCase(c);

                    int index = properAlphabet.indexOf(upper);
                    if (index != -1) {
                        mirrored.append(mirrorAlphabet.charAt(index));
                    } else {
                        mirrored.append(c); // numbers, spaces, symbols remain unchanged
                    }
                }

                System.out.println("Mirrored string: " + mirrored + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        s1.close();
    }
}
