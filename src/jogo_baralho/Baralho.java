package jogo_baralho;

import java.util.ArrayList;

public class Baralho {
	ArrayList<Carta> cartas = new ArrayList<Carta>();

	public void addCarta(Carta c) {
		cartas.add(c);
	}
	
	public void removeCarta(Carta c){
		cartas.remove(c);
	}

	public Carta pegarCarta(int pos) {
		Carta cc = cartas.get(pos);
		return cc;
	}

	public int VerificarPontosDaCarta(Jogador jg) {
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
		} else if (c.getNaipe() == "espada") {
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

	public void VerificarGanhadorDaRodada(Jogador j1, Jogador j2) {
		int ptsJ1 = j1.getPontuacaoDaRodada();
		int ptsJ2 = j2.getPontuacaoDaRodada();
		int ptsDoJogoJ1 = j1.getPontuacao();
		int ptsDoJogoJ2 = j2.getPontuacao();
		if (ptsJ1 > ptsJ2) {
			j1.setPontuacao(ptsDoJogoJ1 + 1);
		} else if (ptsJ1 < ptsJ2) {
			j2.setPontuacao(ptsDoJogoJ2 + 1);
		} else if (ptsJ1 == ptsJ2) {
			System.out.println("empate");
		}
	}

	public Jogador verificarGanhadorDoJogo(Jogador j1, Jogador j2) {

		int ptsTotalJ1 = j1.getPontuacao();
		int ptsTotalJ2 = j2.getPontuacao();
		Jogador ganhador;

		if (ptsTotalJ1 > ptsTotalJ2) {
			ganhador = j1;
		} else {
			ganhador = j2;
		}
		return ganhador;
	}
	 public String ler(ArrayList<Carta> crt){
		 ArrayList<Carta> ct = crt;
		 for(Carta c : ct){
			 return c.toString();
			}
		return null;
	 }
}
