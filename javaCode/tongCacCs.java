package javaCode;
import java.util.Scanner;

public class tongCacCs {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		int cnt = 0;
		while(n > 0) {
			cnt++;
			n/=10;
		}
		System.out.println(cnt);
	}

}
