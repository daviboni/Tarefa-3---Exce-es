import java.util.Scanner;

public class VillaBar 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de cerveja: ");
		int cerva = leitor.nextInt();
		
		int termino = -1;
		while(cerva > 0)
		{
			System.out.println(cerva + " no freezer");
			--cerva;
			System.out.println("Pegou uma garrafa");
			System.out.println("Agora são " + cerva + " cervejas no freezer");
			
			if (cerva == 0)
			{
				System.out.println("Deseja Continuar? DIgite 1 para sim e 0 para não");
			    termino = leitor.nextInt();
			    if (termino == 1)
			    {
			    	System.out.println("Digite a quantidade de cerveja: ");
				    cerva = leitor.nextInt();
			    }
				
			}
			
		}
	}
}
