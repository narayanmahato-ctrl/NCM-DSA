import java.util.Scanner;

public class Fibonacci {
     
    public static int fbo(int n){

        int first=0, second=1;
        System.out.println(first+"\n"+second);
       
        for(int i=2;i<n;i++){
            int next=first+second;
            System.out.println(next+" ");
            first=second;
            second=next;

        }
        return n;
    }



    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number : ");
        int n=sc.nextInt();

        fbo(n);
               sc.close();


    }
    
}
