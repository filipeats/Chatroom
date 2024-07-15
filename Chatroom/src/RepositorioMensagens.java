import java.util.ArrayList;

public class RepositorioMensagens {
	// Propriedades da classe
	private static ArrayList<String> colecao =
										new ArrayList<String>();
	
	// Método construtor da classe
	public RepositorioMensagens() {
		colecao.add("Oi sumida !");
		colecao.add("Manda foto de agora...");
		colecao.add("Eu, eu, eu, o framengo se fodeu.");
		colecao.add("Palmeiras não tem mundial !");
		colecao.add("Vambora beber, porra !");
		colecao.add("To chegando");
		colecao.add("To saindo");
		colecao.add("Que dia é a prova do corno ?");
		colecao.add("Onde é hoje ?");
		colecao.add("Passa o pix !");
		colecao.add("Coloca aquele pilantra no grupo.");
		colecao.add("Exclui esse vagabundo do grupo !");
		colecao.add("Onde vai ser a aula hoje ?");
		colecao.add("Tava enchendo o rabo de cachaça ONTEM !");
		colecao.add("Quem fez o trabalho semana passada pra copiar ?");
	}
	
	// Métodos da classe
	public static String getMensagem() {
		return colecao.get((int) (colecao.size() * Math.random()));
	}
}