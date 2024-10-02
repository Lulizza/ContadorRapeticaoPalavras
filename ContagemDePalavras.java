import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemDePalavras {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String frase, palavra = "";

        Map<String, Integer> contagemPalavra = new HashMap<>();

        System.out.println("Digite a frase a qual você deseja fazer a contagem: ");
        frase = scnr.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ') {
                palavra += frase.charAt(i);
            }
            if (frase.charAt(i) == ' ' || i == frase.length()-1) {
                if (palavra.length()>0) {
                    contagemPalavra.put(palavra, contagemPalavra.getOrDefault(palavra, 0) + 1);
                    palavra = "";
                }
            }
        }
        System.out.println(contagemPalavra);
    }
}
