

public class string {
    public static void main(String[] args) {
        String s = "Aaryan, is, a, coderjava";
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.substring(0, 7));
        System.out.println(s.indexOf("java"));
        System.out.println(s.equals("arayan is a coder"));
        System.out.println(s.replace("Arayan", "Arush"));

        String[] sarr = s.split(",");

        for(String str : sarr) {
            System.out.println(str);
        }
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        String str ="";
        for(int i = s.length()-1;i>0;i--) {
            str +=s.charAt(i);
        }
        return str;
    }

}
        
