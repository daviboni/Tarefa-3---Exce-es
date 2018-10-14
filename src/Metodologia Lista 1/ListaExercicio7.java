import java.util.Scanner;

public class ListaExercicio7
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int i;
		int alunoRepro = 0;
		int alunoFinal = 0;
		int alunoApro = 0;
		double mediaFinal = 0;


		for (i = 0; i < 6; i++)
		{
			
			System.out.println("Digite a primeira nota do aluno: ");
			double nota1 = leitor.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno: ");
			double nota2 = leitor.nextDouble();
		
			double resultadoFinal = (nota1 + nota2) /2;
			
			if (resultadoFinal < 3)
			{
				System.out.println("Aluno está: REPROVADO ");
				
				alunoRepro++;
			}
			else
			{
				if(resultadoFinal <= 7.0 )
				{
					System.out.println("Aluno está: EXAME FINAL ");
					System.out.println("teste: "+resultadoFinal);
					
					alunoFinal++;

				}
				
				else 
					
				{
					System.out.println("Aluno está: APROVADO ");
					alunoApro++;

				}
			}
			
		    mediaFinal = mediaFinal + resultadoFinal; 
			
		}
		
		mediaFinal = mediaFinal /6;
		
		System.out.println("Numero de Aprovados: " + alunoApro );
		System.out.println("Numero de Alunos no Exame Final: " + alunoFinal );
		System.out.println("Numero de Reprovados: " + alunoRepro );
		System.out.println("Media de Todos Alunos: " +  mediaFinal);




		
	}

}
