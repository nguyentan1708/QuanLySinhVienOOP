package github.nguyentan1708;

public class MonHoc {
	private String maMonHoc;
	private String tenMonHoc;

	public MonHoc() {
		super();
	}

	public MonHoc(String maMonHoc, String tenMonHoc) {
		super();
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
	}

	public String getMaMonHoc() {
		return maMonHoc;
	}

	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

}
