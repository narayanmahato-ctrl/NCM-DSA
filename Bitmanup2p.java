import java.util.*;

public class Bitmanup2p {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check wheater the number is power of 2 or not");
        int number=sc.nextInt();

        int value=(number &(number-1));
        if(value==0){
            System.out.println("yessss");
        }
        else{
            System.out.println("BIG NOO");
        }
        sc.close();
    }
    
}
