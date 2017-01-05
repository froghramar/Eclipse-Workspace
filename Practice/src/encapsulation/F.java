package encapsulation;

import java.math.BigInteger;
import java.util.Scanner;

public class F {
	
	static BigInteger intToBig(int x){
		return new BigInteger(Integer.toString(x));
	}
	
	static BigInteger fact[], pw[], cum[];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int t = in.nextInt();
		fact = new BigInteger[101];
		cum = new BigInteger[101];
		pw = new BigInteger[101];
		fact[0] = BigInteger.ONE;
		pw[0] = BigInteger.ONE;
		cum[0] = BigInteger.ZERO;
		for(int i = 1; i <= 100; i++){
			fact[i] = fact[i - 1].multiply(intToBig(16));
			pw[i] = pw[i - 1].multiply(intToBig(t));
		}
		for(int i = 1; i <= 100; i++){
			cum[i] = cum[i - 1].add(fact[i].divide(pw[i / t]));
		}
		int d = -1;
		for(int i = t; i <= 100; i+=t){
			if(cum[i].compareTo(intToBig(k)) >= 0){
				d = i;
				break;
			}
		}
		k -= cum[d - 1].intValue();
		
	}
}
