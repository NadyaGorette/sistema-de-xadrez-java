package camadaTabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro quadro;
	
	public Peca(Tabuleiro quadro) {
		this.quadro = quadro;
		posicao = null;
	}

	protected Tabuleiro getQuadro() {
		return quadro;
	}

	
	
	
}
