package jogo_baralho;

import java.util.ArrayList;
import java.util.Collections;

public class Start {

	public static void main(String[] args) {

		Baralho b = new Baralho();
		Jogador j1 = new Jogador("vicente", 0);
		Jogador j2 = new Jogador("boca", 0);

		Carta co1 = new Carta("ouro", "A");
		Carta co2 = new Carta("ouro", "2");
		Carta co3 = new Carta("ouro", "3");
		Carta co4 = new Carta("ouro", "4");
		Carta co5 = new Carta("ouro", "5");
		Carta co6 = new Carta("ouro", "6");
		Carta co7 = new Carta("ouro", "7");
		Carta co8 = new Carta("ouro", "8");
		Carta co9 = new Carta("ouro", "9");
		Carta co10 = new Carta("ouro", "10");
		Carta co11 = new Carta("ouro", "J");
		Carta co12 = new Carta("ouro", "Q");
		Carta co13 = new Carta("ouro", "K");

		b.addCarta(co1);
		b.addCarta(co2);
		b.addCarta(co3);
		b.addCarta(co4);
		b.addCarta(co5);
		b.addCarta(co6);
		b.addCarta(co7);
		b.addCarta(co8);
		b.addCarta(co9);
		b.addCarta(co10);
		b.addCarta(co11);
		b.addCarta(co12);
		b.addCarta(co13);

		Carta cc1 = new Carta("copas", "A");
		Carta cc2 = new Carta("copas", "2");
		Carta cc3 = new Carta("copas", "3");
		Carta cc4 = new Carta("copas", "4");
		Carta cc5 = new Carta("copas", "5");
		Carta cc6 = new Carta("copas", "6");
		Carta cc7 = new Carta("copas", "7");
		Carta cc8 = new Carta("copas", "8");
		Carta cc9 = new Carta("copas", "9");
		Carta cc10 = new Carta("copas", "10");
		Carta cc11 = new Carta("copas", "J");
		Carta cc12 = new Carta("copas", "Q");
		Carta cc13 = new Carta("copas", "K");

		b.addCarta(cc1);
		b.addCarta(cc2);
		b.addCarta(cc3);
		b.addCarta(cc4);
		b.addCarta(cc5);
		b.addCarta(cc6);
		b.addCarta(cc7);
		b.addCarta(cc8);
		b.addCarta(cc9);
		b.addCarta(cc10);
		b.addCarta(cc11);
		b.addCarta(cc12);
		b.addCarta(cc13);

		Carta ce1 = new Carta("espada", "A");
		Carta ce2 = new Carta("espada", "2");
		Carta ce3 = new Carta("espada", "3");
		Carta ce4 = new Carta("espada", "4");
		Carta ce5 = new Carta("espada", "5");
		Carta ce6 = new Carta("espada", "6");
		Carta ce7 = new Carta("espada", "7");
		Carta ce8 = new Carta("espada", "8");
		Carta ce9 = new Carta("espada", "9");
		Carta ce10 = new Carta("espada", "10");
		Carta ce11 = new Carta("espada", "J");
		Carta ce12 = new Carta("espada", "Q");
		Carta ce13 = new Carta("espada", "K");

		b.addCarta(ce1);
		b.addCarta(ce2);
		b.addCarta(ce3);
		b.addCarta(ce4);
		b.addCarta(ce5);
		b.addCarta(ce6);
		b.addCarta(ce7);
		b.addCarta(ce8);
		b.addCarta(ce9);
		b.addCarta(ce10);
		b.addCarta(ce11);
		b.addCarta(ce12);
		b.addCarta(ce13);

		Carta cp1 = new Carta("paus", "A");
		Carta cp2 = new Carta("paus", "2");
		Carta cp3 = new Carta("paus", "3");
		Carta cp4 = new Carta("paus", "4");
		Carta cp5 = new Carta("paus", "5");
		Carta cp6 = new Carta("paus", "6");
		Carta cp7 = new Carta("paus", "7");
		Carta cp8 = new Carta("paus", "8");
		Carta cp9 = new Carta("paus", "9");
		Carta cp10 = new Carta("paus", "10");
		Carta cp11 = new Carta("paus", "J");
		Carta cp12 = new Carta("paus", "Q");
		Carta cp13 = new Carta("paus", "K");

		b.addCarta(cp1);
		b.addCarta(cp2);
		b.addCarta(cp3);
		b.addCarta(cp4);
		b.addCarta(cp5);
		b.addCarta(cp6);
		b.addCarta(cp7);
		b.addCarta(cp8);
		b.addCarta(cp9);
		b.addCarta(cp10);
		b.addCarta(cp11);
		b.addCarta(cp12);
		b.addCarta(cp13);

		// embaralhar as cartas
		Collections.shuffle(b.cartas);

		// array para armazenar as duas cartas escolhidas
		ArrayList<Carta> duasCartas = new ArrayList<Carta>();

		// jogada para pegar as duas primeiras
		Jogada jg = new PegarDuasPrimeiras();

		// verificar pontos da rodada
		int pontosJ1;
		int pontosJ2;

		// ######## primeira rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("=========== 1ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## segunda rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 2ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## terceira rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 3ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## quarta rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 4ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## quinta rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 5ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## sexta rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 6ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## setima rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 7ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## oitava rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 8ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## nona rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 9ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## decima rodada
		// --> atribuir catas aos jogadores
		duasCartas = jg.pegarCartas(b.cartas);
		j1.setCarta(duasCartas.get(0));
		j2.setCarta(duasCartas.get(1));
		// --> Verificando pontos da rodada
		pontosJ1 = b.VerificarPontosDaCarta(j1);
		pontosJ2 = b.VerificarPontosDaCarta(j2);
		// --> setando pontos da rodada
		j1.setPontuacaoDaRodada(pontosJ1);
		j2.setPontuacaoDaRodada(pontosJ2);
		// --> verificar e atribuir 1 ponto para ganhador da rodada
		b.VerificarGanhadorDaRodada(j1, j2);

		System.out.println("\n=========== 10ª RODADA ===========");
		System.out.println(j1);
		System.out.println("---------------------------------");
		System.out.println(j2);

		// resetando variaveis e embaralhando novamente
		pontosJ1 = 0;
		pontosJ2 = 0;
		duasCartas = new ArrayList<Carta>();
		Collections.shuffle(b.cartas);

		// ######## rodada de desempate
		if (j1.getPontuacao() == j2.getPontuacao()) {
			// --> atribuir catas aos jogadores
			duasCartas = jg.pegarCartas(b.cartas);
			j1.setCarta(duasCartas.get(0));
			j2.setCarta(duasCartas.get(1));
			// --> Verificando pontos da rodada
			pontosJ1 = b.VerificarPontosDaCarta(j1);
			pontosJ2 = b.VerificarPontosDaCarta(j2);
			// --> setando pontos da rodada
			j1.setPontuacaoDaRodada(pontosJ1);
			j2.setPontuacaoDaRodada(pontosJ2);
			// --> verificar e atribuir 1 ponto para ganhador da rodada
			b.VerificarGanhadorDaRodada(j1, j2);

			System.out.println("\n======== RODADA DESEMPATE ========");
			System.out.println(j1);
			System.out.println("---------------------------------");
			System.out.println(j2);

			// resetando variaveis e embaralhando novamente
			pontosJ1 = 0;
			pontosJ2 = 0;
			duasCartas = new ArrayList<Carta>();
			Collections.shuffle(b.cartas);

			System.out.println("\n>>>>>>>>>>>>> FIM DE JOGO <<<<<<<<<<<<<");
			Jogador ganhador = b.verificarGanhadorDoJogo(j1, j2);
			System.out
					.println("O ganhador foi: " + ganhador.getNome() + " com " + ganhador.getPontuacao() + " pontos;");
		} else {
			System.out.println("\n>>>>>>>>>>>>> FIM DE JOGO <<<<<<<<<<<<<");
			Jogador ganhador = b.verificarGanhadorDoJogo(j1, j2);
			System.out
					.println("O ganhador foi: " + ganhador.getNome() + " com " + ganhador.getPontuacao() + " pontos;");
		}
	}

}
