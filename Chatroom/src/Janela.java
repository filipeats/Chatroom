import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JTextField txtMensagem = new JTextField();
	private JButton btnEnviar = new JButton("Enviar");
	private JTextArea txtMensagens = new JTextArea();
	private JScrollPane jspMensagens = new JScrollPane(txtMensagens);
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Janela().setVisible(true);
	}
	
	// Método construtor da classe
	public Janela() {
		// Configuração da janela
		setTitle("Java Multithreaded Chatroom");
		setSize(350, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração da caixa de mensagem
		txtMensagem.setBounds(10, 10, 240, 20);
		add(txtMensagem);
		
		// Configuração do botão de enviar
		btnEnviar.setBounds(255, 10, 69, 19);
		add(btnEnviar);
		btnEnviar.addActionListener(new ControladorEnviar
									(txtMensagem, txtMensagens));
		
		// Configuração da área de mensagens
		jspMensagens.setBounds(10, 40, 315, 360);
		add(jspMensagens);
		txtMensagens.setLineWrap(true);
		
		// Configuração do repositório de mensagens
		new RepositorioMensagens();
		
		// Configuração das threads de participantes
		new Participante("Pedrão", txtMensagens).start();
		new Participante("Michelle", txtMensagens).start();
		new Participante("Vascaíno", txtMensagens).start();
		new Participante("Lebron James", txtMensagens).start();
		new Participante("Gordinho", txtMensagens).start();
	}
}