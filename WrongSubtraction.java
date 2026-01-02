import java.util.*;
public class WrongSubtraction {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       
       if(n>1 && k>0){
        while (k>=1) {
            if(n%10==0){
                n=n/10;
                k--;
            }else{
                n=n-1;
                k--;
            }
        }

       }
       System.out.println(n);
    }
}
