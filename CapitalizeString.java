public class CapitalizeString {

        public static String ans(String s){
            char ch=s.charAt(0);
            char chh=Character.toUpperCase(ch);
            return chh+s.substring(1);
        }
        public static void main(String[] args) {
        String s ="how are you" ;
        System.out.println(ans(s));

    }
}