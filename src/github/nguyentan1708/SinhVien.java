package github.nguyentan1708;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien extends People {
	private String maSinhVien;

	public SinhVien() {
		super();
	}

	public SinhVien(String maSinhVien, String hoTen, String gioiTinh, String soDienThoai, String email, String diaChi) {
		super(hoTen, gioiTinh, soDienThoai, email, diaChi);
		this.maSinhVien = maSinhVien;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	@Override
	public void nhapThongTin() {
		System.out.println("---Nhập thông tin sinh viên---");
		while (true) {
			System.out.print("Mã sinh viên: ");
			String maSinhVien = new Scanner(System.in).nextLine();
			if (CheckValid.isValidIDStudent(maSinhVien)) {
				this.maSinhVien = maSinhVien;
				break;
			} else {
				System.out.println("Vui lòng nhập đúng mã số sinh viên có 8 chữ số");
			}
		}
		super.nhapThongTin();
	}

	@Override
	public String toString() {
		return maSinhVien + "-" + super.toString();
	}

}
