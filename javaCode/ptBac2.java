package javaCode;
import java.lang.Math;
import java.util.Scanner;

public class test {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
		double a, b, c;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		giaiPtBac2(a, b, c);
	}
	public static void giaiPtBac2(double a, double b, double c) {
		double x1, x2;
		double delta = b*b - 4*a*c;
		if(delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
			System.out.println("Phuong trinh co 2 nghiem: " + x1 +" va " + x2);
		}else if (delta == 0) {
	        x1 = (-b / (2 * a));
	        System.out.println("Phuong trinh co nghiem kep: " + x1);
	    }else {
	        System.out.println("Phuong trinh vo nghiem!");
	    }
	}
}	
