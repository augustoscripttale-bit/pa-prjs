package a12345;
import java.util.Scanner;
public class Questao_5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pr_in, des, pr_fi;
		
		System.out.println("preço original: ");
		pr_in = leia.nextInt();
		
		System.out.println("desconto: ");
		des = leia.nextInt();
		
		des = pr_in/100*des;
		
		pr_fi = pr_in - des;
		
		System.out.println("preco final: " + pr_fi);
		
		leia.close();
	}
}