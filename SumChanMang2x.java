import java.util.Random;
import java.util.Scanner;
public class SumChanMang2x {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner Input = new Scanner(System.in);
        System.out.println("nhap hang :");
        int column = Integer.parseInt(Input.nextLine());
        System.out.println("nhap dong : ");
        int row = Integer.parseInt(Input.nextLine());
        int a[][] = Input(row,column,rand);
        Xuat(row, column, a);
        System.out.println("Tong cac so chan la :" +Process(row,column,a));
    }
    public static int random(Random rand){
        return rand.nextInt(101)-50;
    }
    public static int[][] Input(int row,int column,Random rand){
        int a[][]= new int[row][column];
        for (int i =0;i<row;i++){
            for (int j =0;j<column;j++)
            a[i][j]=random(rand);        
        }
        return a;
    }
    public static void Xuat(int row ,int column,int a[][]){
        for (int i =0;i<row;i++){
            for (int j =0;j<column;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.print("\n");
    }
}
public static boolean even(int k){
    return k%2==0;
}
public static int Process(int row , int column,int a[][]){
    int sum = 0;
    for(int i = 0 ;i<row;i++){
        for (int j =0;j<column;j++){
            if (even(a[i][j])){
                sum+=a[i][j];
            }

        }
    }
    return sum;
}
}
