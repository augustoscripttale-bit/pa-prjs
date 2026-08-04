package a12345;
import java.util.Scanner;
public class Questao_1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int v1, v2, v3, soma;
		
		System.out.println("insira o primeiro valor: ");
		v1 = leia.nextInt();
		
		System.out.println("insira o segundo valor: ");
		v2 = leia.nextInt();
		
		System.out.println("insira o terceiro valor: ");
		v3 = leia.nextInt();
		
		soma = v1*v1+v2*v2+v3*v3;
		
		System.out.println("o valor é: " + soma);
		
		leia.close();
	}
}