package javaCode;
import java.util.Scanner;

public class nSoNtDauTien {
	private static Scanner scanner = new Scanner(System.in);
	public static boolean soNt(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int n = scanner.nextInt();
		for(int i = 2; ; i++) {
			if(soNt(i)) {
				System.out.println(i);
				n--;
			}
			if(n == 0) break;
		}
	}

}
