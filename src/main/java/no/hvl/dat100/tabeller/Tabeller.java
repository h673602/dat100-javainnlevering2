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

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
