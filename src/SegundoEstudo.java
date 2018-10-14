import java.util.Scanner;

public class SegundoEstudo
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite O 1 Valor a Ser multiplicado: ");
		int Valor1 = leitor.nextInt();
		
		System.out.println("Digite O 2 Valor a Ser multiplicado: ");
		int Valor2 = leitor.nextInt();
		
		System.out.println("Digite O 2 Valor a Ser multiplicado: ");
		int Valor3 = leitor.nextInt();		
		
		int Valor4 = (Valor1 + Valor2 + Valor3) / 3;

				
		if (Valor4 > 7)
		{
			System.out.println("Aprovado \n Media Final: " + Valor4);
		}
		
		else
		{
			System.out.println("Reprovado. Media Final: " + Valor4);
		}


	}
	
}
