package jogo_baralho;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PegarAleatorio implements Jogada{

	@Override
	public ArrayList<Carta> pegarCartas(ArrayList<Carta> cartas) {
		ArrayList<Carta> c = new ArrayList<Carta>();
		ArrayList<Carta> cr = new ArrayList<Carta>();
		c = cartas;
		
		
		// embaralhar as cartas
		Collections.shuffle(c);
		Carta carta1;
		Carta carta2;
//		ArrayList <Integer> pegaSort = new ArrayList<Integer>();
//		for(int i = 0; i < c.size(); i++){
//			pegaSort.add(i);
//		}
		Random pegaSort = new Random();
		carta1 = c.get(pegaSort.nextInt(c.size() - 1));
		carta2 = c.get(pegaSort.nextInt(c.size() - 1));

		cr.add(carta1);
		cr.add(carta2);
		return cr;
	}

}
