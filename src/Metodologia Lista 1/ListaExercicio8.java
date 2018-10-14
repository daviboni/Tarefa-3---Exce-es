import java.util.Scanner;

public class ListaExercicio8 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int i =0;
		double lucro = 0;
		String nome = null;

		while(i<10)
		{
			System.out.println("Informe o Nome do Cliente: " );
		    nome = leitor.nextLine();

			
			System.out.println("Informe Quantos Dias Passou Hospedado? ");
			double diaria = Double.parseDouble(leitor.nextLine());
			
			if (diaria < 10)
			{
				double conta = (diaria * 40) +(diaria * 15);
				System.out.println("Cliente: " +nome);
			    System.out.println("Valor total da Conta: R$ " + conta );
			    lucro = lucro + diaria;
			    
							
			}
			else
			{
				double conta = (diaria * 40)+ (diaria* 8);
				System.out.println("Cliente: " +nome);
			    System.out.println("Valor total da Conta: R$ " + conta );
			    lucro = lucro + diaria;
			}
			
		    
		}
		System.out.println("Lucro do Hotel: R$ " + lucro);
		
	}

}
