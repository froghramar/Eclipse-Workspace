package problem5;

public class Problem5 {
	
	int sch[];
	
	public void schroederNumber(int n){
		sch = new int[n + 1];
		sch[0] = sch[1] = 1;
		for(int i = 2; i <= n; i++){
			sch[i] = ((6 * i - 3) * sch[i - 1] - (i - 2) * sch[i - 2]) / (i + 1);
		}
	}
}
