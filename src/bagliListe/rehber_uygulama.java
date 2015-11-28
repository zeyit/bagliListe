package bagliListe;

import java.util.Scanner;

public class rehber_uygulama {

	public static void main(String[] args) {
		int secim=-1;
		Scanner klavye =new Scanner(System.in);
		BagliListe rehber =new BagliListe();
		do {
			System.out.printf("1-Eleman Gir \n2-listele \n0-Çýkýþ\n");
			secim=klavye.nextInt();
		
			
			switch (secim) {
			case 1:
				//eleman ekleme
				System.out.print("Adý girn :");
			    String ad =klavye.next();
			    System.out.print("\nNo girn :");
			    int no =klavye.nextInt();
				rehber.ekle(no, ad);
				System.out.print("Ýþlem tamamlandý\n");
				break;

			case 2:
					//eleman listeleme
				rehber.listele();
					break;
			
			}
		} while (secim!=0);
		
	}
}