public class Leapyear {
    public static void main(String[] args) {
        for(int i = 2022;i<=2072;i++) {
            if(i%400==0 || (i%4==0&&i%100!=0)) {
                System.out.println(i+"");
            }

        }
    }
    
}
