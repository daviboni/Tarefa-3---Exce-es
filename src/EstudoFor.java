import java.util.Scanner;

public class EstudoFor 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int i;
		int varUm = 0;
		for (i = 0; i <5 ; i++)
		{
			System.out.println("Digite um numero");
			int var = leitor.nextInt();
			if (varUm < var)
			{
				varUm = var;
				System.out.println("O maior numero digitado foi: " + varUm);
			}
			
			else
			{
				System.out.println("O maior numero digitado foi: " + varUm);

			}
		}
	}

}

