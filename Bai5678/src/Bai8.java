import java.util.Scanner;

public class Bai8 {
public static void main(String[] args) {
	int n;
	int tong=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n: ");
	n =sc.nextInt();
	int A[]= new int[n];
	for(int i=0; i<n; i++) {
    System.out.print("Nhap A["+i+"]: ");
	A[i] = sc.nextInt();
	tong = tong + A[i];}
	System.out.print("Trung binh cong cua " +n+ " so la " + (float)tong/n);
	
}
}
