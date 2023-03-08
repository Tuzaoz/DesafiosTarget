import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        StringBuilder palavraInvertida = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida.append(palavra.charAt(i));
        }

        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}