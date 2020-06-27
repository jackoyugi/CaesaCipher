package models;

import java.io.Console;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Console myConsole = System.console();
        boolean runCaesarCipher = true;

        while (runCaesarCipher) {
            System.out.println("Hello there this is Caesar Cipher");
            System.out.println("Choose encrypt or decrypt or exit");
            String enter = myConsole.readLine();

            if (enter.equals("encrypt")) {
                System.out.println("Enter text to encrypt");
                String input = myConsole.readLine();

                System.out.println("Enter a key");
                int key = myScanner.nextInt();
                Encrypt CaesarCipher = new Encrypt(input, key);
                String encrypted = Encrypt.encrypt(CaesarCipher);


                System.out.println("encrypted text: " + encrypted);

            }else if(enter.equals("decrypt")) {
                System.out.println("Enter encrypted text to decrypt");
                String input = myConsole.readLine();

                System.out.println("Enter the key used");
                int key = myScanner.nextInt();
                Decrypt CaesarCipher = new Decrypt(input, key);
                String decrypted = Decrypt.decrypt(CaesarCipher);


                System.out.println("decrypted text: " + decrypted);

            } else if (enter.equals("exit")) {
                runCaesarCipher = false;

            }

        }

    }
}
