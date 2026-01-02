import java.util.*;
public class MakeNewArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int res=n/k;
            int ans=res*k;
            System.out.println(ans);
        }
    }
}
