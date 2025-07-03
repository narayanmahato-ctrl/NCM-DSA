import java.util.*;

   
   public class LL {

    public static void main(String[] args){
        LinkedList<String> list= new LinkedList<String> ();
        list.add("my");
        list.add("mame");
        list.add("narayan");

        System.out.println(list.get(1));

        list.add(1,"okk Wronggg");
        list.set(1,"okk Wrongg");

        // list.remove(1);
        System.out.println(list);
    }
    
}
