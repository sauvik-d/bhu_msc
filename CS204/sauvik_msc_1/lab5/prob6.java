import java.util.*;
class Polynomial{
	
	int[] coeff;
	
	public Polynomial(int...coef) {
		
		int size = coef.length;
		coeff = new int[size];
		
		for(int i=0;i<coef.length;i++) {
			
			coeff[i] = coef[i];
			
		}
	}
	
	public void display(Polynomial P) {
		for(int i=0;i<P.coeff.length-1;i++) {
			System.out.print(P.coeff[i]+"x^"+(P.coeff.length-i-1)+" + ");
		}
		System.out.println(P.coeff[P.coeff.length-1]);
	}
}

public class prob6{
	public static void main(String[] args){
		Polynomial p = new Polynomial(2, 4, 7, 1);
		p.display(p);
	}
}