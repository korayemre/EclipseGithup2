package methods2;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bu g�n hava �ok g�zel.";
		String yeniMesaj = mesaj.substring(0, 4);
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 10);
		System.out.println("Toplam : " + toplam);
	}

	public static void ekle() {

		System.out.println("Eklendi");
	}

	public static void sil() {

		System.out.println("Silindi");
	}

	public static void g�ncelle() {

		System.out.println("g�ncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {

		return "Ankara";
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
