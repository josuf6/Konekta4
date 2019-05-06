package packkonekta4;

public class Eraldatu extends Gelaxka {
	//atributuak

	//eraikitzailea(k)
	public Eraldatu() {
		this.kolorea='K';
	}

	//gainontzeko metodoak
	public void gelaxkaEgikaritu(char pTxanda) {
		super.gelaxkaEgikaritu(pTxanda);
		Konekta4.getNireKonekta4().getJokalaria(pTxanda).setKomodinErabilgarria(2);
	}
	
	public void azpikoFitxaKolorezAldatu(int pZutab, int pErrenk) {
		//TODO
	}
}