public class TwopX {
    public static int ptx(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        // int xpnmo=ptx(x,n-1);
        // int xp=x*xpnmo;
        // return xp;



// below another method with log n space its take less space then the upper



        if(n%2==0){
            return ptx(x, n/2) * ptx( x,n/2);
        }
        else{
            return ptx(x, n/2) * ptx( x,n/2) * x;
        }
    }
        public static void main(String[] args){
       
        int ans=ptx(2,5);
        System.out.println(ans);
    }
}