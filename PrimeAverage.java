import java.util.Random;
import java.util.Scanner;

public class PrimeAverage {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        int a[]= Taomang(Input,rand) ;
        xuatmang(a); 
        System.out.println(Average(a)); 
        
    }
        public static int[] Taomang(Scanner scan,Random rand) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
        int a[] = new int[n];
        for (int i=0 ;i<n;i++){
            a[i]=rand.nextInt(2001)-1000;
        }
		return a;
		}
	public static void xuatmang(int a[]) {
        for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
        System.out.println();
    }
    public static boolean PrimeCheck(int k){
        if(k<2)
            return false;
        for(int i=2;i<Math.sqrt(k);i++)
            if(k%i==0)
            return false;
        return true;
    }
    public static double Average(int a[]){
        int count =0;
        int sum=0;
        System.out.println("các Số Nguyên tó là :");
        for(int i=0;i<a.length;i++){
            if(PrimeCheck(a[i])){
                sum+=a[i];
                System.out.print(a[i]+" ");
                count++;
            }
        }
        if (count ==0)
            return 0;
        System.out.println();
        System.out.print("Trung Bình cộng các số Nguyên tố là: ");
        return sum/count;
    }
}
