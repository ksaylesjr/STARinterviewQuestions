import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class dateTimeAPI {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        int currentYear = todayDate.getYear();
        int currentMonth = todayDate.getMonthValue();
        int currentDay = todayDate.getDayOfMonth();
        // print today's date info
        System.out.printf("""
                Date: %s
                Year: %d
                Month: %d
                Day: %d
                
                """,todayDate, currentYear, currentMonth, currentDay);

        // get users birthday
        System.out.println("Enter your birthday in the format " +
                "YYYY-MM-DD" + "\n>>");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LocalDate birthday = LocalDate.parse(input);
        Period age = Period.between(birthday, todayDate);
        int years = age.getYears();

        // users next birthday
        LocalDate nextBirthday = birthday.withYear(currentYear);

        // check if users birthday was earlier this year
        if(!nextBirthday.isAfter(todayDate)){
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysRemaining = ChronoUnit.DAYS.between(todayDate, nextBirthday);

        //print users info
        System.out.printf("You are %d years old%n" +
                "Days until your next birthday: %d", years, daysRemaining);
    }
}