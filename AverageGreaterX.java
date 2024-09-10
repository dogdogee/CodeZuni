import java.util.Random;
import java.util.Scanner;

public class AverageGreaterX {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        double a[]= Taomang(Input,rand) ;
        xuatmang(a);   
        System.out.println("Trung Bình cộng các sô lớn hơn x: "+Process(Input, a));
        
    }
        public static double[] Taomang(Scanner scan,Random rand) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
        double a[] = new double[n];
        for (int i=0 ;i<n;i++){
            a[i]=rand.nextInt(2001)-1000;
        }
		return a;
		}
	public static void xuatmang(double a[]) {
        for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
    }
    public static double Process(Scanner scan,double a[]){
        int sum=0;
        int count = 0;
        System.out.println("Nhập x: ");
        double x = Double.parseDouble(scan.nextLine());
        for(int i =0;i<a.length;i++){
            if(a[i]>x){
                sum+=a[i];
                count++;
            }
        } 
        if(count==0)
            return 0;
        
        return sum/count;
    }
}
