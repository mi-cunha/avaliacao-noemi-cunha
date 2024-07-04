package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("primeira string:");
        String string1 = scanner.nextLine();

        System.out.print("segunda string:");
        String string2 = scanner.nextLine();

        scanner.close();

        boolean resultado = VerificaString.verificaString(string1, string2);

        System.out.println("verificarFinalString(\"" + string1 + "\", " + "\"" + string2 + "\") == " + resultado);

    }
}
