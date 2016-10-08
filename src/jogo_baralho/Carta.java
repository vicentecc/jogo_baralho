package jogo_baralho;

public class Carta {
	private String naipe;
	private String valor;
	
	public Carta(String naipe, String valor){
		this.naipe = naipe;
		this.valor = valor;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Naipe: " + naipe + ", valor:" + valor;
	}	
	
}
