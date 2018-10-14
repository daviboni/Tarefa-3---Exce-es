import java.util.InputMismatchException;
import java.util.Scanner;

public class TrabalhoJavaEx
{
	public void exNome ()
	{
	  Scanner leitor = new Scanner(System.in);
	  try
	  {
		  System.out.println("Digite Seu nome: ");
		  String nome = leitor.nextLine();
		  
		  System.out.println("Digite seu idade: ");
		   int idade = leitor.nextInt();
		   
		  System.out.println("Nome: "+nome+ "\n Idade: "+idade);
		  
	  }	catch (Exception erro)
	    {
		  System.out.println("Ocorreu um erro: " +erro);
		  
		}
     }
	
	
		 
		 
		 public void mediaIMC()
			{
				 Scanner leitor = new Scanner(System.in);
				 
				 
				 
				 try
				 {
					 System.out.println("Digite seu Peso: ");
					  double peso = leitor.nextDouble();
					  
					 System.out.println("Digite sua Altura: ");
					  double altura = leitor.nextDouble();
					  System.out.println("Idade = " +altura);
					  
					  double imc = peso/(altura * altura);
					  System.out.println("Seu indice de masssa corporal é: " +imc);
				 }catch(InputMismatchException exception)
				        {
					       System.out.println("Ocorreu um erro na sua digitação, digite apenas numeros !! ");
					 
				        }catch(ArithmeticException exception)
				         {
				        	System.out.println("Nenhum numero pode ser dividido por zero e ninguém mede 0 metros");
				         }

	          }
		 
		 
		 
		 
		 
		 


	  
	  
	

	
}
