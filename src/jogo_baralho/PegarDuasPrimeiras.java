package jogo_baralho;

import java.util.ArrayList;
import java.util.Collections;

public class PegarDuasPrimeiras implements Jogada {

	@Override
	public ArrayList<Carta> pegarCartas(ArrayList<Carta> cartas) {
		ArrayList<Carta> c = new ArrayList<Carta>();
		ArrayList<Carta> cr = new ArrayList<Carta>();
		c = cartas;
		
		// embaralhar as cartas
		Collections.shuffle(c);
		
		Carta carta1;
		Carta carta2;
		carta1 = c.get(0);
		carta2 = c.get(1);

		cr.add(carta1);
		cr.add(carta2);
		return cr;
	}

}
