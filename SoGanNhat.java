import java.util.Scanner;
import java.util.Arrays;

public class SoGanNhat {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a[]= nhapmang(Input) ;
        xuatmang(a);
        Sort(a);
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
    public static int[] Sort(int a[]){
        Arrays.sort(a);

        return a;
    }
    public static boolean check(int n1 ,int n2,int index){
		if (Math.abs(n1-n2)==index)
			return true;
		return false;
	}
	public static void Process(int a[]){
		int count = 0;
			for (int i=1;i<a.length;i++){
			if(count <=6){
				for(int j =i;j<a.length;j++){
					if(check(a[j],a[j+1],i)){
						count ++;
						System.out.println("("+a[j]+","+a[j+1]+")");
						if(i==1){
							j++;
							j++;
						}
					}

				}
			}
		}
	}
}


