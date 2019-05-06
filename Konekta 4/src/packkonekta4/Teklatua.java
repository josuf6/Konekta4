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
		int zenb = this.sc.nextInt();
		return zenb;
	}
	
	public String irakurriString() {
		String mezua = this.sc.nextLine();
		return mezua;
	}
	
	public char irakurriChar() {
		char karakterea=sc.next().charAt(0);
		return karakterea;
	}
}