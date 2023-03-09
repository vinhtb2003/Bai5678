import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		 int n;
		int tong=0;
	Scanner sc = new Scanner(System.in);
	do {
	System.out.print("Nhap so nguyen n: ");
	n = sc.nextInt();
	tong = tong + n;   	
		}while(tong <= 100);
	System.out.println("Tong cac so nguyen la "+tong);
	}
}
