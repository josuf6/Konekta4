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
		boolean beteta=true;
		int zutabe=0;
		while (beteta && zutabe<this.taula.length) {
			if (!this.zutabBeteta(zutabe)) {
				beteta=false;
			}
			zutabe++;
		}
		return beteta;
	}
	
	public boolean zutabBeteta(int pZutab) {
		boolean beteta=true;
		int errenkada=0;
		while (beteta && errenkada<this.taula[0].length) {
			if (this.taula[pZutab][errenkada].getKolorea()==' ' || this.taula[pZutab][errenkada].getKolorea()=='K') {
				beteta=false;
			}
			errenkada++;
		}
		return beteta;
	}
	
	public void fitxaKolorezAldatu(int pZutab, int pErrenk, int pTxanda) {
		this.taula[pZutab][pErrenk].gelaxkaEgikaritu(pTxanda);
	}
	
	public int getErrenkada(int pZutab) {
		int errenkada=0;
		boolean aurkituta=false;
		while (!aurkituta && errenkada+1<this.taula[0].length) {
			errenkada++;
			if (this.taula[pZutab][errenkada].getKolorea()=='G' || this.taula[pZutab][errenkada].getKolorea()=='H') {
				aurkituta=true;
			}
		}
		return errenkada-1;
	}
	
	public boolean albokoakHutsik(int pZutab, int pErrenk) {
		boolean hutsik=false;
		if (pZutab==0) {
			if (this.taula[pZutab+1][pErrenk].getKolorea()==' ' || this.taula[pZutab+1][pErrenk].getKolorea()=='K') {
				hutsik=true;
			}
		}
		else if (pZutab==this.taula.length-1) {
			if (this.taula[pZutab-1][pErrenk].getKolorea()==' ' || this.taula[pZutab-1][pErrenk].getKolorea()=='K') {
				hutsik=true;
			}
		}
		else {
			if ((this.taula[pZutab+1][pErrenk].getKolorea()==' ' || this.taula[pZutab+1][pErrenk].getKolorea()=='K') || (this.taula[pZutab-1][pErrenk].getKolorea()==' ' || this.taula[pZutab-1][pErrenk].getKolorea()=='K')) {
				hutsik=true;
			}
		}
		return hutsik;
	}
	
	public boolean albokoakKoloreBerdina(int pZutab, int pErrenk) {
		boolean berdina=false;
		char kolorea=Taula.getNireTaula().getGelaxka(pZutab, pErrenk).getKolorea();
		if (pZutab==0) {
			if (this.taula[pZutab+1][pErrenk].getKolorea()==kolorea) {
				berdina=true;
			}
		}
		else if (pZutab==this.taula.length-1) {
			if (this.taula[pZutab-1][pErrenk].getKolorea()==kolorea) {
				berdina=true;
			}
		}
		else {
			if (this.taula[pZutab+1][pErrenk].getKolorea()==kolorea || this.taula[pZutab-1][pErrenk].getKolorea()==kolorea) {
				berdina=true;
			}
		}
		return berdina;
	}
	
	public boolean azkenekoGelaxka(int pErrenk) {
		boolean azkena=false;
		if(pErrenk==this.taula[0].length-1){
			azkena=true;
		}
		return azkena;
	}
	
	public boolean behekoaKoloreBerdina(int pZutab, int pErrenk) {
		boolean berdina=false;
		if (!this.azkenekoGelaxka(pErrenk)) {
			if (Taula.getNireTaula().getGelaxka(pZutab, pErrenk).getKolorea()==Taula.getNireTaula().getGelaxka(pZutab, pErrenk+1).getKolorea()) {
				berdina=true;
			}
		}
		return berdina;
	}
	
	public Gelaxka getGelaxka(int pZutab, int pErrenk) {
		return this.taula[pZutab][pErrenk];
	}
	
	public void inprimatuTaula() {
		System.out.println(" _____________________________");
		for (int i=0;i<this.taula[0].length;i++) {
			for (int j=0;j<this.taula.length;j++) {
				System.out.print(" | "+taula[j][i].getKolorea());
			}
			System.out.println(" |");
			System.out.println(" _____________________________");
		}
	}
}
