package questoes_de_pa;
import java.util.Scanner;
public class Questao_a {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int b, a, mul, div;
		
		System.out.println("Apresente a base: ");
		b = leia.nextInt();
		
		System.out.println("Agora apresente a altura: ");
		a = leia.nextInt();
		
		mul = b*a;
		
		div = mul/2;
		
		System.out.println("A area do triangulo é igual a: " + div);
		
		leia.close();
	}
}
