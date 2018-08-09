import java.util.Scanner;

public class PrviZadatakTest {

	public static void main(String[] args) {
		
			
			Scanner unos=new Scanner(System.in);
			PrviZadatak rezultat=new PrviZadatak();
			
			System.out.println("Koju operaciju zelite da izvrsite: ");
			System.out.println("1. Sabiranje");
			System.out.println("2. Oduzimanje");
			System.out.println("3. Mnozenje");
			System.out.println("4. Dijeljenje");
			System.out.println("5. Kvadratno korjenovanje");
			System.out.println("6. Kvadriranje");
			
			int zeljenaOperacija=unos.nextInt();
			
			switch(zeljenaOperacija){
			
			case 1: {
				System.out.println("Izabrali ste sabiranje.");
				System.out.println("Unesite operande:");
				System.out.print("Prvi sabirak: " );
				double a=unos.nextDouble();
				System.out.print("Drugi sabirak: ");
				double b=unos.nextDouble();
				
				double zbir=rezultat.zbir(a, b);
				System.out.println("Rezultat: " + zbir);
			} break;
			
			case 2: {
				System.out.println("Izabrali ste oduzimanje.");
				System.out.println("Unesite operande:");
				System.out.print("Umanjenik: " );
				double a=unos.nextDouble();
				System.out.print("Umanjilac: ");
				double b=unos.nextDouble();
				
				double razlika=rezultat.razlika(a, b);
				System.out.println("Rezultat: " + razlika);
			} break;
				
			case 3: {
				System.out.println("Izabrali ste mnozenje.");
				System.out.println("Unesite operande:");
				System.out.print("Prvi cinilac: " );
				double a=unos.nextDouble();
				System.out.print("Drugi cinilac: ");
				double b=unos.nextDouble();
				
				double proizvod=rezultat.proizvod(a, b);
				System.out.println("Rezultat: " + proizvod);
			} break;
			
			case 4: {
				System.out.println("Izabrali ste dijeljenje.");
				System.out.println("Unesite operande:");
				System.out.print("Djeljenik: " );
				double a=unos.nextDouble();
				System.out.print("Djelilac: ");
				try {
				double b=unos.nextDouble();
				
				double kolicnik=rezultat.kolicnik(a, b);
				System.out.println("Rezultat: " + kolicnik);
				}
				catch(ArithmeticException ex) {
					System.out.println(ex);
				}
			} break;
			
			case 5: 
				
				System.out.println("Izabrali ste kvadratno korijenovanje.");
				System.out.println("Unesite broj:");
				try {
				double a=unos.nextDouble();
				
				double kvadratniKorijen=rezultat.kvadratniKorijen(a);
				System.out.println("Rezultat: " + kvadratniKorijen);
			}
			catch(IllegalArgumentException ex) {
				System.out.println(ex);
			}
				
			 break;
			
			case 6: {
				System.out.println("Izabrali ste kvadriranje.");
				System.out.println("Unesite broj:");
				double a=unos.nextDouble();
				
				double kvadrat=rezultat.kvadrat(a);
				System.out.println("Rezultat: " + kvadrat);
			} break;
			
			default: System.out.println("Izabrali ste nepostojecu operaciju!!");
			
			}
		
		}

	


	}

