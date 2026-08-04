package questoes_de_pa;
import java.util.Scanner;
public class Questao_b {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nasc, atual, sub;
		
		System.out.println("ano de nascimento: ");
		nasc = leia.nextInt();
		
		System.out.println("ano atual: ");
		atual = leia.nextInt();
		
		sub = nasc - atual;
		
		System.out.println("voce tem " + sub + "anos!");
		
		leia.close();
	}
}