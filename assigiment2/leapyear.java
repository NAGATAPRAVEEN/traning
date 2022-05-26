package assigiment2;

import java.time.Year;

public class leapyear {
    public static boolean isLeapyear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        final int startYear = 2022;
        final int endYear = startYear+50;

        for(int i = startYear; i<endYear;i++) {
            if (isLeapyear(i)) {
                System.out.println(i);
                
            }
        }

    }

}
    


    
