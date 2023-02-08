package javaCode;
import java.util.Scanner;

public class giaithua {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		System.out.println(giaiThua(n));
	}
	public static int giaiThua(int n) {
		if(n == 1) return 1;
		return n * giaiThua(n-1);
	}
}
