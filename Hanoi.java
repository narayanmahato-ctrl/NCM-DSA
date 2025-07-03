// import javax.swing.text.html.parser.Element;

public class Hanoi {
        public static int first = -1;
        public static int last = -1;
   
    public static void hanu(String str,int i,char element){

        if(i==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cuurchar=str.charAt(i);
        if(cuurchar==element){
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
        }
        hanu(str, i+1, element);
      }

    public static void main(String[] args){
        String str="abbbachsgdafdy";
        hanu(str, 0, 'b');

    }
    
}
