import java.util.Scanner;

public class ListaExercicio2 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		while (i < 10)
		{
			System.out.println("Digite um numero: ");
		    if(leitor.nextInt()%2==0)
		    {
		    	System.out.println("Par");
		    }
		    else
		    {
		    	System.out.println("Impar");
		    }
			i++;
			
		
		}
	}

}
