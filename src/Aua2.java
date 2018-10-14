import java.util.Scanner;

public class Aua2
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		double idade = leitor.nextDouble();
		
		System.out.println("Digite sua data de nascimento: ");
		int data = leitor.nextInt();
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua data de nascimento é: " + data);
		

	}

}
