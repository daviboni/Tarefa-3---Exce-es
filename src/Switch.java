import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int x = 2;
		
		switch (x)
		{
		case 1: 
			System.out.println("Case 1");
		break;
		
		case 2: 
			System.out.println("Case 2");
		break;

		
		case 3: 
			System.out.println("Case 3");
		break;
		
		case 4: 
			System.out.println("Case 4");
		break;

        default: 
        	System.out.println("Else");
		}
		
		short valor = 8;
		byte  outrovalor = 5;
		valor = outrovalor;
	    char caracter = 'y';
		char unicode = '\u0059';
		System.out.println("teste" + caracter );
		outrovalor = valor; 
		float preco = 3.34F;
		float c = 3.34;
		short s = 200;
		byte b = s;
		

	}

}
