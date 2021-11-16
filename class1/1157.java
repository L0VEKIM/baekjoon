import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toUpperCase().toCharArray();
		Arrays.sort(ch);
		char answer = ch[0], temp = ch[0];
		int count = 1, max = 0;
		
		for(int i = 1; i < ch.length; i++) {
			if(temp != ch[i]) {
				if(max < count) {
					max = count;
					answer = ch[i - 1];
				}
				else if(max == count) {
					answer = '?';
				}
				temp = ch[i];
				count = 1;
			}
			else {
				count++;
			}
		}
		if(max < count) {
			answer = ch[ch.length - 1];
		}
		else if(max == count) {
			answer = '?';
		}
		System.out.println(answer);
	}
}