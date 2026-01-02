import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        Set<Character> hs= new HashSet<>();
        for(char ch:str.toCharArray()){
            hs.add(ch);
        }
        if(hs.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
