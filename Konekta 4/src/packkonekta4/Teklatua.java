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
		String zenb = this.irakurriString();
		boolean egokia=false;
		do {
			try {
				Integer.parseInt(zenb);
				egokia=true;
			}
			catch (NumberFormatException e) {
				zenb=this.irakurriString();
			}
		} while (!egokia);
		return Integer.parseInt(zenb);
	}
	
	public String irakurriString() {
		String mezua = this.sc.nextLine();
		return mezua;
	}
	
	public char irakurriChar() {
		char karakterea=sc.next().charAt(0);
		return karakterea;
	}
	
	public void irakurriEdozeinTekla() {
		try {
			System.in.read();
		}
		catch (Exception e) {
			
		}
	}
}