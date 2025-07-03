import java.util.*;

    
public class Funcsumodd{

    public static int odd(int x,int sum){
        sum=0;  //the diff of putting here is it will return exact sum of all odd integer
        for(int i=1;i<=x;i++){
            // sum=0; if i put sum here it return 35 that also include my 10 that takeing from the user
            if(i%2!=0){
            System.out.println("odd\n"+i);
            sum=sum+i;

        }
        
        
        }
       
        
        return sum;
            
        

    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        // int check=odd(n);
        System.out.println(odd(n, n));

        
       s.close();


    }
}
