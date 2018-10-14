import java.util.Scanner;

public class ListaExercicio1
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		int salario = leitor.nextInt();
		
		System.out.println("Digite a porcentagem do aumento: ");
		int aumento = leitor.nextInt();
		
		int porcentagemAumento = (salario * aumento)/100 ;
		
		int salarioAumenta =   porcentagemAumento + salario;

		
		System.out.println("Aumento foi de: R$ "+ porcentagemAumento);		
		System.out.println("Salario atua ja com o aumento foi de: R$ "+ salarioAumenta);

		
		
		
		
		
	}
	

}
