import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorEnviar implements ActionListener {
	// Propriedades da classe
	private JTextField txtMensagem = null;
	private JTextArea txtMensagens = null;
	
	// Método construtor cheio da classe
	public ControladorEnviar(JTextField txtMensagem, JTextArea txtMensagens) {
		super();
		this.txtMensagem = txtMensagem;
		this.txtMensagens = txtMensagens;
	}

	// Método sobrescrito da interface
	public void actionPerformed(ActionEvent e) {
		txtMensagem.grabFocus();
		
		if (txtMensagem.getText().trim().equals("")) {
			txtMensagem.setText("");
			return;
		}
		
		EnvioMensagem.enviar("Você",
							 txtMensagem.getText(),
							 txtMensagens);
		txtMensagem.setText("");
	}
}