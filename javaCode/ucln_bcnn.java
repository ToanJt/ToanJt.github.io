package javaCode;
import java.util.Scanner;

public class ucln_bcnn {
	private static Scanner scanner = new Scanner(System.in);
	public static int ucln(int a, int b) {
		if(b == 0) return a;
		return ucln(b, a%b);
	}
	public static int bcnn(int a, int b) {
		return (a*b)/bcnn(a, b);
	}
	public static void main(String[] args) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(ucln(a, b));
	}

}
