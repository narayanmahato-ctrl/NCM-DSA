  import java.util.*;
  
  public class Arrstart {
    public static void main(String[] args){
        Scanner dc=new Scanner(System.in);


                System.out.println("entersize");
                int size=dc.nextInt();
                System.out.println("enter number");
                int[] numb=new int[size];
        for(int i=0;i<size;i++){
                    
                     numb[i]=dc.nextInt();
        }

        boolean isascending=true;

        for(int i=0;i<numb.length-1;i++){
            if (numb[i]>numb[i+1]){
                isascending=false;
            }
        }

        if(isascending){
            System.out.println("given number is in ascending oerder");
        }
        else{
            System.out.println("given number is not in ascending oerder");
        }



        dc.close();
       

    }
    
}
