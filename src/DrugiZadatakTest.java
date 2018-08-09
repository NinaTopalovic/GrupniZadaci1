import java.util.Scanner;

public class DrugiZadatakTest {

	public static void main(String[] args) {
		
		DrugiZadatak kviz=new DrugiZadatak();
		Scanner unos=new Scanner(System.in);
		
		int pitanje=1+(int)(Math.random()*6);
		
		switch(pitanje) {
		
		case 1: {
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int rezultat=kviz.zbir(a, b);
			
            System.out.print("Izracunaj: " + a + "+" + b + "= ");
            int korisnik=unos.nextInt();
            
            while(korisnik!=rezultat) {
            	System.out.println("Vas odgovor je netacan!");
            	System.out.println("Pokusajte opet..");
            	korisnik=unos.nextInt();
            }
            System.out.println("Vas odgovor je tacan!");
            }
		
		case 2: {
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int rezultat=kviz.razlika(a, b);
			
            System.out.print("Izracunaj: " + a + "-" + b + "=");
            int korisnik=unos.nextInt();
            
            while(korisnik!=rezultat) {
            	System.out.println("Vas odgovor je netacan!");
            	System.out.println("Pokusajte opet..");
            	korisnik=unos.nextInt();
            }
            System.out.println("Vas odgovor je tacan!");
            }
		
		case 3: {
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int rezultat=kviz.proizvod(a, b);
			
            System.out.print("Izracunaj: " + a + "*" + b + "=");
            int korisnik=unos.nextInt();
            
            while(korisnik!=rezultat) {
            	System.out.println("Vas odgovor je netacan!");
            	System.out.println("Pokusajte opet..");
            	korisnik=unos.nextInt();
            }
            System.out.println("Vas odgovor je tacan!");
            }
		
		case 4: {
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int rezultat=kviz.kolicnik(a, b);
			
            System.out.print("Izracunaj: " + a + "/" + b + "=");
            int korisnik=unos.nextInt();
            
            while(korisnik!=rezultat) {
            	System.out.println("Vas odgovor je netacan!");
            	System.out.println("Pokusajte opet..");
            	korisnik=unos.nextInt();
            }
            System.out.println("Vas odgovor je tacan!");
            }
		
		case 5: {
			int a=(int)(Math.random()*100);
			int rezultat=kviz.kvadratniKorijen(a);
			
            System.out.print("Izracunaj kvadratni korijen od: " + a + "=");
            int korisnik=unos.nextInt();
            
            while(korisnik!=rezultat) {
            	System.out.println("Vas odgovor je netacan!");
            	System.out.println("Pokusajte opet..");
            	korisnik=unos.nextInt();
            }
            System.out.println("Vas odgovor je tacan!");
            }
		
		
		case 6: {
			int a=(int)(Math.random()*100);
			int rezultat=kviz.kvadrat(a);
			
            System.out.print("Izracunaj kvadrat od: " + a + "=");
            int korisnik=unos.nextInt();
            
            while(korisnik!=rezultat) {
            	System.out.println("Vas odgovor je netacan!");
            	System.out.println("Pokusajte opet..");
            	korisnik=unos.nextInt();
            }
            System.out.println("Vas odgovor je tacan!");
            }
		
		}

	}

	}


