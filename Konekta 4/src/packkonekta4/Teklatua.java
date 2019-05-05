package packkonekta4;

import java.util.Scanner;

public class Teklatua {
	//atributuak
	private Scanner sc;
	private static Teklatua nireTeklatua=null;
	

	//eraikitzailea(k)
	private Teklatua() {
		this.sc=new Scanner(System.in);
	}

	//gainontzeko metodoak
	public static Teklatua getNireTeklatua() {
		if (nireTeklatua==null) {
			nireTeklatua=new Teklatua();
		}
		return nireTeklatua;
	}
	
	public int irakurriOsoa() {
		Int zenb = this.sc.nextInt();
		
		return zenb;
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