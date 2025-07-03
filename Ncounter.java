import java.util.*;

public class Ncounter{
    public static int[] countnumbers(Scanner sc){
        int positivecount=0,negativecount=0,zeroes=0;
        char choice;
        do{
            System.out.println("enter a number");
            int num=sc.nextInt();

            if(num>0){
                positivecount++;
            }
            else if(num<0){
                negativecount++;
            }
            else{
                zeroes++;

            }
            System.out.println("do you want to continue(y/n)");
            choice=sc.next().charAt(0);
        }
        while(choice=='y' || choice=='Y');
        return new int[]{positivecount,negativecount,zeroes};

    }

    public static void showresult(int[] counts){
        System.out.println("summery result \n");
        System.out.println("positive count"+counts[0]);
        System.out.println("negative counts"+counts[1]);
        System.out.println("zeroes counts"+counts[2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] counts=countnumbers(sc);

        showresult(counts);



    }

    
}