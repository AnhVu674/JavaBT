package Baitap2;

public class SanPham {

	private int ma;
	private String ten;
	private double gia;
	private int soLuongMua;

	public SanPham(int ma, String ten, double gia) {
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.soLuongMua = 0;
	}

	@Override
	public String toString() {
		return this.ma + "," + this.ten + "," + this.gia + "," + this.soLuongMua;
	}

	public int  getMa() {
		return ma;
	}
public void setSoLuongMua(int soLuongMua) {
	this.soLuongMua=soLuongMua;
}
	public int getSoLuongMua() {
		return this.soLuongMua;
	}
public double getGia() {
	return this.gia;
}
}
