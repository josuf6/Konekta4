package packkonekta4;

public class Taula {
	//atributuak
	private static Taula nireTaula=null;
	private Gelaxka[][] taula;

	//eraikitzailea(k)
	private Taula() {
		this.taula=new Gelaxka[7][6];
	}

	//gainontzeko metodoak
	public static Taula getNireTaula() {
		if (nireTaula==null) {
			nireTaula=new Taula();
		}
		return nireTaula;
	}
	
	public boolean beteta() {
		boolean beteta=false;
		//TODO
		return beteta;
	}
	
	public boolean zutabBeteta(int pZutab) {
		boolean beteta=false;
		//TODO
		return beteta;
	}
	
	public void fitxaKolorezAldatu(int pZutab) {
		//TODO
	}
	
	public void inprimatuTaula() {
		//TODO
	}
}
