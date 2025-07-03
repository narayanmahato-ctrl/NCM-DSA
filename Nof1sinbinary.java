import java.util.*;  
  public class Nof1sinbinary {
    public static void main(String[] args){
        Scanner ass=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=ass.nextInt();

        int count=0;

        while(n!=0){
            if((n&1)==1){
                count++;}

                n=n>>1;
               
            
        }

        System.out.println(count);

        ass.close();
    }
    
}
