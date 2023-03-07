package Baitap1;

import java.util.Scanner;
import java.util.Stack;

public class maNhiPhan {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap n:");
	int n=sc.nextInt();
	outMaNhiPhan(n);
}

private static void outMaNhiPhan(int number) {
	Stack<Integer> stack = new Stack<Integer>();

while(number!=0)
{
	int d=number%2;
	stack.push(d);
	number/=2;
	
}
System.out.print("\nGiá trị nhị phân là: ");
while (!(stack.isEmpty() ))
{
    System.out.print(stack.pop());
}
}
}
