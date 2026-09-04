import java.util.*;


public class REPLapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int num1 = 0;   // Users first input number
        int num2 = 0;   // Users seconds input number
        int solution = 0; // Variable to hold solution after arithmetic
        Random r = new Random();    // Object to generate random number
        boolean isDone = true;  //while loop sentinel value


        do {
            // Display initial output to user
            System.out.println("Welcome to my REPL App!");
            System.out.println("Available commands:\n" +
                    "  add\n" +
                    "  subtract\n" +
                    "  multiply\n" +
                    "  divide\n" +
                    "  random\n" +
                    "  reverse\n" +
                    "  quit\n" + ">>");

            input = sc.nextLine();

            if (input.equals("add")) {
                System.out.print("First number:");
                num1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Second number:");
                num2 = sc.nextInt();
                sc.nextLine();
                solution = num1 + num2;
                System.out.printf("Result: %d%n",solution);
            } else if (input.equals("subtract")) {
                System.out.print("First number:");
                num1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Second number:");
                num2 = sc.nextInt();
                sc.nextLine();
                solution = num1 - num2;
                System.out.printf("Result: %d%n",solution);
            } else if (input.equals("multiply")) {
                System.out.print("First number:");
                num1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Second number:");
                num2 = sc.nextInt();
                sc.nextLine();
                solution = num1 * num2;
                System.out.printf("Result: %d%n",solution);
            } else if (input.equals("divide")) {
                System.out.print("First number:");
                num1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Second number:");
                num2 = sc.nextInt();
                sc.nextLine();
                solution = num1 / num2;
                System.out.printf("Result: %d%n",solution);
            } else if (input.equals("random")) {
                solution = r.nextInt(1,101);    // bounded 1 inclusive, 101 exclusive
                System.out.printf("Minimum: 1\n" +
                        "Maximum: 100\n" +
                        "Random: %d%n", solution);
            } else if (input.equals("reverse")) {
                System.out.println("Enter text:");
                input = sc.nextLine();
                StringBuilder rev = new StringBuilder();    // Object to reverse a string
                rev.append(input);
                rev.reverse();
                System.out.println(rev);
            } else if (input.equals("quit")) {
                System.out.print("Goodbye!");
                isDone = false;
            }
        }
        while (isDone);
    }
}