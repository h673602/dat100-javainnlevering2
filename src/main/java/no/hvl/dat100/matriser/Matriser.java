package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise.length; j++) {
				System.out.print(j);
			}
		}
		System.out.println("");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int gange = 0;
		int [][] produkt = new int [matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				gange = matrise[i][j] * tall;
				produkt[i][j] = gange;
			}
		}
		return produkt;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		

	}

}
