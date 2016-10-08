package jogo_baralho;
import java.util.ArrayList;

public interface Jogada {
	abstract ArrayList<Carta> pegarCartas(ArrayList<Carta> cartas);
}
