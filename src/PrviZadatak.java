
public class PrviZadatak {
	
	private double kvadrat;
	

	
		public double zbir(double a, double b) {
			double zbir=a+b;
			return zbir;
			
		}
		
		public double razlika(double a, double b) {
			double razlika=a-b;
			return razlika;
		}
		
		public double proizvod(double a, double b) {
			double proizvod=a*b;
			return proizvod;
		}
		
		public double kolicnik(double a, double b) 
		throws ArithmeticException{
			if(b!=0) {
				double kolicnik=a/b;
				return kolicnik;
				
			}
		else {
			throw new ArithmeticException("Djelilac ne moze biti 0!");
		}
		}
		public double kvadrat(double a) {
			double kvadrat=a*a;
			return kvadrat;
		}
		public double kvadratniKorijen(double a) 
			throws IllegalArgumentException{
				if(a>=0) {
			double kvadratniKorijen=Math.sqrt(a);
			return kvadratniKorijen;
			
				}
				else {
					throw new IllegalArgumentException("Korijen negativnog broja nije realan broj!");
				}
				
			}
		
		
		

	}


