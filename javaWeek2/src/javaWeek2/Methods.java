package javaWeek2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	// camel Casing
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;

		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			mesajVer("Sayi mevcuttur: "+aranacak);
		} else {
			mesajVer("Sayi mevcut degildir: "+aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
