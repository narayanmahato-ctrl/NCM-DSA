public class Rec {
    public static void printfact(int i,int fact){
        if(i==1 ){
            fact*=i;
            System.out.println(fact);
            return;
        }
        fact*=i;
        printfact(i-1,fact);
    }

    public static void main(String[] args){
        printfact(5,1);


    }
    
}
