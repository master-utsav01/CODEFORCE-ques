import java.util.*;
public class aPLUSbwhole3 {
    public static int ans(int a,int b){
        
        return (int)Math.pow(a+b, 3);
    }
    public static int ans2(int a,int b){
        
        return (a+b)*(a+b)*(a+b);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=4;
        int b=2;
        int res=ans(a, b);
        System.out.println(res);
        ans2(3  , 2);

    }
}
