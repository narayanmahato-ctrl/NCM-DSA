import java.util.*;

public class Artranspose{
    public static void main(String[] args){
        Scanner fuck=new Scanner(System.in);

        System.out.println("enter the rows");
        int rows=fuck.nextInt();

        System.out.println("enter the cols");
        int cols=fuck.nextInt();

        System.out.println("enter the matrix");
        int[][] fundu=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                fundu[i][j]=fuck.nextInt();
            }
        }

        System.out.println("Transpose of this matrix");

        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(fundu[i][j] + " ");

            }
            System.out.println();
        }

        fuck.close();
    }
}