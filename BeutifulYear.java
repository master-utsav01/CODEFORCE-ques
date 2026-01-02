import java.util.*;
public class BeutifulYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        Set<Integer> res=new HashSet<>();
        for(int i=year+1;i<9999;i++){
            String str=Integer.toString(i);
            char[] ab=str.toCharArray();
            for(char ch:ab){
                res.add(i);
            }
            if(res.size()==4){
            System.out.println(i);
        }
        }
        
    }
}
