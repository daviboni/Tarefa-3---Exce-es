import java.util.Scanner;

public class ListaExercicio9 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int fim = 0;
		double alturaB = 3;
		int idadeF =0;
		int idadeV = 0;
		int quantidade = 0;
		int mulherAP =0;
		int idadeH = 0;
		String nome = null;
		String sexo = null;
		int idade = 0;
		String teste = null;



		while (fim ==0)
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
			
			quantidade++;
			
			
			if (sexo =="homem")
			{
				idadeH = idadeH + idade;
			}
			
			if (sexo == "mulher" )
			{
				
				if (alturaB < altura )
				{
					alturaB = altura;
				}
				if (altura == 1.6 || idade == 1.7 || peso == 70)
				{
					mulherAP++;
					System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " +mulherAP);
				}
			}
			
			if (idade == 18 || idade == 25 )
			{
				idadeF++;
			}
			
			
			if (idadeV < idade)
			{
				idadeV = idade;
				String velho = nome;
			}
			
			System.out.println("Se deseja continuar aperte 0; Se não digite 1 ");
			fim = Integer.parseUnsignedInt(leitor.nextLine());
			
				
		}


		System.out.println("Quantidade de pacientes: " + quantidade);
		System.out.println("a média de idade dos homens" + idadeH);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg. " + mulherAP );
		System.out.println("Quantidade de pessoas com idade entre 18 e 25:" + idadeF);
		System.out.println("Nome do paciente mais velho: " + idadeV);
		System.out.println("Nome da mulher mais baixa: "+ alturaB);

		
		
	}
}
