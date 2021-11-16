import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] score = new double[n];
		double m = 0.0;
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextDouble();
			if(score[i] > m) {
				m = score[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			score[i] = score[i] / m * 100.0;
			sum += score[i];
		}
		System.out.println(sum / n);
	}
}