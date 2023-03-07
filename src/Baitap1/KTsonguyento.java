package Baitap1;

public class KTsonguyento {
	public static void main(String[] args) {
		if(!kiemTraNguyenTo(4)) {
			System.out.println("Khong la SNT");
		}else {
			System.out.println("La SNT");
		}

	private static boolean kiemTraNguyenTo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
