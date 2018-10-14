
public class Principal 
{
	public static void main(String[] args) 
	{
		Professor fujioka = new Professor();
		Professor tatiana = new Professor();
		
		fujioka.nome = "Rodrigo Fujioka";
		fujioka.disciplina = "Java";
		
		tatiana.nome = "Tatiana Costa";
		tatiana.disciplina = "Coordenadora";
		
		fujioka.ensina();
		tatiana.ensina();

	}

}
