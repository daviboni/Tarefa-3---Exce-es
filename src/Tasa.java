import java.util.Scanner;

public class Tasa 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		int idadeH = 0;
		String nome = null;
		
		while (idadeH == 5)
		{
			System.out.println("Digite o nome do pasciente: ");
			nome = leitor.nextLine();
			
			System.out.println("Digite a altura do pasciente: ");
			double altura = Double.parseDouble(leitor.nextLine());
			
			idadeH++;
		}
		
	}
}
