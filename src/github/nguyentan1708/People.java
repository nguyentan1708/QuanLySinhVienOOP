package github.nguyentan1708;

import java.util.ArrayList;
import java.util.Scanner;
import github.nguyentan1708.CheckValid;

public class People {
	private String hoTen;
	private String gioiTinh;
	private String soDienThoai;
	private String email;
	private String diaChi;

	public People() {
		super();
	}

	public People(String hoTen, String gioiTinh, String soDienThoai, String email, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		this.hoTen = scanner.nextLine();
		while (true) {
			System.out.print("Giới tính: ");
			String gioiTinh = scanner.nextLine();
			if (gioiTinh.equalsIgnoreCase("nam") || gioiTinh.equalsIgnoreCase("nữ")) {
				this.gioiTinh = gioiTinh;
				break;
			} else {
				System.out.println("Vui lòng nhập đúng giới tính");
			}
		}
		while (true) {
			System.out.print("Số điện thoại: ");
			String soDienThoai = scanner.nextLine();
			if (CheckValid.isValidNumberPhone(soDienThoai)) {
				this.soDienThoai = soDienThoai;
				break;
			} else {
				System.out.println("Vui lòng nhập đúng số điện thoại");
			}
		}
		System.out.print("Email: ");
		this.email = scanner.nextLine();
		System.out.print("Địa chỉ: ");
		this.diaChi = scanner.nextLine();
	}

	@Override
	public String toString() {
		return hoTen + "-" + gioiTinh + "-" + soDienThoai + "-" + diaChi;
	}

}
