public class Fiboinrec {
    public static void fiob(int i,int first,int second ){
        if(i==1){
        int next=first+second;
        System.out.println(next);
        return ;
        }
        int next=first+second;
        System.out.println(next);
        fiob(i-1, first=second, second=next);
        }
    public static void main(String[] args){
        fiob(6, 1, 0);
    }
}