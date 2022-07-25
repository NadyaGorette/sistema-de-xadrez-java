package xadrez.pecas;

import camadaTabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecasXadrez;

public class Rei extends PecasXadrez{

	public Rei(Tabuleiro quadro, Cor cor) {
		super(quadro, cor);
		
	}
	@Override 
	public String toString() {
	return "R";
}
}
