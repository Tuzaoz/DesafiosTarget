import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        int anterior = 0;
        int atual = 1;
        boolean pertence = false;

        while (atual <= numero) {
            if (atual == numero) {
                pertence = true;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    };
    }

