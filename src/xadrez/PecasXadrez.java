package xadrez;

import camadaTabuleiro.Peca;
import camadaTabuleiro.Tabuleiro;

public class PecasXadrez extends Peca {
	
	private Cor cor;

	public PecasXadrez(Tabuleiro quadro, Cor cor) {
		super(quadro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
