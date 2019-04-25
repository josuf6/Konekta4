package packkonekta4;

import java.util.Scanner;

public class Teklatua {
	//atributuak
	private static Teklatua nireTeklatua=null;
	private Scanner sc;

	//eraikitzailea(k)
	private Teklatua() {
	}

	//gainontzeko metodoak
	public static Teklatua getNireTeklatua() {
		if (nireTeklatua==null) {
			nireTeklatua=new Teklatua();
		}
		return nireTeklatua;
	}
	
	public int irakurriOsoa(String pAurrekoMezua, int pNondik, int pNora) {
		int zenbakia=0;
		//TODO
		return zenbakia;
	}
	
	public String irakurriString(String pAurrekoMezua) {
		String mezua=null;
		//TODO
		return mezua;
	}
	
	public char irakurriChar(String pAurrekoMezua) {
		char mezua=' ';
		//TODO
		return mezua;
	}
}