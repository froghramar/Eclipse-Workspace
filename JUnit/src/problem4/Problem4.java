package problem4;

public class Problem4 {
	
	int mu[];
	
	public void mobius(int n){
		mu = new int[n + 1];
		mu[1] = 1;
		for(int i = 1; i <= n; i++){
			if(mu[i] != 0)
				for(int j = i + 1; j <= n; j++)
					mu[j] -= mu[i];
		}
	}
}
