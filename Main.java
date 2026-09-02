//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Challenge HELLO WORLD
        System.out.println("Hello World!");
        System.out.println();

        //PRINTING OUTPUT
        int age = 32;
        double height = 5.8;
        String name = "Kenya";

        System.out.printf("Name:%s,Age:%d,Height:%.2f%n", name, age, height);
        System.out.println();

        //Challenge OPERATORS
        int a = 20;
        int b = 10;

        System.out.printf("a = %d, b = %d%n", a, b);
        int sum = a + b;
        System.out.printf("a + b = %d%n", sum);
        int difference = a - b;
        System.out.printf("a - b = %d%n", difference);
        int product = a * b;
        System.out.printf("a * b = %d%n", product);
        int quotient = a / b;
        System.out.printf("a / b = %d%n", quotient);

        boolean whoIsBigger = (a > b);
        System.out.printf("Is a > b? %b%n",whoIsBigger);

        boolean bothPositive = whoIsBigger && (b > 0);
        System.out.printf("Is a > b and b > 0? %b%n", bothPositive);
        System.out.println();

        //Challenge CONTROL FLOW
        int score = 95;
        char letterGrade;
        String determination = (score >= 50) ? "Passed" : "Failed";
        System.out.printf("The student has %s%n", determination);

        if (score >= 90){
            letterGrade = 'A';
            System.out.printf("Your letter grade is: %c%n", letterGrade);
        }
        else if (score >= 75 && score <= 89){
            letterGrade = 'B';
            System.out.printf("Your letter grade is: %c%n", letterGrade);
        }
        else if (score >= 60 && score <= 74){
            letterGrade = 'C';
            System.out.printf("Your letter grade is: %c%n", letterGrade);
        }
        else if (score <= 60){
            letterGrade = 'D';
            System.out.printf("Your letter grade is: %c%n", letterGrade);
        }
        System.out.println();

        //Challenge LOOPS
        System.out.print("For Loop: ");
        for (int i = 1; i < 6; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("While Loop: ");
        int i = 1;
        while(i < 6){
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();

        System.out.print("do-while loop: ");
        i = 1;
        do{
            System.out.print(i + " ");
            ++i;
        }
        while(i < 6);

        System.out.println("\n");


        //Challenge CALCULATOR

        double num1 = 7, num2 = 3;
        char operator = '+';
        String again = "y";
        double answer = 0;
        boolean calculated = true;

        while(again.equals("y")){

            switch(operator){
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0){
                        System.out.println("Cannot divide by zero.");
                        calculated = false;
                        break;
                    }
                    answer = num1 / num2;
                    break;
                case '%':
                    answer = num1 % num2;
                    break;
                default:
                    System.out.println("Incorrect operator type");
                    calculated = false;
            }

            again = "n";

            if (calculated){
                System.out.printf("Result: %.1f%n", answer);
            }

            System.out.println("Thank you for using the calculator.");


        }
    }
}
