
public class Conta
{
  
	private String nome;
	private double saldo;
	private long numeroConta;
	private double valor;
	private double saque; 

	
	public double obterSaldo(long numeroConta)
	{
		if(this.numeroConta == numeroConta)
		{
			return this.saldo;
		}
		return 0.0;
	}
	public void extrato ()
	{
		System.out.println("Nome: " + nome);
		System.out.println("Numero Conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}
	
	public void depositar(double valor)
	{
		this.saldo += valor;
		System.out.println("Numero COnta: " + numeroConta);
		System.out.println("Valor depositado: "+ valor);
		
	}
	
	public void sacar(double saque)
	{
		this.saque -=saque;
		System.out.println("Valor Sacado: " + saque);
	}
	
	
}
