import java.util.*;
import java.util.Random;

public class AdamAsmaca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		 
		System.out.println("============================================================");
		System.out.println("                     ADAM ASMACA OYUNU                      ");	
		System.out.println("============================================================");
		
		System.out.println();
		
		int hak = 5; 
		String[] kelimeler = {"zürafa","yemen","bardak","taþ","kaðýt","kalem","masa","oyun","bilgisayar","tablet","ayna","tablo","derslik","laboratuvar","türkiye","harita","kýta","kulaklýk","sayý","klavye","arkadaþ","sevgi","normal","virüs","bozuk","hastalýk","telefon","panda","istanbul","izmir"};
		
		System.out.println("*Kelimeler Türkçe Alfabeye göredir.(ý,ð,ü,þ,ö,ç içerebilir)");
		
		System.out.println();
		
		System.out.println("Haydi Baþlayalým!");
		
		System.out.println();
		
		int rand = random.nextInt(30);
		char[] kelime = kelimeler[rand].toCharArray();
		
		for(int i = 0; i<kelime.length;i++) {
			System.out.print("_ ");
		}
		System.out.println("\tKelimemiz "+kelime.length+" harfli.");
		System.out.println();
		
		int dongu = 0;
		String[] dizi = new String[kelime.length];
		
		for(int i = 0; i<kelime.length;i++) {
			dizi[i] = "_ ";
		}
		while(hak != 0 && dongu != kelime.length) {
			String istenen = scan.next();
			if(Objects.equals(kelimeler[rand], istenen)) {
				System.out.println("Tebrikler! Kelimeyi Buldunuz. Kelime: "+kelimeler[rand]);
				System.out.println();
			    
				rand = random.nextInt(30);
				kelime = kelimeler[rand].toCharArray();
				
				for(int i = 0; i<kelime.length;i++) {
					System.out.print("_ ");
				}
				System.out.println("\tKelimemiz "+kelime.length+" harfli.");
				System.out.println();
				
				dongu = 0;
				hak = 5;
			}
			else if(kelimeler[rand].contains(istenen)) {
				dongu++;
				for(int i = 0; i<kelime.length;i++) {
					
					if(istenen.charAt(0)==kelime[i]) {
						dizi[i] = istenen;
						
					}	
				}
				for(int i = 0; i<kelime.length;i++) {
					System.out.print(dizi[i]);
				}
			}
			else {
				hak--;
				if(hak!=0) {
					System.out.print("Tekrar harf deneyiniz.  ");
				}
			}
		}
		if(hak == 0) {
			System.out.print("Maalesef bütün haklarýnýzý tükettiniz! Kelime:");
		}
		for(int i=0;i<kelime.length;i++) {
			System.out.print(kelime[i]);
		}
		System.out.println();
		scan.close();
	}
}
