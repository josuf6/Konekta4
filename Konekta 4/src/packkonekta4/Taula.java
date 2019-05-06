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
	
	public void fitxaKolorezAldatu(int pZutab, char pKolorea) {
		//TODO
	}
	
	public int getErrenkada(int pZutab) {
		int errenkada=0;
		//TODO
		return errenkada;
	}
	
	public boolean albokoakHutsik(int x, int y) {
		boolean hutsik=false;
		//TODO
		return hutsik;
	}
	
	public boolean albokoakKoloreBerdina(int x, int y, char pKolorea) {
		boolean berdina=false;
		//TODO
		return berdina;
	}
	
	public boolean azkenekoGelaxka(int x, int y) {
		boolean azkena=false;
		//TODO
		return azkena;
	}
	
	public Gelaxka getGelaxka(int pZutab, int pErrenk) {
		Gelaxka gelaxka=null;
		//TODO
		return gelaxka;
	}
	
	public void inprimatuTaula(Gelaxka[][] taula) {
		//i errenkada eta j zutabeak
		for(int i=0;i<this.taula.length;i++){
			for(int j=0;j<this.taula[0].length;j++){
				System.out.print(taula[i][j]+" ");
			}
			System.out.print("");
		}
	}
}
