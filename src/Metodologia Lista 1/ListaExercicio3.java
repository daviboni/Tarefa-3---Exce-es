import java.util.Scanner;

public class ListaExercicio3 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o numero que deseja para tabuada: ");
		int n = leitor.nextInt();
		int i = 0;
		int t = 0;
		
		for (i = 0; i < 11; i++)
		{
			int g = n * t;
			System.out.println("Tabuada de " + n + " * " + t + " = " + g);
			g = 0;
			t++;
		}
	}

}
