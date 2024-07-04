package ex1;

public class VerificaString {
    public static boolean verificaString(String string1, String string2) {
        if (string1.length() < 2 || string2.length() < 2) {
            return false;
        }

        String nova = string1.substring(string1.length() - 2);
        String nova2 = string2.substring(0, 2);

        return nova.equals(nova2);
    }
}
