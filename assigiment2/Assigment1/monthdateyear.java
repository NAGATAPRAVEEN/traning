package assigiment2.Assigment1;

import java.time.*;

public class monthdateyear {
    static void findiff(LocalDate startDate,LocalDate endDate){
        Period diff=Period.between(startDate, endDate);
        System.out.println("Difference" + "between two dates");
        System.out.printf("%d years,%d months" + "%d days", diff.getYears(),diff.getMonths(),diff.getDays());

    }
    public static void main(String[] args) {
        LocalDate star_Date=LocalDate.of(2022, 05, 13);
        LocalDate end_date = LocalDate.of(2027, 05, 10);
        findiff(star_Date, end_date);
    }

}
