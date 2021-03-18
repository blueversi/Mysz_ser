
public class S18311_p01 {

	final static int wymiar1 = 23;
	final static int wymiar2 = 23;
	
	public static void main(String[] args) {
		
		{
			
		//			STRATEGIA 1
			
		int wszystkiePola = wymiar1 * wymiar2;
		double arytmetyka = wszystkiePola * 0.1;
		int iloscSerow = (int) arytmetyka;
		System.out.println();
		int pokoj[][] = new int[wymiar1][wymiar2];
		int sery[][] = new int[iloscSerow][2];

		// zapisanie serow
		for (int x = 0; x < iloscSerow; x++) {
			for (int y = 0; y < 2; y++) {
				sery[x][y] = (int) (Math.random() * 22);
			}
		}

		// dodanie seru do tablicy
		for (int x = 0; x < iloscSerow; x++) {
			pokoj[sery[x][0]][sery[x][1]] = 1;
		}

		// dodanie myszy do tablicy
		int mysz[] =  new int[]{((int) (Math.random() * 22)), ((int) (Math.random() * 22))};
		pokoj[mysz[0]][ mysz[1]] = 2;
		
		
		
		wyswietlTablice2D(pokoj, wymiar1, wymiar2);
		
		
		//					STRATEGIA 1 - URUCHOMIENIE
			uruchomStrategiePierwsza(pokoj, sery, mysz, iloscSerow);
		
		}
		
		{
			
		//					STRATEGIA 2 
			
		int wszystkiePola = wymiar1 * wymiar2;
		double arytmetyka = wszystkiePola * 0.1;
		int iloscSerow = (int) arytmetyka;
		System.out.println();
		int pokoj[][] = new int[wymiar1][wymiar2];
		int sery[][] = new int[iloscSerow][2];

		// zapisanie serow
		for (int x = 0; x < iloscSerow; x++) {
			for (int y = 0; y < 2; y++) {
				sery[x][y] = (int) (Math.random() * 22);
			}
		}

		// dodanie seru do tablicy
		for (int x = 0; x < iloscSerow; x++) {
			pokoj[sery[x][0]][sery[x][1]] = 1;
		}

		// dodanie myszy do tablicy
		int mysz[] =  new int[]{((int) (Math.random() * 22)), ((int) (Math.random() * 22))};
		pokoj[mysz[0]][ mysz[1]] = 2;
		
		
		
		
		//					STRATEGIA 2 - URUCHOMIENIE	 		
			uruchomStrategieDruga(pokoj, sery, mysz, iloscSerow);
		
		}
		
		{
			
		//					STRATEGIA  3 - URUCHOMIENIE	
			
		int wszystkiePola = wymiar1 * wymiar2;
		double arytmetyka = wszystkiePola * 0.1;
		int iloscSerow = (int) arytmetyka;
		System.out.println();
		int pokoj[][] = new int[wymiar1][wymiar2];
		int sery[][] = new int[iloscSerow][2];

		// zapisanie serow
		for (int x = 0; x < iloscSerow; x++) {
			for (int y = 0; y < 2; y++) {
				sery[x][y] = (int) (Math.random() * 22);
			}
		}

		// dodanie seru do tablicy
		for (int x = 0; x < iloscSerow; x++) {
			pokoj[sery[x][0]][sery[x][1]] = 1;
		}

		// dodanie myszy do tablicy
		int mysz[] =  new int[]{((int) (Math.random() * 22)), ((int) (Math.random() * 22))};
		pokoj[mysz[0]][ mysz[1]] = 2;
		
		
		
		wyswietlTablice2D(pokoj, wymiar1, wymiar2);
		
		
		
		//					STRATEGIA  3 - URUCHOMIENIE
			uruchomStrategieTrzecia(pokoj, sery, mysz, iloscSerow);
		
		}

	}

	/* 
	 * METODY
	 * 1. Wyswietlanie tablicy
	 * 2. Ruchy
	 * 3. Strategie
	 * 4. Metody pomocnicze
	 */

	
	// 1. Wyswietlanie tablicy
	public static void wyswietlTablice2D(int tab[][], int wymiar1, int wymiar2) {
		for (int x = 0; x < wymiar1; x++) {
			for (int y = 0; y < wymiar2; y++) {
				System.out.print(tab[x][y] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println(" ");
	}
	
	
	// 2. Ruchy
	
	public static void wGore(int tab[][], int mysz[]) {
		if(mysz[0]-1 != -1 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]-1][mysz[1]] = 2;
			mysz[0] = mysz[0]-1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}		
	}

	public static void wDol(int tab[][], int mysz[]) {
		if(mysz[0]+1 != 23 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]+1][mysz[1]] = 2;
			mysz[0] = mysz[0]+1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}

