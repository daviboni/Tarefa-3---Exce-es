import java.util.Scanner;

public class ListaExercicio5
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de litros que queira abastecer: ");
		double gasosa = leitor.nextDouble();
		
		double total = ((2.50 * gasosa) + (2 * 3));
		System.out.println(gasosa + " Litros de gasolina e 2 Refrigerantes deu um total: \nR$ " + total);
    }

}
