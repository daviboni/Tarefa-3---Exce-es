import java.util.Scanner;
public class TarefaArray5 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		int[] number = new int[10];
		int aux = 0;

		for (i = 0; i <10; i++)
		{
			System.out.println("Digite o numero: ");
			number[i] = leitor.nextInt();
		}
		ordena(number);
		System.out.println("Numeros em forma ordenada crescente: ");
		for (int numero : number)
		{
       	  System.out.println(numero);

		}
		
	}
	
	public static void ordena(int number[])
	{
		int i, a,aux;
        for(i =0; i<10; i++)
        {
            for(a =0; a <9; a++)
            {
               if(number[a]> number[a+1])
               {
                    aux = number[a];
                    number[a] = number[a+1];
                    number[a+1] = aux;
               }
            }
        }

	}
	
		
		
}