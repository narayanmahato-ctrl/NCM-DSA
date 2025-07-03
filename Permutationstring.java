//  import java.util.*; 
  
  public class Permutationstring {
    public static void word(String str,String perm){

        if(str.length()==0){
            System.out.println(perm);
            return ;
        }
        for(int i=0;i<str.length();i++){
            char currstr=str.charAt(i);
            String newstr=str.substring(0, i)+ str.substring(i+1);
            word(newstr,perm+currstr);

        }
     }

    public static void main(String[] args){
        String str="abc";
        word(str,"");



    }
    
}
