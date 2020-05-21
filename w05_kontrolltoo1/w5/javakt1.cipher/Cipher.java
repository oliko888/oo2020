import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cipher {

    static String sentence = "Java is gay";
    static int offset = 1;

    public static void main(String[] args) throws IOException {
        System.out.println("Ciphered sentence is: " + cipher(sentence, offset));
        System.out.println("Deciphered sentence is: " + decipher(cipher(sentence, offset), offset));
        fileCipher();
    }

    /*
     * Task 1
     * 
     * Luua klass, mis muudaks ette antava lause tähestiku ulatuses mingisuguse
     * nihkega arusaamatuks (näiteks nihe 1, kus kõik “a”-d muudetakse “b”-deks,
     * “d”-d muudetakse “e”-deks jne)
     */
    public static String cipher(String sentence, int offset) {
        String ciphered = "";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            int ascii = (int) c;
            if (ascii != 32) {
                ascii += offset;
            }
            char e = (char) ascii;
            ciphered = ciphered + e;
        }
        return ciphered;
    }

    /*
     * Task 2
     * 
     * Samuti eksisteeriks ka dešifreerija, et võimalik nihke ette andmisel
     * funktsiooni selle sama sisendi tagasi muutma arusaadavaks
     */
    public static String decipher(String sentence, int offset) {
        String deciphered = "";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            int ascii = (int) c;
            if (ascii != 32) {
                ascii -= offset;
            }
            char e = (char) ascii;
            deciphered = deciphered + e;
        }
        return deciphered;
    }

    /*
     * Task 3
     * 
     * Lugeda failist esimesel real oleva nihke numbri ning ülejäänud read selle
     * nihke abil šifreerida ning salvestada šifreeritud kujul teise faili.
     */
    public static void fileCipher() throws IOException {
        File file = new File("words.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int fileOffset = Integer.parseInt(br.readLine());
        String st = br.readLine();

        FileWriter newFile = new FileWriter("cipheredWords.txt");

        while (st != null) {
            newFile.write(cipher(st, fileOffset) + "\n");
            st = br.readLine();
        }

        br.close();
        newFile.close();
    }

}