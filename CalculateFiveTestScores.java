import java.util.*;

public class CalculateFiveTestScores {
    public static void main(String[] args) {
        int[] scores = {0, 0, 0, 0, 0};     //holds five scores
        double average = 0.0;   //average test score
        int total = 0;    //helper to calculate average
        int lowest = 0;
        int highest = 0;
        char letterGrade;


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter five test scores seperated by a space");

        int count = 0;
        boolean notDone = true;
        while (notDone) {

            int num = sc.nextInt();
            scores[count] = num;

            if (count == 4) {
                notDone = false;
            }
            ++count;
        }

        lowest = scores[0];
        highest = scores[0];

        for (int score : scores) {
            total += score;

            if (score < lowest) {
                lowest = score;
            }
            if (score > highest) {
                highest = score;
            }
        }

        average = (double) total / scores.length;

        System.out.printf("Total: %d%nAverage: %.0f%nHighest: %d%nLowest: %d%n", total, average, highest, lowest);

        System.out.printf("Your values were: %n");
        for (int i = 0; i < scores.length; ++i) {
            if (scores[i] >= 90) {
                letterGrade = 'A';
            } else if (scores[i] >= 80) {
                letterGrade = 'B';
            } else if (scores[i] >= 70) {
                letterGrade = 'C';
            } else if (scores[i] >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("%d - %c%n", scores[i], letterGrade);
        }
    }
}