import java.util.Scanner;

public class Testando 
{
	public static void main(String[] args) 
	{
		
	   Scanner leitor = new Scanner(System.in);
	   String fim = null;
	   double alturaB = 3;
	   int idadeF = 0;
	   int idadeV = 0;
	   int quantidade = 0;
	   int mulherAP = 0;
       int idadeH = 0;
       while (fim == "fim")
	   {
    		  System.out.println("Digite o nome do pasciente: ");
    		  String nome = leitor.nextLine();
    		
    		  System.out.println("Digite seu sexo: ");
    		  String sexo = leitor.nextLine();
    		
    		  System.out.println("Digite o peso do pasciente: ");
    		  double peso = leitor.nextDouble();
    		
    		  System.out.println("Digite a idade do pasciente: ");
    		  int idade = leitor.nextInt();
    		
    		  System.out.println("Digite a altura do pasciente: ");
    		  double altura = leitor.nextDouble();
    		
    		  quantidade++;
    		
	   }
	}
}
