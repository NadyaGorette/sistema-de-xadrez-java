package camadaTabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro criando tabuleiro: E nescessario que haja pelo menos uma linha e uma coluna");
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}
	
	public int getColunas() {
		return colunas;
	}
	
	
	
	public Peca peca(int linhas, int colunas) {
		if(!posicaoExistente(linhas, colunas)) {
			throw new TabuleiroException(" Posicao nao encontrada");
		}
		return pecas [linhas][colunas];
	}
	
	public Peca peca( Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException(" Posicao nao encontrada");
		}
		return pecas[posicao.getFileira()][posicao.getColuna()];
		
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (temUmaPeca(posicao)) {
			throw new TabuleiroException(" Tem uma peça nesta posicao" + posicao);
		}
		pecas[posicao.getFileira()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExistente (int fileira, int coluna) {
	return	fileira >= 0 && fileira < linhas && coluna >= 0 && coluna < colunas; 
	}
	public boolean posicaoExistente (Posicao posicao) {
		return posicaoExistente(posicao.getFileira(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException(" Posicao nao encontrada");
		}
		
		return peca(posicao) != null;
	}
}
	
