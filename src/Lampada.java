
public class Lampada {
	private boolean estaLigada;
	
	public boolean getEstaligada()
	{
		return this.estaLigada;
	}
	public void ligar()
	{
		if(!getEstaligada())
		{
		this.estaLigada = true;
		}
		else 
		{
			System.out.println("A lampada j� est� ligada! ");
		}
	}
	
	public void desligar()
	{
		this.estaLigada = false;
	}

}
