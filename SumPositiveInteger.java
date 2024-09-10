import java.util.Random;
import java.util.Scanner;

public class SumPositiveInteger {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        double a[]= Taomang(Input,rand) ;
        xuatmang(a);
        Process(a);
        
    }
        public static double[] Taomang(Scanner scan,Random rand) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
        double a[] = new double[n];
        for (int i=0 ;i<n;i++){
            a[i]=(rand.nextInt(1999)-1000)+rand.nextDouble();;
        }
		return a;
		}
	public static void xuatmang(double a[]) {
        for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
    }
    public static boolean Positive(double k){
        return (k>0);
    }
    public static void Process(double a[]){
        System.out.println("Các Số là Số Nguyên Dương là: ");
        for (int i=0;i<a.length;i++){
            if (Positive(a[i]))
                System.out.println(a[i]);
        }
    }
}
