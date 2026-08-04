package a12345;
import java.util.Scanner;
public class Questao_3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double m;
		
		System.out.println("insira a metragem: ");
		m = leia.nextInt();
		
		m = m/1000;
		
		System.out.println("o valor inserido em km é: " + m);
				
		leia.close();
	}
}