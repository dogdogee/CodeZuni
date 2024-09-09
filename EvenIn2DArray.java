import java.util.Random;
import java.util.Scanner;

public class EvenIn2DArray {
    public static void main(String[] args) {
        
    
        Random rand = new Random();
        Scanner Input = new Scanner(System.in);
        System.out.println("nhap hang :");
        int row = Integer.parseInt(Input.nextLine());
        System.out.println("nhap dong : ");
        int column = Integer.parseInt(Input.nextLine());
        int a[][] = Input(row,column,rand);
        Xuat(row, column, a);
        Process(a,column,row);
    }
    public static int random(Random rand){
        return rand.nextInt(101)-50;
    }
    public static int[][] Input(int row,int column,Random rand){
        int a[][]= new int[column][row];
        for (int i =0;i<column;i++){
            for (int j =0;j<row;j++)
            a[i][j]=random(rand);        
        }
        return a;
    }
    public static void Xuat(int row ,int column,int a[][]){
        for (int i =0;i<column;i++){
            for (int j =0;j<row;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.print("\n");
    }
}
public static boolean even(int k){
    return k%2==0;
}
public static void Process(int a[][],int column,int row){
    for(int i=0;i<column;i++){
        for(int j=0;j<row;j++){
            if(even(a[i][j])){
                System.out.println("First Even Number in Array is: "+a[i][j]+" ["+i+"] "+"["+j+"]");
                System.exit(0);
            }
        }
    }
    System.out.println("khong ton tai");
}
}
