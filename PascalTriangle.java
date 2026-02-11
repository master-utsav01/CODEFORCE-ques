
import java.util.*;


        public class PascalTriangle {
            public static void main(String[] args) {
                long row=5;
                long col=3;
                long num=returnFactorial(row-1);
                long den=returnFactorial(col-1);
                long deno=returnFactorial((row-1)-(col-1));
                long ans=num/(den * deno);
                System.out.println(ans);


            }
            static long returnFactorial(long n){
                Scanner sc= new Scanner(System.in);
                n=sc.nextInt();
                long fact=1;
                for(int i=1;i<=n;i++){
                    fact= fact*i;
                }
                return fact;
            }
            


}