import java.util.Scanner;

public class ListaExercicio6
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu salario bruto: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Digite o valor da prestação desejada: ");
		double prestacao = leitor.nextDouble();
		
		double a = ((prestacao * 100) / salario);
		
		if (a <= 30)
		{
			System.out.println("Emprestimo APROVADO!.");
		}
		
		else
		{
			System.out.println("Emprestimo NÃO APROVADO!");
		}
	}

}
