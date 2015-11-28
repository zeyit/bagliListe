package bagliListe;

public class BagliListe {

	rehber ilk =null,son = null;
 	 void ekle(int no,String ad) {
 	   rehber kayýt =new rehber(no, ad);
 		 if (ilk==null) {
			ilk=kayýt;
			son=kayýt;//null
			return;
		   }
 		rehber islem =new rehber(no, ad);
 		son.sonraki=kayýt;
 		son=kayýt;
 				
 		//ilk.sonraki=islem;
 	//	ilk.sonraki=null;
	}
     void listele() {
	  rehber islem=ilk;

		while (islem!=null) {
			
			System.out.printf(islem.ad + "  "  + islem.no + "\n");
		islem=islem.sonraki;
		}
		
}
 }
 class rehber{
 	String ad;
 	int no ;
 	rehber sonraki;
 	rehber(int no,String ad){
 		this.ad=ad;
 		this.no=no;
 		//this.sonraki =null;
 	}
 }




