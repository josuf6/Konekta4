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
		System.out.println("ONGI ETORRI KONEKTA 4 JOKORA!");
		this.jokalariakInskribatu();
		System.out.println("PARTIDA HAS DADILA!");
		while (!this.amaituta()) {
			this.hurrengoTxanda();
		}
		this.irabazlea();
	}
	
	private void jokalariakInskribatu() {
		System.out.println("Lehenengo jokalaria, zure izena idatzi:");
		String izena1=Teklatua.getNireTeklatua().irakurriString();
		this.jokalariak[1]=new Jokalaria(izena1, 'G');
		System.out.println("Bigarren jokalaria, zure izena idatzi:");
		String izena2=Teklatua.getNireTeklatua().irakurriString();
		this.jokalariak[2]=new Jokalaria(izena2, 'H');
	}
	
	private void hurrengoTxanda() {
		int txanda=this.norenTxanda();
		System.out.println(this.jokalariak[txanda].getIzena()+"-(r)en txanda");
		int zutabePos=Teklatua.getNireTeklatua().irakurriOsoa();
		do {
			try {
				if (zutabePos<1 || zutabePos>7) {
					throw new ZutabeEzEgokia();
				}
				else if (Taula.getNireTaula().zutabBeteta(zutabePos)) {
					throw new ZutabeBeteta();
				}
			}
			catch (ZutabeEzEgokia e) {
				e.inprimatu();
				zutabePos=Teklatua.getNireTeklatua().irakurriOsoa();
			}
			catch (ZutabeBeteta e) {
				e.inprimatu();
				zutabePos=Teklatua.getNireTeklatua().irakurriOsoa();
			}
		} while (Taula.getNireTaula().zutabBeteta(zutabePos) && (zutabePos<1 || zutabePos>7));
		Taula.getNireTaula().fitxaKolorezAldatu(zutabePos, this.jokalariak[txanda].getKolorea());
		if (this.jokalariak[txanda].getKomodinErabilgarria()!=0) {
			int errenk=Taula.getNireTaula().getErrenkada(zutabePos);
			System.out.println("Zure komodina erabili nahi duzu? (Bai 'B' edo ez 'E' aukeratu)");
			boolean komodinaErabili=this.komodinaErabiliNahi();
			if (komodinaErabili) {
				try {
					if (this.jokalariak[txanda].getKomodinErabilgarria()==1 && this.bonbaErabiltzeaZentzurikEz(zutabePos, errenk, this.jokalariak[txanda].getKolorea())) {
						throw new KomodinaErabiltzeaZentzurikEz();
					}
					else if (this.jokalariak[txanda].getKomodinErabilgarria()==2 && this.eraldatuErabiltzeaZentzurikEz(zutabePos, errenk)) {
						throw new KomodinaErabiltzeaZentzurikEz();
					}
				}
				catch (KomodinaErabiltzeaZentzurikEz e) {
					e.inprimatu();
					komodinaErabili=this.komodinaErabiliNahi();
				}
			}
			if (komodinaErabili) {
				Gelaxka gelaxka=Taula.getNireTaula().getGelaxka(zutabePos, errenk);
				if (gelaxka instanceof Bonba) {
					((Bonba)gelaxka).ingurukoakDesagertu(zutabePos, errenk);
				}
				else if (gelaxka instanceof Eraldatu) {
					((Eraldatu)gelaxka).azpikoFitxaKolorezAldatu(zutabePos, errenk, this.jokalariak[txanda].getKolorea());
				}
			}
		}
		this.txanda=this.txanda+1;
	}
	
	private int norenTxanda() {
		int norenTxanda;
		if (this.txanda%2!=0) {
			norenTxanda=1;
		}
		else {
			norenTxanda=2;
		}
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
	
	private boolean komodinaErabiliNahi() {
		boolean komodinaErabili=false;
		boolean erantzunZuzena=false;
		char erantzuna=Teklatua.getNireTeklatua().irakurriChar();
		while (!erantzunZuzena) {
			if (erantzuna=='b' || erantzuna=='B') {
				komodinaErabili=true;
				erantzunZuzena=true;
			}
			else if (erantzuna=='e' || erantzuna=='E') {
				erantzunZuzena=true;
			}
			else {
				System.out.println("Erantzun egoki bat eman, mesedez");
			}
		}
		return komodinaErabili;
	}
	
	private boolean bonbaErabiltzeaZentzurikEz(int pZutab, int pErrenk, char pKolorea) {
		boolean zentzurikEz=false;
		if (Taula.getNireTaula().albokoakHutsik(pZutab, pErrenk) || Taula.getNireTaula().albokoakKoloreBerdina(pZutab, pErrenk, pKolorea)) {
			zentzurikEz=true;
		}
		return zentzurikEz;
	}
	
	private boolean eraldatuErabiltzeaZentzurikEz(int pZutab, int pErrenk) {
		boolean zentzurikEz=false;
		if (Taula.getNireTaula().azkenekoGelaxka(pZutab, pErrenk)) {
			zentzurikEz=true;
		}
		return zentzurikEz;
	}
}