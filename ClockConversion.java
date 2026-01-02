import java.util.*;
public class ClockConversion {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
              String time= sc.nextLine();
              int hr=Integer.parseInt(time.substring(0,2));
              String min=time.substring(3, 5);

              String period=(hr<12) ? "AM" : "PM";

              int hr12=(hr%12);

              if(hr12==0) {
                     hr12=12;
              }
              String hourStr = String.format("%02d", hr12);

              System.out.println(hourStr+":"+min+" "+period);

       }
        
       } 
}
