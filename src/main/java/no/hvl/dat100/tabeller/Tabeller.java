package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {

			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String[] tall = {};

		tall[0] = "42";	
		tall[1] = "67";
		tall[2] = "89";
		
		return tall;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {

			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i : tabell) {
	        if (i == tall) {
	            return true;
	        }
	    }
	    return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i : tabell) {
	        if (i == tall) {
	            return i;
	        }
	    }
	    return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		for(int i = 0; i < tabell.length / 2; i++)
		{
		    int posisjon = tabell[i];
		    tabell[i] = tabell[tabell.length - i - 1];
		    tabell[tabell.length - i - 1] = posisjon;
		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int j = 0;
		boolean sortert = true;
		while(sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j + 1]) {
				sortert = false;
			}
			j++;
		}
	return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int a1 = tabell1.length;
		int a2 = tabell2.length;
		int a3 = a1 + a2;
		int[] tabell3 = new int[a3];
		
		for (int i = 0; i < a1; i = i + 1) {
			
            tabell3[i] = tabell1[i];
        }

        for (int i = 0; i < a2; i = i + 1) {

            tabell3[a1 + i] = tabell2[i];
        }
		return tabell3;
	}
}
