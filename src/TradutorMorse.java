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
        System.out.print("(Digite 'Sair' para encerrar o programa)");

        while (true) {
            System.out.print("\nDigite o texto: ");
            String entrada = leitor.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa Encerrado");
                break;
            }

            System.out.print("Resultado: ");
            if (entrada.startsWith(".") || entrada.startsWith("-")) {
                String[] palavras = entrada.split(" ");
                for (String sinal : palavras) {
                    for (String chave : mapaMorse.keySet()) {
                        if (mapaMorse.get(chave).equals(sinal)) {
                            System.out.print(chave);
                            break;
                        }
                    }
                }
            } else {
                String textoNormal = java.text.Normalizer.normalize(entrada, java.text.Normalizer.Form.NFD)
                        .replaceAll("\\p{M}", "")
                        .toUpperCase();

                for (char c : textoNormal.toCharArray()) {
                    String letra = String.valueOf(c);
                    if (mapaMorse.containsKey(letra)) {
                        System.out.print(mapaMorse.get(letra) + " ");
                    }
                }
            }
            System.out.println();
        }

        leitor.close();
    }
}