import java.util.*;

public class Arr2d {
    public static void main(String[] args){
        Scanner dc=new Scanner(System.in);

        System.out.println("enter number of rows");
        int rows=dc.nextInt();
        System.out.println("enter number of cols");
        int cols=dc.nextInt();
        System.out.println("now enter numbers");
        int[][] sirr=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            sirr[i][j]=dc.nextInt();}
         
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.println(sirr[i][j]);
        }
        System.out.println(" ");
    }
        System.out.println("number u want to search : ");
        int search=dc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(sirr[i][j]==search){
                    System.out.println("x found at location:(" + i + "," + j + ")"); 
                }
               
            }
        }
        dc.close();


    }
    
}
