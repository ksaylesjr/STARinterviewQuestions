import java.util.*;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  input = "";
        boolean rejected = true;

        while(rejected){
            boolean longEnough = false;
            boolean containsUpper = false;
            boolean containsLower = false;
            boolean containsNum = false;
            
            System.out.println("""
                Please create a password.
                The password must:
                
                Be at least 8 characters
                Contain at least one uppercase letter
                Contain at least one lowercase letter
                Contain at least one number""" +
                    "\n>>");

            input = sc.nextLine();

            if (input.length() >= 8){
                longEnough = true;
            }

            //loop through string validating conditions
            for (int i = 0; i < input.length(); ++i){
                char c = input.charAt(i);
                if (Character.isLowerCase(c)){
                    containsLower = true;
                }
                else if (Character.isUpperCase(c)){
                    containsUpper = true;
                }
                else if (Character.isDigit(c)){
                    containsNum = true;
                }

            }

            if (longEnough && containsLower && containsUpper && containsNum){
                rejected = false;
            }

            if (!rejected){
                System.out.println("Password accepted!");
            }
            else {
                System.out.println("Password rejected:");
            }

            if (!longEnough){
                System.out.println("- Must be at least 8 characters");
            }
            if (!containsUpper){
                System.out.println("- Must contain an uppercase letter");

            }
            if (!containsLower){
                System.out.println("- Must contain an lowercase letter");

            }
            if (!containsNum){
                System.out.println("- Must contain a number");

            }
        }
    }
}