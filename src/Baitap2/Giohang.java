package Baitap2;

import java.util.*;

public class Giohang {
	private List<SanPham> ds = null;

public Giohang() {
	this.ds = new ArrayList<SanPham>();
}
	public void mua(SanPham s1, int soLuongMua) {
		var kq = this.tim(s1.getMa());
		if (kq == null) {
			s1.setSoLuongMua(soLuongMua);
			this.ds.add(s1);
		}else{
			kq.setSoLuongMua(kq.getSoLuongMua() + soLuongMua);
		}
		}


	public void hienThi() {
		for (var s : this.ds)
			System.out.println(s.toString());
	}

	public void xoa(int ma) {
		this.ds.remove(this.tim(ma));
	}

	public double tien() {
		var t = 0.0;
		for (var s : this.ds)
			t += s.getGia() * s.getSoLuongMua();
		return t;
	}

	public void xoa() {
		this.ds.clear();
	}

	private SanPham tim(int ma) {
		for (var s : this.ds) {
			if (ma == s.getMa());
			return s;
		}	
		return null;
	}
}


