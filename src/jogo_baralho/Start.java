package jogo_baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.text.*;

public class Start {

	private Scanner teclado = new Scanner(System.in);
	private Baralho baralho = new Baralho();
	private Jogador j1 = new Jogador("vicente", 0);
	private Jogador j2 = new Jogador("victor", 0);
	
	public Start() {
		processarMenu();
	}
	
	private void processarMenu() {
		String entrada;
		int opcao;
		System.out.println("\n\n <-- Bem vindo ao jogo de cartas (Azar o seu) --> ");
		do {
			exibirMenu();
			try {
				entrada = teclado.nextLine();
				opcao = Integer.parseInt(entrada);
				switch (opcao) {
				case 0:
					break;
				case 1:
					Aleatorio();
					break;
				case 2:
					DuasPrimeiras();
					break;
				case 3:
					PrimeiraEUltima();
					break;
				default:
					System.out.println("Opção Invalida !! \n");
				}
			} catch (NumberFormatException e) {
				System.out.println("Digite somente número! \n");
				opcao = -1;
			} catch (Exception e) {
				System.out.println("erro:" + e.getMessage());
				// e.printStackTrace();
				opcao = -1;
			}
		} while (opcao != 0);
		System.out.println("\n <-- Até Breve -->");
	}
	
	private void exibirMenu() {
		System.out.println("\n\n| - - - - - - - - -  Menu  - - - - - - - - - - - |");
		System.out.println("|  [0]- Sair                                     |");
		System.out.println("|  [1]- Jogo Cartas aleatórias                   |");
		System.out.println("|  [2]- Jogo duas primeiras cartas               |");
		System.out.println("|  [3]- Jogo primeira carta e última carta       |");
		System.out.print("  Opções :");
	}
	
	private void Rodadas(Jogada jg, Baralho b, Jogador j1, Jogador j2){
		// array para armazenar as duas cartas escolhidas
				ArrayList<Carta> duasCartas = new ArrayList<Carta>();

				// verificar pontos da rodada
				int pontosJ1;
				int pontosJ2;

				for(int rodada = 1; rodada < 12; rodada++){
							
					// --> atribuir catas aos jogadores
					
					duasCartas = jg.pegarCartas(b.getBaralho());
//					System.out.println(b.getBaralho().toString());
//					System.out.println(b.getBaralho().size());
					j1.setCarta(duasCartas.get(0));
					j2.setCarta(duasCartas.get(1));
					// --> Verificando pontos da rodada
					pontosJ1 = j1.PontuacaoDaCarta(j1);
					pontosJ2 = j2.PontuacaoDaCarta(j2);
					// --> setando pontos da rodada
					j1.setPontuacaoDaRodada(pontosJ1);
					j2.setPontuacaoDaRodada(pontosJ2);
					// --> verificar e atribuir 1 ponto para ganhador da rodada
					b.VerificarGanhadorDaRodada(j1, j2);

					System.out.println("=========== " + rodada+"ª RODADA ===========");
					System.out.println(j1);
					System.out.println("---------------------------------");
					System.out.println(j2);

					// resetando variaveis e embaralhando novamente
					pontosJ1 = 0;
					pontosJ2 = 0;
					b.removeCarta(duasCartas.get(0));
					b.removeCarta(duasCartas.get(1));
					duasCartas = new ArrayList<Carta>();
					//Collections.shuffle(b.cartas);

					//Caso a rodada 10 nï¿½o termine em empate
					if(rodada == 10 && (j1.getPontuacao() != j2.getPontuacao())){	
							
							System.out.println("\n>>>>>>>>>>>>> FIM DE JOGO <<<<<<<<<<<<<");
							Jogador ganhador = b.verificarGanhadorDoJogo(j1, j2);
							System.out
									.println("O ganhador foi: " + ganhador.getNome() + " com " + ganhador.getPontuacao() + " pontos;");
							baralho = new Baralho();
							j1.setPontuacao(0);
							j2 .setPontuacao(0);
						return;
					}
					else if(rodada == 11){
						System.out.println("\n>>>>>>>>>>>>> FIM DE JOGO <<<<<<<<<<<<<");
						Jogador ganhador = b.verificarGanhadorDoJogo(j1, j2);
						System.out
								.println("O ganhador foi: " + ganhador.getNome() + " com " + ganhador.getPontuacao() + " pontos;");
						baralho = new Baralho();
						j1.setPontuacao(0);
						j2 .setPontuacao(0);
					}
				}	
	}
	
	private void Aleatorio(){
		Jogada jg = new PegarAleatorio();
		Rodadas(jg, baralho, j1, j2);
	}
	
	private void DuasPrimeiras(){
		Jogada jg = new PegarDuasPrimeiras();
		Rodadas(jg, baralho, j1, j2);
	}
	
	private void PrimeiraEUltima(){
		Jogada jg = new PegarPrimUlti();
		Rodadas(jg, baralho, j1, j2);
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
