// import java.util.*;

public class Reversestr {
    public static void main(String[] args){
      
        StringBuilder word = new StringBuilder("NARAYAN");

        for(int i=0;i<word.length()/2;i++){
            int first=i;
            int last=word.length()-i-1;

            char front=word.charAt(first);
            char back=word.charAt(last);

            word.setCharAt(first, back);
            word.setCharAt(last, front);
        }
       
        System.out.println(word);

    }
    
}
 