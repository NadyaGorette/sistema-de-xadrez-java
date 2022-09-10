package xadrez;

import camadaTabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public PecasXadrez[][] getPecas() {
		PecasXadrez[][] mat = new PecasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecasXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	private void colocarNovaPeca (char coluna, int fileira, PecasXadrez pecas) {
		tabuleiro.colocarPeca(pecas, new XadrexPosicao(coluna, fileira).posicionar());
	}
	
	private void iniciarPartida() {
		colocarNovaPeca ('b', 6, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca ('e', 8, new Rei(tabuleiro, Cor.BLACK));
		colocarNovaPeca ('e', 1, new Rei(tabuleiro, Cor.WHITE));
	}
}
