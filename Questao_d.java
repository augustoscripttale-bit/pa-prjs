package questoes_de_pa;
import java.util.Scanner;
public class Questao_d {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia, anos, meses;
		
		System.out.println("insira o dia: ");
		dia = leia.nextInt();
		
		anos = dia/365;
		
		meses = dia/30;
		
		System.out.println("anos: " + anos);
		
		System.out.println("meses: " + meses);
		
		leia.close();
	}
}