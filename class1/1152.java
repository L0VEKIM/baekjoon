import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.charAt(0) == ' ' && s.length() > 1) {
			System.out.println(s.split(" ").length - 1);
		}
		else
			System.out.println(s.split(" ").length);
	}
}