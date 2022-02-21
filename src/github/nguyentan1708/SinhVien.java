package github.nguyentan1708;

import java.util.Scanner;

public class SinhVien extends People {
	private String maSinhVien;

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public SinhVien() {
		super();
	}

	public SinhVien(String maSinhVien, String hoTen, String gioiTinh, String soDienThoai, String diaChi) {
		super(hoTen, gioiTinh, soDienThoai, diaChi);
		this.maSinhVien = maSinhVien;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		while (true) {
			System.out.print("Mã sinh viên: ");
			String maSinhVien=new Scanner(System.in).nextLine();
			if (CheckValid.isValidIDStudent(maSinhVien)) {
				this.maSinhVien = maSinhVien;
				break;
			} else {
				System.out.println("Vui lòng nhập đúng mã số sinh viên có 8 chữ số");
			}
		}
	}
	@Override
	public String toString() {
		return super.toString()+"-"+maSinhVien;
	}

}
