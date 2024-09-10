import java.util.Random;
import java.util.Scanner;

public class SumNextAbsNum {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        double a[]= Taomang(Input,rand);
        xuatmang(a);
        System.out.println("tổng các giá trị lớn hơn trị tuyệt đối của giá trị đứng sau nó : "+Sum(a));
    }
        public static double[] Taomang(Scanner scan,Random rand) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
        double a[] = new double[n];
        for (int i=0 ;i<n;i++){
            a[i]=rand.nextInt(2001)-1000+rand.nextDouble();
        }
		return a;
		}
	public static void xuatmang(double a[]) {
        for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
    }
    public static boolean CheckNextNum(double n1,double n2){
        return (n1>Math.abs(n2));
    }
    public static double Sum(double a[]){
        double sum=0;
        for(int i=0;i<a.length-1;i++){
            if(CheckNextNum(a[i], a[i+1])){
                sum+=a[i];
            }
        }
        return sum;
    }
}
