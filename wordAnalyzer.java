import java.util.*;

public class wordAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String >>");
        String input = sc.nextLine();

        int chars = 0, vowels = 0, consonants = 0, digits = 0, spaces = 0;

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            char lower = Character.toLowerCase(c);

            if (Character.isLetter(lower)){

                if(lower =='a' || lower == 'e' || lower =='i' || lower =='o' || lower == 'u'){
                    vowels += 1;
                    chars += 1;
                }
                else {
                    consonants += 1;
                    chars += 1;
                }
            }
            else if(Character.isDigit(lower)){
                digits += 1;
            }
            else if(Character.isWhitespace(lower)){
                spaces += 1;
            }


        }
        System.out.printf("Characters: %d%nVowels: %d%nConsonants: %d%nDigits: %d%nSpaces: %d%n",
                chars, vowels, consonants, digits, spaces);




    }
}