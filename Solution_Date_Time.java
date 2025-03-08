
import java.util.*;

public class Solution_Date_Time {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(++i + " " + line);
        }
        */
        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month_, int day_, int year_) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year_, month_-1, day_);
        int day_week = calendar.get(Calendar.DAY_OF_WEEK);
        String day = "";
        switch (day_week) {
            case Calendar.MONDAY:
                day = "MONDAY";
                break;
            case Calendar.TUESDAY:
                day = "TUESDAY";
                break;
            case Calendar.WEDNESDAY:
                day = "WEDNESDAY";
                break;
            case Calendar.THURSDAY :
                day = "THURSDAY";
                break;
            case Calendar.FRIDAY :
                day = "FRIDAY";
                break;
            case Calendar.SATURDAY :
                day = "SATURDAY";
                break;
            case Calendar.SUNDAY :
                day = "SUNDAY";
                break;
        }
        return day;
    }
}