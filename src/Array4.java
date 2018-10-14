import java.util.Arrays;
import java.util.Scanner;

public class Array4 
{
	
		public static void main(String[] args) 
		{
			Scanner leitor = new Scanner(System.in);
			
			int i = 0;
			String[] nome = new String[10];

			for (i = 0; i <10; i++)
			{
				System.out.println("Digite o nome: ");
				nome[i] = leitor.nextLine();
			}
			
			Arrays.sort(nome);
			System.out.println("Nomes em ordem alfabetica são: " );
			for (i = 0; i <10; i++)
			{
				System.out.println(nome[i]);

			}
			

		

}
