import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecipheringTrisha {
    public static void main(String[] args) {
        Map<String, String> showCipherTable = TrishaCipherTable();

        System.out.println("Trisha's \"Code Chart\" to Decrypt her Encrypted Message.");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                String key = Integer.toString(i) + Integer.toString(j);
                String value = showCipherTable.get(key);
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Trisha's Message to Decrypt: ");
        String EncryptedInput = scanner.nextLine();

        String[] groups = EncryptedInput.split(" ");

        StringBuilder decodedMessage = new StringBuilder();
        for (String group : groups) {
            String[] coordinates = group.split("-");
            for (String coordinate : coordinates) {
                String decodedLetter = showCipherTable.get(coordinate);
                decodedMessage.append(decodedLetter);
            }
            decodedMessage.append(" ");
        }
        System.out.println("Decoded Message from Trisha: " + decodedMessage.toString().trim());
    }

    private static Map<String, String> TrishaCipherTable() {
        Map<String, String> cipherTable = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                String key = Integer.toString(i) + Integer.toString(j);
                String value;
                if (i == 4 && j == 6) {
                    value = "<3";
                } else if (i == 4 && j == 7) {
                    value = ".";
                } else {
                    value = Character.toString((char) ('A' + (i - 1) * 7 + (j - 1)));
                }
                cipherTable.put(key, value);
            }
        }
        return cipherTable;
    }
}
