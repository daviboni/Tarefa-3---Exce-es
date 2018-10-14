import java.util.Scanner;

public class ListaExercicio4 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		String nome = "";
		while(nome != "fim")
		{
			System.out.println("Digite o nome do funcionario: ");
		    nome = leitor.nextLine();
			
			System.out.println("Digite o salario do funcionario: ");
			double salario = leitor.nextDouble();
			
			if (salario < 500)
			{
				salario = ((salario * 20) / 100) + salario;
				System.out.println("O salario já reajustado é = R$ " + salario);
			}
			else
			{
				System.out.println("Esse funcionario não tem direito ao aumento por receber mais de R$ 500,00");
			}
			System.out.println(nome);

					
		}
	}
}
