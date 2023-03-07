package Baitap1;

public class tinhtongn {
public static void main(String[] args) {
	tinhTong(4);
}

private static void tinhTong(int n) {
	int s =0;
	for(var i =0;i<=n;i++) {
		if(n>0) {
			s+=i;
		}
	}
	System.out.println("Tong n ="+s);
}
}
