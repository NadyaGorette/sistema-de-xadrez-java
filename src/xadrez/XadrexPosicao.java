package xadrez;

import camadaTabuleiro.Posicao;

public class XadrexPosicao {
	private char coluna;
	private int fileira;
	
	public XadrexPosicao(char coluna, int fileira) {
		if( coluna < 'a' || coluna > 'h' || fileira < 1 || fileira > 8) {
			throw new XadrexException("Erro instanciando XadrexPosicao. Valores validos sao de a1 ate h8");
		}
		
		this.coluna = coluna;
		this.fileira = fileira;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return fileira;
	}

	protected Posicao posicionar() {
		return new Posicao (8 - fileira, coluna - 'a');
	}
	 protected static XadrexPosicao daPosicao( Posicao posicao) {
		 return new XadrexPosicao ((char)('a' - posicao.getColuna()), 8 - posicao.getFileira());
	 }
	
	 @Override
	 public String toString() {
		 return "" + coluna+fileira;
	 }

}
