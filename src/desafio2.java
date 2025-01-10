import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;
        boolean pertence = false;

        if (numero == a || numero == b) {
            pertence = true;
        }

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
            if (b == numero) {
                pertence = true;
                break;
            }
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}