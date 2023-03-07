package Baitap2;

public class Client {
	public static void main(String[] args) {
		Giohang gh = new Giohang();
		SanPham s1 = new SanPham(1, "tulanh", 100);
		SanPham s2 = new SanPham(2, "may giat", 200);
		gh.mua(s2, 30);
		gh.mua(s1, 50);
		gh.hienThi();
//		gh.xoa(s1.getMa());
//		gh.xoa();
		System.out.println("Tong tien:" + gh.tien());

	}
}
