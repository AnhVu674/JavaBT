package Baitap1;
import java.util.Scanner;
public class tinhgiaithua {
public static void main(String[] args) {
	int n;
	int giai_thua;
	try (Scanner id = new Scanner(System.in)) {
		System.out.println("Nhap n:");
		n = id.nextInt();
	}
 System.out.println(tinhGiaithuaKo(n));
		
}
public static int tinhGiaithuaKo(int n) {
    int giai_thua = 1;
    if (n == 0 || n == 1) {
        return giai_thua;
    } else {
        for (int i = 2; i <= n; i++) {
            giai_thua *= i;
        }
        return giai_thua;
    }
}
public static int tinhGiaithua(int n) {
    if (n > 0) {
        return n * tinhGiaithua(n - 1);
    } else {
        return 1;
    }
}
}