package packkonekta4;

public class Bonba extends Gelaxka {
	//atributuak
	//pollask
	//eraikitzailea(k)
	public Bonba() {
		this.kolorea='K';
	}

	//gainontzeko metodoak
	public void gelaxkaEgikaritu(char pTxanda) {
		super.gelaxkaEgikaritu(pTxanda);
		Konekta4.getNireKonekta4().getJokalaria(pTxanda).setKomodinErabilgarria(1);
	}
	
	public void ingurukoakDesagertu(int x, int y) {
		//TODO
	}
}