package packkonekta4;

import java.sql.Array;

public class Konekta4 {
	//atributuak
	private static Konekta4 nireKonekta4=null;
	private Jokalaria[] jokalariak;
	private int txanda;

	//eraikitzailea(k)
	private Konekta4() {
		this.jokalariak=new Jokalaria[2];
		this.txanda=1;
	}

	//gainontzeko metodoak
	public static Konekta4 getNireKonekta4() {
		if (nireKonekta4==null) {
			nireKonekta4=new Konekta4();
		}
		return nireKonekta4;
	}
	
	public void jokoaHasieratu() {
	}
	
	public void partidaBatJolastu() {
		//TODO
	}
	
	private void jokalariakInskribatu() {
		//TODO
	}
	
	private void hurrengoTxanda() {
		//TODO
	}
	
	private String norenTxanda() {
		String norenTxanda=null;
		//TODO
		return norenTxanda;
	}
	
	private boolean amaituta() {
		boolean amaituta=false;
		//TODO
		return amaituta;
	}
	
	private void irabazlea() {
		String irabazlea=null;
		//TODO
		System.out.println("Partidaren irabazlea: "+irabazlea);
	}
}