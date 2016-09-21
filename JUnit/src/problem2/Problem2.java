package problem2;

public class Problem2 {
	
	public boolean isPrime(int n){
		
		int sq = (int) Math.sqrt(n);
		
		for (int i = 2; i <= sq; i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
}
