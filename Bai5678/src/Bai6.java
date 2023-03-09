import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;

public class Bai6 {
public static void main(String[] args) {
	int n , Giaithua=1;
	Scanner sc = new Scanner(System.in);
	System.out.print("Moi ban nhap n :");
	n= sc.nextInt();
	for(int i=1;i <= n ;i++)
		Giaithua*=i;
    System.out.println(n+ "! co ket qua la: "+ Giaithua );
  }
}
