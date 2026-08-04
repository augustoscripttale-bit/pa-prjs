package a12345;
import java.util.Scanner;
public class Questao_4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int car;
		
		System.out.println("insira o valor do carro: ");
		car = leia.nextInt();
		
		car = car/100*4;
		
		System.out.println("o ipva do carro é: " + car);
		
		leia.close();
	}
}