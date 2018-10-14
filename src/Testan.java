import java.util.Scanner;

public class Testan {
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		boolean teste = true;
		
		while (teste == true)
		{
			System.out.println("Teste, digite um numero");
			int testando = leitor.nextInt();
			if (testando == 3)
			{
				teste == false;
			}
			
		}
	}

}
