import java.util.Random;
import java.util.Scanner;

public class FiveInDozens {
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
		}while (n<=2);
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
        System.out.println();
	}
    public static boolean Check5indozens(int k){
        return ((((k/10)/5)%2)!=0);
    }
    public static int NSum(int k){
        int sum = 0;
        while (k > 0) {
            sum = sum + k % 10;
            k = k / 10;
        }
        return sum;
    }
    public static void Process(int a[]){
        int Sum=0;
        int NumSum = 0;
        for (int i =0;i<a.length;i++){
            if(Check5indozens(a[i])){
                Sum+=a[i];
                NumSum=NumSum+NSum(a[i]);
                System.out.println(NumSum);
            }
        }
        System.out.println("Tổng các số có hàng chục là 5 : "+Sum);
        System.out.println("Tổng các chữ số có hàng chục là 5: "+NumSum);
    }

}
