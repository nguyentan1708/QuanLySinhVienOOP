package github.nguyentan1708;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flat1 = true;
		while (flat1) {
			System.out.println("---Chương trình quản lý sinh viên---");
			System.out.println("---Code by Võ Tấn Nguyên---");
			System.out.println("---Vui lòng chọn các chức năng:");
			System.out.println("1. Quản lý sinh viên");
			System.out.println("2. Quản lý giáo viên");
			System.out.println("3. Quản lý lớp học");
			System.out.println("3. Quản lý môn học");
			System.out.println("5. Quản lý khoa bộ ");
			System.out.println("6. Tìm kiếm thông tin: ");
			System.out.println("7. Xuất thông tin ra file");
			System.out.println("8. Thoát chương trình");
			System.out.print("Bạn chọn: ");
			int chooseFirst = scanner.nextInt();
			switch (chooseFirst) {
			case 1:
				boolean flat2 = true;
				while (flat2) {
					System.out.println("1. Thêm sinh viên");
					System.out.println("2. Cập nhật sinh viên");
					System.out.println("3. Xoá sinh viên");
					System.out.println("4. Tìm kiếm sinh viên");
					System.out.println("5. Xuất thông tin sinh viên");
					System.out.println("6. Quay lại");
					System.out.print("Bạn chọn: ");
					int chooseSecond = scanner.nextInt();
					switch (chooseSecond) {
					case 1:
						System.out.print("Nhập số lượng sinh viên cần thêm: ");
						int number = scanner.nextInt();
						SinhVien[] sv = new SinhVien[number];
						for (int i = 0; i < number; i++) {
							sv[i] = new SinhVien();
							sv[i].nhapThongTin();
							String str = new String(
									"insert into sinhvien value(\"" + sv[i].getMaSinhVien() + "\",\"" + sv[i].getHoTen()
											+ "\",\"" + sv[i].getGioiTinh() + "\",\"" + sv[i].getSoDienThoai() + "\",\""
											+ sv[i].getEmail() + "\",\"" + sv[i].getDiaChi() + "\")");
							DatabaseMySQL.insertIntoMySQL(str);
						}
						break;
					case 2:
						boolean flat3 = true;
						while (flat3) {
							System.out.println("---Sửa thông tin sinh viên---");
							System.out.println("Nhập mã số sinh viên và thông tin cần sửa");
							System.out.print("Nhập mã số sinh viên: ");
							String ma = new Scanner(System.in).nextLine();
							System.out.println("1. Sửa họ và tên");
							System.out.println("2. Sửa giới tính");
							System.out.println("3. Sửa số điện thoại");
							System.out.println("4. Sửa email");
							System.out.println("5. Sửa địa chỉ");
							System.out.println("6. Quay lại");
							System.out.print("Bạn chọn:");
							int chooseThird = scanner.nextInt();
							switch (chooseThird) {
							case 1:
								System.out.print("Nhập họ và tên: ");
								String hoten = new Scanner(System.in).nextLine();
								String string1 = new String(
										"update sinhvien set hoten=\"" + hoten + "\" where masinhvien=\"" + ma + "\";");
								DatabaseMySQL.insertIntoMySQL(string1);
								break;
							case 2:
								System.out.print("Nhập giới tính: ");
								String gt = new Scanner(System.in).nextLine();
								String string2 = new String(
										"update sinhvien set gioitinh=\"" + gt + "\" where masinhvien=\"" + ma + "\";");
								DatabaseMySQL.insertIntoMySQL(string2);
								break;
							case 3:
								System.out.print("Nhập số điện thoại: ");
								String sđt = new Scanner(System.in).nextLine();
								String string3 = new String("update sinhvien set sodienthoai=\"" + sđt
										+ "\" where masinhvien=\"" + ma + "\";");
								DatabaseMySQL.insertIntoMySQL(string3);
								break;
							case 4:
								System.out.print("Nhập email: ");
								String email = new Scanner(System.in).nextLine();
								String string4 = new String(
										"update sinhvien set email=\"" + email + "\" where masinhvien=\"" + ma + "\";");
								DatabaseMySQL.insertIntoMySQL(string4);
								break;
							case 5:
								System.out.print("Nhập địa chỉ: ");
								String dc = new Scanner(System.in).nextLine();
								String string5 = new String(
										"update sinhvien set diachi=\"" + dc + "\" where masinhvien=\"" + ma + "\";");
								DatabaseMySQL.insertIntoMySQL(string5);
								break;
							case 6:
								flat3 = false;
								break;
							default:
								System.out.println("Chức năng này không có! Vui lòng chọn lại.");
								break;
							}
						}
						break;
					case 6:
						flat2=false;
						break;
					default:
						System.out.println("Chức năng này không có! Vui lòng chọn lại.");
						break;
					}
				}
			case 2:
			case 6:
				break;
			case 8:
				flat1=false;
				break;
			default:
				System.out.println("Chức năng này không có! Vui lòng nhập lại.");
				break;
			}
		}
	} 
}
