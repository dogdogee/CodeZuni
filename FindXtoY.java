import java.util.Scanner;
import java.util.Random;

public class FindXtoY {
    public static void main(String[] args) {    
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        int a[]= Taomang(Input,rand) ;
        xuatmang(a);
        Process(Input,a);
    }
    public static int[] Taomang(Scanner scan,Random rand) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2);
        int a[] = new int[n];
        for (int i=0 ;i<n;i++){
            a[i]=rand.nextInt(201)-100;
        }
		return a;
		}
	public static void xuatmang(int a[]) {
        for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
    }
    public static boolean Check(int x,int y,int num){
        if (num>=x&&num<=y&&num%2==0)
            return true;
        return false;
    }
    public static void Process(Scanner Input,int a[]){
        System.out.println("Nhap x:");
        int x = Integer.parseInt(Input.nextLine());
        System.out.println("nhap y: ");
        int y = Integer.parseInt(Input.nextLine());
        for (int i =0;i<a.length;i++){
            if (Check(x,y,a[i])){
                System.out.println(a[i]);
            }
        }
    }
}
