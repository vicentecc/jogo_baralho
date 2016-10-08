package jogo_baralho;

public class Jogador {
	private String nome;
	private int pontuacaoDaRodada;
	private int pontuacao;
	private Carta carta;

	public Jogador(String nome, int pontuacao) {
		this.nome = nome;
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public int getPontuacaoDaRodada() {
		return pontuacaoDaRodada;
	}

	public void setPontuacaoDaRodada(int pontuacaorodada) {
		this.pontuacaoDaRodada = pontuacaorodada;
	}

	@Override
	public String toString() {
		return "Jogador: " + nome + " \nCarta >> " + carta + "\nPontuacão da rodada: " + pontuacaoDaRodada
				+ "\nPontuacão no jogo: " + pontuacao;
	}

}
