package problem3;

public class Problem3 {
	
	int cat[];
	
	public void catalanNumber(int n){
		cat = new int[n + 1];
		cat[0] = 1;
		for(int i = 1; i <= n; i++){
			cat[i] = 0;
			for(int j = 0; j < i; j++)
				cat[i] += cat[j] * cat[i - j - 1];
		}
	}
}
