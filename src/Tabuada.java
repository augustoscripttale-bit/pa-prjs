import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int i = 1;
        int resultado;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        while (i <= 10) {

            resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);

            i++;
        }

        entrada.close();
    }
}