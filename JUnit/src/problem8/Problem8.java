package problem8;

public class Problem8 {
	
	int b[] = new int[100], n[];
	
	public int nextIndex(int p){
		b[p] = 1;
		int v = 1;
		while(n[v] != -1){
			v++;
			b[p] = 0;
		}
		return v;
	}
}
