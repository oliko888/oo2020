import java.util.Scanner;


public class Kodu2 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Sisesta int");


        int Number = myObj.nextInt();
        System.out.println("Ruutjuur on: " + Math.sqrt(Number));

    }   
}

