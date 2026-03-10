import java.util.HashMap;
import java.util.Scanner;

public class TradutorMorse {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        HashMap<String, String> mapaMorse = new HashMap<>();

        mapaMorse.put("A", ".-");
        mapaMorse.put("B", "-...");
        mapaMorse.put(" ", "/");

        System.out.println("TRADUTOR DE CÓDIGO MORSE");
        System.out.print("Digite o texto que queira traduzir: ");

        String entrada = leitor.nextLine();

        System.out.println("Você digitou: " + entrada);

        leitor.close();
    }
}
