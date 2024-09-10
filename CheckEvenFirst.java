
import java.util.Scanner;

public class CheckEvenFirst {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a[] = nhapmang(Input);
        xuatmang(a);
        Process(a);
    }
    public static int nhap(Scanner Input) {
		int n = Integer.parseInt(Input.nextLine());
		return n;
	}
	public static int[] nhapmang(Scanner Input) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
			n = Integer.parseInt(Input.nextLine());
		}while (n<2);
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("nhập a["+i+"]");
				a[i] = Integer.parseInt(Input.nextLine());
		}
		return a;
	}
	public static void xuatmang(int a[]) {
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
    public static boolean Check(int k){
        return (Integer.parseInt(Integer.toString(k).substring(0, 1))%2==0);
    }
    public static void Process(int a[]){
        System.out.println("cac so co so dau la chan la :");
        for (int i=0;i<a.length;i++){
            if(Check(a[i]))
            System.out.print(a[i]+" ");
        }
    }
   
}
