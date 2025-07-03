import java.util.*;

public class Gcd {
    public static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
    }
    return a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();

        System.out.println("enter 2nd number");
        int b=sc.nextInt();
        

        int cd=hcf(a,b);
        System.out.println("GCD of " + a + " and " + b + " is: " + cd);
               sc.close();


    }
    
}
