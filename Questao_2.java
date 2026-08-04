package a12345;
import java.util.Scanner;
public class Questao_2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int in, suc, ant;
		
		System.out.println("insira um numero: ");
		in = leia.nextInt();
		
		suc = in + 1;
		
		ant = in - 1;
		
		System.out.println("o antecessor é: " + ant + " e o sucessor é: " + suc);
		
		leia.close();
	}
}