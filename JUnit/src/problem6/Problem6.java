package problem6;

public class Problem6 {
	
	int n;
	int a[];
	int cnt, res;
	
	public void init(){
		cnt = res = 1;
		for(int i = 1; i < n; i++){
			if(a[i] > a[i - 1]) cnt++;
			else cnt = 1;
			res = Math.max(res, cnt);
		}
	}
}
