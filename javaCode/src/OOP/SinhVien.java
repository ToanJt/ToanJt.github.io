package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
	private String masv, ho, ten, ns, thanhpho, gioitinh;

	public SinhVien(String masv, String ho, String ten, String ns, String thanhpho, String gioitinh) {
		super();
		this.masv = masv;
		this.ho = ho;
		this.ten = ten;
		this.ns = ns;
		this.thanhpho = thanhpho;
		this.gioitinh = gioitinh;
	}
	public static SinhVien parse(String str) {
		String res[] = str.split("\\@");
		SinhVien p = new SinhVien(res[0], res[1], res[2], res[3], res[4], res[5]);
		return p;
	}
	public static List<SinhVien> parseFromFile(String filePath) throws FileNotFoundException{
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		List<SinhVien> ls = new ArrayList<>();
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			SinhVien p = SinhVien.parse(line);
			ls.add(p);
		}
		scanner.close();
		return ls;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	public String getThanhpho() {
		return thanhpho;
	}
	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String toString() {
		return String.format("Person[masv=%s, ho=%s, ten=%s, ns=%s, thanhpho=%s, gioitinh=%s", masv, ho, ten, ns, thanhpho, gioitinh);
	}
}
