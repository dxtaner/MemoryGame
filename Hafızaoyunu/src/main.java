import java.util.Scanner;

public class main {
	private static Kart[][] kartlar = new Kart[6][6];

	public static void main(String[] args) {

		kartlar[0][0] = new Kart('E');
		kartlar[0][1] = new Kart('E');
		kartlar[0][2] = new Kart('A');
		kartlar[0][3] = new Kart('G');
		kartlar[0][4] = new Kart('T');
		kartlar[0][5] = new Kart('U');
		kartlar[1][0] = new Kart('F');
		kartlar[1][1] = new Kart('B');
		kartlar[1][2] = new Kart('D');
		kartlar[1][3] = new Kart('H');
		kartlar[1][4] = new Kart('T');
		kartlar[1][5] = new Kart('U');
		kartlar[2][0] = new Kart('F');
		kartlar[2][1] = new Kart('C');
		kartlar[2][2] = new Kart('D');
		kartlar[2][3] = new Kart('H');
		kartlar[2][4] = new Kart('Z');
		kartlar[2][5] = new Kart('P');
		kartlar[3][0] = new Kart('A');
		kartlar[3][1] = new Kart('B');
		kartlar[3][2] = new Kart('G');
		kartlar[3][3] = new Kart('C');
		kartlar[3][4] = new Kart('Z');
		kartlar[3][5] = new Kart('R');
		kartlar[4][0] = new Kart('Y');
		kartlar[4][1] = new Kart('X');
		kartlar[4][2] = new Kart('Y');
		kartlar[4][3] = new Kart('P');
		kartlar[4][4] = new Kart('X');
		kartlar[4][5] = new Kart('K');
		kartlar[5][0] = new Kart('R');
		kartlar[5][1] = new Kart('W');
		kartlar[5][2] = new Kart('W');
		kartlar[5][3] = new Kart('K');
		kartlar[5][4] = new Kart('L');
		kartlar[5][5] = new Kart('L');
		// oyunTahtasi();

		while (oyunBittimi() == false) {
			oyunTahtasi();
			tahminET();
		}
		if (oyunBittimi() == true) {
			System.out.println("Oyun Bitti.. ");
		}
	}

	public static void tahminET() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tahmin 1 :");
		System.out.println("1. index (0 ile 5 arasında sayı girin):");
		int i1 = sc.nextInt();
		System.out.println("2. index (0 ile 5 arasında sayı girin):");
		int j1 = sc.nextInt();
		kartlar[i1][j1].setTahmin(true);
		oyunTahtasi();
		System.out.println("Tahmin 2 :");
		System.out.println("1. index (0 ile 5 arasında sayı girin):");
		int i2 = sc.nextInt();
		System.out.println("2. index (0 ile 5 arasında sayı girin):");
		int j2 = sc.nextInt();

		if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
			System.out.println("Doğru Tahmin");
			kartlar[i2][j2].setTahmin(true);
		} else {
			System.out.println("Yanlış Tahmin");
			kartlar[i1][j1].setTahmin(false);
		}
	}

	public static boolean oyunBittimi() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {

				if (kartlar[i][j].isTahmin() == false) {
					return false;
				}
			}
		}
		return true;
	}

	public static void oyunTahtasi() {
		for (int i = 0; i < 6; i++) {
			System.out.println("______________________________");
			for (int j = 0; j < 6; j++) {
				if (kartlar[i][j].isTahmin()) {
					System.out.print(" |" + kartlar[i][j].getDeger() + "| ");

				} else {
					System.out.print(" | | ");
				}
			}
			System.out.println("");
		}
		System.out.println("________________________________");

	}
}
