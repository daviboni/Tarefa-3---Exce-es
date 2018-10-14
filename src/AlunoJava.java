
public class AlunoJava {
	
	private String nome;
	private String ra;
	private int nota;
	
	public void imprimiNota()
	{
		System.out.println("Nome: " + nome.toUpperCase());
		System.out.println("Nota: " + this.nota);
	}

	public void setNota(int nota)
	{
		this.nota = nota;
	}
}
