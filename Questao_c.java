package questoes_de_pa;
import java.util.Scanner;
public class Questao_c {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, temp;
		
		System.out.println("digite valor a: ");
		a = leia.nextInt();
		
		System.out.println("digite valor b: ");
		b = leia.nextInt();
		
		temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("valor a é igual a: " + a);
		
		System.out.println("valor b é igual a: " + b);
		
		leia.close();
	}
}