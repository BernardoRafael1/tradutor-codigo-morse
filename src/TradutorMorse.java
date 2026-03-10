import java.util.HashMap;
import java.util.Scanner;

public class TradutorMorse {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        HashMap<String, String> mapaMorse = new HashMap<>();

        mapaMorse.put("A", ".-");
        mapaMorse.put("B", "-...");
        mapaMorse.put("C", "-.-.");
        mapaMorse.put("D", "-..");
        mapaMorse.put("E", ".");
        mapaMorse.put("F", "..-.");
        mapaMorse.put("G", "--.");
        mapaMorse.put("H", "....");
        mapaMorse.put("I", "..");
        mapaMorse.put("J", ".---");
        mapaMorse.put("K", "-.-");
        mapaMorse.put("L", ".-..");
        mapaMorse.put("M", "--");
        mapaMorse.put("N", "-.");
        mapaMorse.put("O", "---");
        mapaMorse.put("P", ".--.");
        mapaMorse.put("Q", "--.-");
        mapaMorse.put("R", ".-.");
        mapaMorse.put("S", "...");
        mapaMorse.put("T", "-");
        mapaMorse.put("U", "..-");
        mapaMorse.put("V", "...-");
        mapaMorse.put("W", ".--");
        mapaMorse.put("X", "-..-");
        mapaMorse.put("Y", "-.--");
        mapaMorse.put("Z", "--..");
        mapaMorse.put(" ", "/");

        System.out.println("TRADUTOR DE CÓDIGO MORSE");
        System.out.print("Digite o texto que queira traduzir: ");

        String entrada = leitor.nextLine();

        System.out.println("Você digitou: " + entrada);

        System.out.print("Tradução para Morse ");
        String maiusculas = entrada.toUpperCase(); // padroniza pra letras maiúsculas (já que colocamos elas maiusculas lá em cima)

        for (char caractere : maiusculas.toCharArray()) {
            String letra = String.valueOf(caractere); // transforma a frase em uma sequência de caracteres

            if (mapaMorse.containsKey(letra)) {
                System.out.print(mapaMorse.get(letra) + " ");
            } // verifica se o caractere existe no mapa
        }
        System.out.println();

        leitor.close();
    }
}
