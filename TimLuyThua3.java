import java.util.Scanner;

public class TimLuyThua3 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("nhap so phan u mang : ");
		int n =nhap(Input);
		int a[]=nhapmang(Input,n);
		xuatmang(a, n);
		System.out.println("Danh sach cac gia tri co dang 3^k");
		Process(a, n);
		
		

	}
	public static int nhap(Scanner Input) {
		int n = Integer.parseInt(Input.nextLine());
		return n;
	}
	public static int[] nhapmang(Scanner Input,int n) {
		int a[] = new int[n];
		for (int i =0;i<n;i++) {
			System.out.print("a["+i+"] = ");
			a[i]=nhap(Input);
			System.out.println("\n");
		}
		return a;
	}
	public static void xuatmang(int a[],int n) {
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static boolean check(int k) {
		int i = 3;
		int temp = 1;
		while (Math.pow(i, temp)<=k) {
			if (Math.pow(i, temp)==k)
				return true;
			temp++;
		}
		return false;
			
	}
	public static void Process(int a[],int n) {
		for (int i=0;i<n;i++)
			if(check(a[i]))
				System.out.print(a[i]+" ");
	}
	

}
