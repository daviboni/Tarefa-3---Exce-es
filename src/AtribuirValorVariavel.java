import java.util.Scanner;

public class AtribuirValorVariavel {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Informe o seu nome");
		String nome = leitor.nextLine();
		
		System.out.println("Informe o seu ano de nascimento");
		int anoNascimento = leitor.nextInt();
		
		System.out.println("Informe o sua idade");
		double idade = leitor.nextDouble();
		
				
		System.out.println("Nome: " + nome);
		System.out.println("Ano: " + anoNascimento);
		System.out.println("Idade: " + idade);
		
		
	}

}
