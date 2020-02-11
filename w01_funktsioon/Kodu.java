import java.util.Scanner;  // Import the Scanner class


public class Kodu {

    private void call() {
        System.out.print("Ruutjuur 4 on: " + Math.sqrt(4));
    }

    public static void main(String[] args) {
        Kodu h1 = new Kodu();
        h1.call();

        System.out.println("/n");
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");


        String userName = myObj.nextLine();
        System.out.println("Nimi on: " + userName);
    }   

}

