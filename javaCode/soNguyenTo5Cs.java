package javaCode;

public class soNguyenTo5Cs {
	public static boolean soNt(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i = 10000;i <= 99999; i++) {
			if(soNt(i)) {
				System.out.println(i);
			}
		}
	}

}
