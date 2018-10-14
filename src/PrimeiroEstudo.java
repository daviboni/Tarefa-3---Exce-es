import javax.swing.JOptionPane;


public class PrimeiroEstudo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		exibeNome();
		
	}
	
	public static void exibeNome() {
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		JOptionPane.showMessageDialog(null, nome);
	}

}


