import java.io.Console;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Console myConsole = System.console();
        boolean runCaesarCipher = true;

        while (runCaesarCipher) {
            System.out.println("Hello there this is Caesar Cipher");
            System.out.println("Choose decrypt or encrypt or Exit");
            String enter = myConsole.readLine();
//            String enter = myScanner.nextLine();

            if (enter.equals("decrypt")) {
                System.out.println("Enter text to decrypt");
                String input = myConsole.readLine();
//                String input = myScanner.nextLine();

                System.out.println("Enter a key");
                int key = myScanner.nextInt();
                CaesarCipher CaesarCipher = new CaesarCipher(input, key);
                String decrypted = CaesarCipher.decrypt(CaesarCipher);

                System.out.println("decrypted text: " + decrypted);


            }else if(enter.equals("Encrypt")) {


            } else if (enter.equals("Exit")) {
                runCaesarCipher = false;

            }

        }

    }
}
