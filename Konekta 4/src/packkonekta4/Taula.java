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
