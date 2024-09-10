import java.util.Random;
import java.util.Scanner;

public class FindAllEven {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        int a[] = Taomang(Input,rand);
        xuatmang(a);
        Process(a);

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
    }
    public static boolean thousand(int a){
        if (a==1000||a==-1000)
            return false;
        return hundred(a);
    }
    public static boolean hundred(int a){
        if (a/100!=0){
            return ((a/100)%2!=0 && ((a/10)%2!=0) &&(a%2!=0));
        }
        return dozens(a);
    }
    public static boolean dozens(int a){
        if (a/10!=0){
            return (((a/10)%2!=0) &&(a%2!=0));
        }
        return a%2!=0;
    }
    public static void Process(int a[]){
        System.out.println("cac so co tat ca cac gia tri le la");
    for (int i = 0;i<a.length;i++){
        if(thousand(a[i]))
            System.out.print(a[i]+" ");
    }
    }
}
