public class Abxxx {

    public static void xxstring(int i,String str,String newstring,int count){
        if(i==str.length()){
            for(i=0;i<count;i++){
                newstring+='x';
                System.out.println(newstring);
                
            }
            // System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(i);
        if(currchar=='x'){
            count++;
            xxstring(i+1, str, newstring, count);

        }
        else{
            newstring+=currchar;
            xxstring(i+1, str, newstring, count);
        }
    }
    public static void main(String[] args){
        xxstring(0, "axbncxxfhdsjx", "", 0);

    }
    
}
