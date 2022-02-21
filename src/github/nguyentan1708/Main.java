package github.nguyentan1708;

import java.util.Scanner;

public class Main {
	public void menu() {
		System.out.println("1. Thêm mới: ");
		System.out.println("2. Xuất toàn bộ danh sách: ");
		System.err.println("2. Tìm kiếm: ");
	}
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
//		while(true) {
//			System.out.println("---Chương trình quản lý sinh viên---");
//			System.out.println("---Code by Võ Tấn Nguyên---");
//			System.out.println("---Vui lòng chọn các chức năng:");
//			System.out.println("1. Quản lý sinh viên");
//			System.out.println("2. Quản lý giáo viên");
//			System.out.println("3. Quản lý lớp học");
//			System.out.println("3. Quản lý môn học");
//			System.out.println("5. Quản lý khoa bộ ");
//			System.out.println("6. Tìm kiếm thông tin: ");
//			System.out.print("Bạn chọn: ");
//			int number=scanner.nextInt();
//			switch(number) {
//			case 1:
//				
//			}
//		}
		SinhVien sv=new SinhVien();
		sv.nhapThongTin();
		System.out.println(sv.toString());
	}
}
