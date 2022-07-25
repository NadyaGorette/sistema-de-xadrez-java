package xadrez.pecas;

import camadaTabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecasXadrez;

public class Torre extends PecasXadrez {

	public Torre(Tabuleiro quadro, Cor cor) {
		super(quadro, cor);
	}
	@Override
	public String toString() {
		return "T";
	}

}