	public static void wPrawo(int tab[][], int mysz[]) {
		if(mysz[1]+1 != 23 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]][mysz[1]+1] = 2;
			mysz[1] = mysz[1]+1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}

	public static void wLewo(int tab[][], int mysz[]) {
		if(mysz[1]-1 != -1 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]][mysz[1]-1] = 2;
			mysz[1] = mysz[1]-1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}

	public static void naSkosLG(int tab[][], int mysz[]) {
		if(mysz[0]-1 != -1 && mysz[1]-1 != -1 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]-1][mysz[1]-1] = 2;
			mysz[0] = mysz[0]-1;
			mysz[1] = mysz[1]-1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}
	
	public static void naSkosPG(int tab[][], int mysz[]) {
		if(mysz[0]-1 != -1 && mysz[1]+1 != 23 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]-1][mysz[1]+1] = 2;			
			mysz[0] = mysz[0]-1;
			mysz[1] = mysz[1]+1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}
	
	public static void naSkosLD(int tab[][], int mysz[]) {
		if(mysz[0]+1 != 23 && mysz[1]-1 != -1 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]+1][mysz[1]-1] = 2;
			mysz[0] = mysz[0]+1;
			mysz[1] = mysz[1]-1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}	
	
	public static void naSkosPD(int tab[][], int mysz[]) {
		if(mysz[0]+1 != 23 && mysz[1]+1 != 23 ) {
			tab[mysz[0]][mysz[1]] = 3;
			tab[mysz[0]+1][mysz[1]+1] = 2;
			mysz[0] = mysz[0]+1;
			mysz[1] = mysz[1]+1;
			wyswietlTablice2D(tab, wymiar1, wymiar2);
		}
	}
	
	
	// 3. Strategie
	
	public static void uruchomStrategiePierwsza(int tab[][], int sery[][], int mysz[], int iloscSeru) {
		
		boolean czySa = true;
		int liczba;
		
		while(czySa) {
			liczba = ((int)(Math.random()*8));
			if(liczba == 0) {
				wGore(tab, mysz);
			} else if(liczba == 1) {
				wDol(tab, mysz);
			} else if(liczba == 2) {
				wPrawo(tab, mysz);		
			} else if(liczba == 3) {
				wLewo(tab, mysz);
			} else if(liczba == 4) {
				naSkosLG(tab, mysz);
			} else if(liczba == 5) {
				naSkosPG(tab, mysz);
			} else if(liczba == 6) {
				naSkosLD(tab, mysz);
			} else {
				naSkosPD(tab, mysz);
			}
			
			System.out.println(" ");
			for (int x = 0; x < iloscSeru; x++) {
				if(tab[sery[x][0]][sery[x][1]] == 1){
					czySa = true;
					break;
				} else if(tab[sery[x][0]][sery[x][1]] == 3) { 
					czySa = false;
				} 
			
			}
		}
	}
	
	public static void uruchomStrategieDruga(int tab[][], int sery[][], int mysz[], int iloscSeru) {
		
		boolean czySa = true;
		int kordynatySera[];
		
		while(czySa) {
			
			kordynatySera = najblizszySer(tab, mysz);		
			
			if(mysz[0] == kordynatySera[0] && mysz[1] < kordynatySera[1]) { 			// w prawo
				for(int i = mysz[1]; i < kordynatySera[1]; i++) {
					wPrawo(tab, mysz);
				}
			} else if(mysz[0] == kordynatySera[0] && mysz[1] > kordynatySera[1]) {		// w lewo
				for(int i = mysz[1]; i > kordynatySera[1]; i--) {
					wLewo(tab, mysz);
				}
			} else if(mysz[0] > kordynatySera[0] && mysz[1] == kordynatySera[1]) {		// w gore
				for(int i = mysz[0]; i > kordynatySera[0]; i--) {
					wGore(tab, mysz);
				}
			} else if(mysz[0] < kordynatySera[0] && mysz[1] == kordynatySera[1]) {		// w dol
				for(int i = mysz[0]; i < kordynatySera[0]; i++) {
					wDol(tab, mysz);
				}
			} else if(mysz[0] > kordynatySera[0] && mysz[1] > kordynatySera[1]) {		// skos lewy gorny
				boolean czyJest = false;
				
				for(int i = 1; i <= kordynatySera[2]; i++) {
					if(mysz[0]-i > -1 && mysz[1]-i > -1 ) {	
						if(tab[mysz[0]-i][mysz[1]-i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < kordynatySera[2]; i++) {
						naSkosLG(tab, mysz);
					}
					
				} else {
				
					for(int i = mysz[0]; i > kordynatySera[0]; i--) {
						wGore(tab, mysz);
					}
					for(int i = mysz[1]; i > kordynatySera[1]; i--) {
						wLewo(tab, mysz);
					}
				}
			} else if(mysz[0] > kordynatySera[0] && mysz[1] < kordynatySera[1]) {		// skos prawy gorny
							
				boolean czyJest = false;
				
				for(int i = 1; i <= kordynatySera[2]; i++) {
					if(mysz[0]-i > -1 && mysz[1]+i < 23 ) {	
						if(tab[mysz[0]-i][mysz[1]+i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < kordynatySera[2]; i++) {
						naSkosPG(tab, mysz);
					}
					
				} else {
					for(int i = mysz[0]; i > kordynatySera[0]; i--) {
						wGore(tab, mysz);
					}
					for(int i = mysz[1]; i < kordynatySera[1]; i++) {
						wPrawo(tab, mysz);
					}
				}
			} else if(mysz[0] < kordynatySera[0] && mysz[1] > kordynatySera[1]) {		// skos lewy dolny
				
				boolean czyJest = false;
				
				for(int i = 1; i <= kordynatySera[2]; i++) {
					if(mysz[0]+i < 23 && mysz[1]-i > -1 ) {	
						if(tab[mysz[0]+i][mysz[1]-i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < kordynatySera[2]; i++) {
						naSkosLD(tab, mysz);
					}
					
				} else {
					for(int i = mysz[1]; i > kordynatySera[1]; i--) {
						wLewo(tab, mysz);
					}
					for(int i = mysz[0]; i < kordynatySera[0]; i++) {
						wDol(tab, mysz);
					}
				}
			} else if(mysz[0] < kordynatySera[0] && mysz[1] < kordynatySera[1]) {		// skos prawy dolny
				
				boolean czyJest = false;
				
				for(int i = 1; i <= kordynatySera[2]; i++) {
					if(mysz[0]+i < 23 && mysz[1]+i < 23 ) {	
						if(tab[mysz[0]+i][mysz[1]+i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < kordynatySera[2]; i++) {
						naSkosPD(tab, mysz);
					}
					
				} else {
					for(int i = mysz[1]; i < kordynatySera[1]; i++) {
						wPrawo(tab, mysz);
					}
					for(int i = mysz[0]; i < kordynatySera[0]; i++) {
						wDol(tab, mysz);
					}
				}
				
			} else {																	
				
			}
			
			System.out.println(" ");
			for (int x = 0; x < iloscSeru; x++) {
				if(tab[sery[x][0]][sery[x][1]] == 1){
					czySa = true;
					break;
				} else if(tab[sery[x][0]][sery[x][1]] == 3) { 
					czySa = false;
				} 
			}
			
		}
	}
	
public static void uruchomStrategieTrzecia(int tab[][], int sery[][], int mysz[], int iloscSeru) {
		
		
		int kordynatySera[] = new int[2];
		int seryX = 0;
		while(seryX<52) {
			
			kordynatySera[0] = 	sery[seryX][0];
			kordynatySera[1] = 	sery[seryX][1];
			seryX++;
			
			
			if(mysz[0] == kordynatySera[0] && mysz[1] < kordynatySera[1]) { 			// w prawo
				for(int i = mysz[1]; i < kordynatySera[1]; i++) {
					wPrawo(tab, mysz);
				}
			} else if(mysz[0] == kordynatySera[0] && mysz[1] > kordynatySera[1]) {		// w lewo
				for(int i = mysz[1]; i > kordynatySera[1]; i--) {
					wLewo(tab, mysz);
				}
			} else if(mysz[0] > kordynatySera[0] && mysz[1] == kordynatySera[1]) {		// w gore
				for(int i = mysz[0]; i > kordynatySera[0]; i--) {
					wGore(tab, mysz);
				}
			} else if(mysz[0] < kordynatySera[0] && mysz[1] == kordynatySera[1]) {		// w dol
				for(int i = mysz[0]; i < kordynatySera[0]; i++) {
					wDol(tab, mysz);
				}
			} else if(mysz[0] > kordynatySera[0] && mysz[1] > kordynatySera[1]) {		// skos lewy gorny
				boolean czyJest = false;
				
				for(int i = 1; i <= (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
					if(mysz[0]-i > -1 && mysz[1]-i > -1 ) {	
						if(tab[mysz[0]-i][mysz[1]-i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
						naSkosLG(tab, mysz);
					}
					
				} else {
				
					for(int i = mysz[0]; i > kordynatySera[0]; i--) {
						wGore(tab, mysz);
					}
					for(int i = mysz[1]; i > kordynatySera[1]; i--) {
						wLewo(tab, mysz);
					}
				}
			} else if(mysz[0] > kordynatySera[0] && mysz[1] < kordynatySera[1]) {		// skos prawy gorny
							
				boolean czyJest = false;
				
				for(int i = 1; i <= (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
					if(mysz[0]-i > -1 && mysz[1]+i < 23 ) {	
						if(tab[mysz[0]-i][mysz[1]+i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
						naSkosPG(tab, mysz);
					}
					
				} else {
					for(int i = mysz[0]; i > kordynatySera[0]; i--) {
						wGore(tab, mysz);
					}
					for(int i = mysz[1]; i < kordynatySera[1]; i++) {
						wPrawo(tab, mysz);
					}
				}
			} else if(mysz[0] < kordynatySera[0] && mysz[1] > kordynatySera[1]) {		// skos lewy dolny
				
				boolean czyJest = false;
				
				for(int i = 1; i <= (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
					if(mysz[0]+i < 23 && mysz[1]-i > -1 ) {	
						if(tab[mysz[0]+i][mysz[1]-i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
						naSkosLD(tab, mysz);
					}
					
				} else {
					for(int i = mysz[1]; i > kordynatySera[1]; i--) {
						wLewo(tab, mysz);
					}
					for(int i = mysz[0]; i < kordynatySera[0]; i++) {
						wDol(tab, mysz);
					}
				}
			} else if(mysz[0] < kordynatySera[0] && mysz[1] < kordynatySera[1]) {		// skos prawy dolny
				
				boolean czyJest = false;
				
				for(int i = 1; i <= (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
					if(mysz[0]+i < 23 && mysz[1]+i < 23 ) {	
						if(tab[mysz[0]+i][mysz[1]+i] == 1) {
							czyJest = true;
						}
					}
				}
				
				if(czyJest)  {
					
					for(int i = 0; i < (Math.abs(kordynatySera[0]-mysz[0]) + Math.abs(kordynatySera[1] - mysz[1])); i++) {
						naSkosPD(tab, mysz);
					}
					
				} else {
					for(int i = mysz[1]; i < kordynatySera[1]; i++) {
						wPrawo(tab, mysz);
					}
					for(int i = mysz[0]; i < kordynatySera[0]; i++) {
						wDol(tab, mysz);
					}
				}
				
			} else {																	
				
			}
			
			if(tab[kordynatySera[0]][kordynatySera[1]] != 2) {
				seryX--;
			}
			
			System.out.println(" ");

		}
	}
	
	// 4. Metody pomocnicze
	
	public static int[] najblizszySer(int tab[][], int mysz[]) {
		int kordynaty[] = new int[3];
		kordynaty[0] = 0;
		kordynaty[1] = 0;
		kordynaty[2] = -1;
		int minDystans;
		for(int i = 0; i<tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				minDystans = Math.abs(mysz[0]-i) + Math.abs(mysz[1]-j);
				if(tab[i][j] == 1 && (kordynaty[2] == -1 || kordynaty[2] > minDystans)) {
					kordynaty[2] = minDystans;
					kordynaty[0] = i;
					kordynaty[1] = j; 
				}
			}
		}
			
		return kordynaty;
	}
	
	
}
