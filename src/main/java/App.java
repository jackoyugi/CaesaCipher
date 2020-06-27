import models.Cipher;
import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Console myConsole = System.console();
        boolean runCipher = true;
        while (runCipher) {
            System.out.println("Hello there this is Caesar Cipher");
            System.out.println("Choose 1 to encrypt or 2 to decrypt or 0 to exit");
            String enter = myConsole.readLine();
            System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
            if (enter.equals("1")) {
                System.out.println("Enter text to encrypt");
                String input = myConsole.readLine();
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                System.out.println("Enter a key");
                int key = myScanner.nextInt();
                Cipher Encode = new Cipher(input, key);
                String encrypted = Encode.encrypt();
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                System.out.println("encrypted text: " + encrypted);
            }else if(enter.equals("2")) {
                System.out.println("Enter encrypted text to decrypt");
                String input = myConsole.readLine();
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                System.out.println("Enter the key used");
                int key = myScanner.nextInt();
                Cipher Decode = new Cipher(input, key);
                String decrypted = Decode.decrypt();
                System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
                System.out.println("decrypted text: " + decrypted);
            } else if (enter.equals("0")) {
                runCipher = false;
            }
        }
    }
}
