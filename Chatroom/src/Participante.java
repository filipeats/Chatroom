import javax.swing.JTextArea;

public class Participante extends Thread {
	// Propriedades da classe
	private String nome = "";
	private JTextArea txtMensagens = null;
	
	// Método construtor cheio da classe
	public Participante(String nome, JTextArea txtMensagens) {
		super();
		this.nome = nome;
		this.txtMensagens = txtMensagens;
	}
	
	// Método de execução paralela da classe
	public void run() {
		while (true) {
			try {sleep(1000 * (5 + ((int) (11 * Math.random()))));}
			catch (Exception e) {}
			
			EnvioMensagem.enviar(nome,
								 RepositorioMensagens.getMensagem(),
								 txtMensagens);
		}
	}
}