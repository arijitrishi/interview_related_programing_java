/*a Java program to compress a string by replacing consecutive duplicate 
  characters with the character followed by its count only if the count is greater than 1 */

import java.util.Scanner;
public class StringCompressor {
    public static String compressString(String input) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i);
            int count = 1;

               while (i + 1 < input.length() && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

                  result.append(currentChar);

                    if (count > 1) {
                result.append(count - 1);
            }

            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
        scanner.close();
    }
}
