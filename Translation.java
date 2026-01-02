import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String st=sc.next();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if(reverse.equals(st)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
      
    }
}
