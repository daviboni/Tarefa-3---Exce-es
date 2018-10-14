import java.util.Scanner;
public class PQP 
{
	
		public static void main(String[] args)
		{
			Scanner leitor = new Scanner(System.in);
			
			int idadeH = 0;
			String nome = null;
			String sexo = null;
			int idade = 0;
			int fim = 0;
			
			while (fim <= 5)
			{
				System.out.println("Digite o nome do pasciente: ");
				nome = leitor.nextLine();
				
				System.out.println("Digite seu sexo: ");
				 sexo = leitor.nextLine();
				
				System.out.println("Digite a altura do pasciente: ");
				double altura = Double.parseDouble(leitor.nextLine());
				
				 
				 System.out.println("Digite o peso do pasciente: ");
				 double peso = Double.parseDouble(leitor.nextLine());
				 
				 System.out.println("Digite a idade do pasciente: ");
				  idade = Integer.parseUnsignedInt(leitor.nextLine());
				
				idadeH++;
			}
			
		}
}



