package javaCode;
import java.util.Scanner;

public class fibona {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		System.out.println(fibo(n));
	}
	public static int fibo(int n) {
		if(n == 1 || n == 2) return 1;
		return fibo(n-1) + fibo(n-2);
	}
}
