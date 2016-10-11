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
	
	public int PontuacaoDaCarta(Jogador jg) {
		int ouro = 200;
		int copas = 150;
		int espada = 100;
		int paus = 50;
		int a = 1;
		int j = 11;
		int q = 12;
		int k = 13;
		Carta c = jg.getCarta();
		int pontosJ = 0;

		if (c.getNaipe() == "ouro") {
			pontosJ = ouro;
		} else if (c.getNaipe() == "copas") {
			pontosJ = copas;
		} else if (c.getNaipe() == "espadas") {
			pontosJ = espada;
		} else if (c.getNaipe() == "paus") {
			pontosJ = paus;
		}

		if (c.getValor() == "A") {
			pontosJ = pontosJ + a;
		} else if (c.getValor() == "J") {
			pontosJ = pontosJ + j;
		} else if (c.getValor() == "Q") {
			pontosJ = pontosJ + q;
		} else if (c.getValor() == "K") {
			pontosJ = pontosJ + k;
		} else {
			int p = Integer.parseInt(c.getValor());
			pontosJ = pontosJ + p;
		}

		return pontosJ;
	}

	@Override
	public String toString() {
		return "Jogador: " + nome + " \nCarta >> " + carta + "\nPontuacão da rodada: " + pontuacaoDaRodada
				+ "\nPontuacão no jogo: " + pontuacao;
	}

}
