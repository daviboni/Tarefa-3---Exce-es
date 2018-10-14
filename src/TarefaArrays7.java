import java.util.Scanner;

public class TarefaArrays7 
{
	
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int [] numero = new int [10];
		int b = 1;
		
		for (int i = 0; i<10; i++)
		{
			System.out.println("Digite um numero entre "+ b +"/10");
			numero[i] = leitor.nextInt();
			b++;
			
		}
		binario(numero);
	}
	
	
	public static void binario(int numero[]) 
	{
		StringBuffer binario = new StringBuffer(); // guarda os dados
		for (int i = 0; i<10; i++)
		{
		int d = numero[i];
	
		while (d > 0) 
		{
			int b = d % 2;
			binario.append(b);
			d = d >> 1; // é a divisão que você deseja
		}
		System.out.println("  "+binario.reverse().toString() ); // inverte a ordem e imprime

		}
	}

}
