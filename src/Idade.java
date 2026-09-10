import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 1;
        int anoNascimento;
        int anoAtual;
        int idade;

        while (i <= 6) {

            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = entrada.nextInt();

            System.out.print("Digite o ano atual: ");
            anoAtual = entrada.nextInt();

            idade = anoAtual - anoNascimento;

            System.out.println("Idade: " + idade);

            if (idade >= 18) {
                System.out.println("MAIOR de idade");
            } else {
                System.out.println("MENOR de idade");
            }

            i++;
        }

        entrada.close();
    }
}