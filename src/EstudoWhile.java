import java.util.Scanner;


public class EstudoWhile 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a quantidade de Bem Vindo gostaria: ");
		int repeticao = leitor.nextInt();
		int i ;
		
		for (i = 0; i < repeticao; i++)
		{
			System.out.println("BEM VINDO !!!!!!");
		}
	}
}
