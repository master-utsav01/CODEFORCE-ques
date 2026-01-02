import java.util.*;
public class BeutifulYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();

        while (true) {
            year++;
            String str=String.valueOf(year);
            if(str.charAt(0)!=str.charAt(1)&&
                str.charAt(0)!=str.charAt(2)&&
                str.charAt(0)!=str.charAt(3)&&
                str.charAt(1)!=str.charAt(2)&&
                str.charAt(2)!=str.charAt(3)&&
                str.charAt(1)!=str.charAt(3)
            ){
                System.out.println(year);
                break;
            }
        }
        
    }
}
