package problem10;

public class Problem10 {
	
	public int stringToInt(String str){
		int num = 0;
		int i = 0;
		int len = str.length();
		while(i < len){
			int digit = str.charAt(i) - '0';
			num = num * 10 + digit;
			i++;
		}
		return num;
	}

}
