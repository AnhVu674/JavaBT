package Baitap1;
import java.util.Scanner;
public class tinhTong {
public static void main(String[] args) {
	int n;
	int s = 0;
	Scanner ma = new Scanner(System.in);
	System.out.println("Nhap n:");
	n = ma.nextInt();
	for(int i = 1; i <= n; i++) {
		if(i%2 != 0) {
			s = s + i; 
		}
	}
	System.out.println("Tong n so le dau tien la:"+s);
}
}

