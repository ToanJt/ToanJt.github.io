package javaCode;
import java.util.Scanner;
import java.lang.Math;

public class soNguyenToNhoHonN {
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
		for(int i = 0; i < n; i++) {
			if(soNt(i)) {
				System.out.println(i);
			}else continue;
		}
		
	}

}
