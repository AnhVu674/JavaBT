package Baitap1;

public class tinhTongnsole {
	public static void main(String[] args) {
		tinhTong(2);
	}

	public static void tinhTong(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				s = s + i;
			}
		}
		System.out.println("Tong n so le dau tien la:" + s);
	}
}
