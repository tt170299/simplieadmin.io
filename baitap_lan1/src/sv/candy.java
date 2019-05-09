package sv;

public class candy {

	private String ma;
	private String ten;
	private String date;
	private float diemtoan;
	private float diemvan;
	private float diemanh;
	public candy(String ma, String ten, String date, float diemtoan, float diemvan, float diemanh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.date = date;
		this.diemtoan = diemtoan;
		this.diemvan = diemvan;
		this.diemanh = diemanh;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getDiemtoan() {
		return diemtoan;
	}
	public void setDiemtoan(float diemtoan) {
		this.diemtoan = diemtoan;
	}
	public float getDiemvan() {
		return diemvan;
	}
	public void setDiemvan(float diemvan) {
		this.diemvan = diemvan;
	}
	public float getDiemanh() {
		return diemanh;
	}
	public void setDiemanh(float diemanh) {
		this.diemanh = diemanh;
	}
	
	

}
