package javaWeek2;

public class RecapDemoClasses {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplama = dortIslem.Topla(3, 4);
		int carpma = dortIslem.Carp(3, 4);
		int cikarma = dortIslem.Cikar(4, 3);
		System.out.println(cikarma);
		
	}

}
