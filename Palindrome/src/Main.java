import java.util.Scanner;//import the java scanner class to take user input.

public class Main {
    public static void main(String[] args)
    {
        //initialize a string variable to hold the reversal of the user word.
        //This variable will need to be initialized as an empty string.
        String ReversedWord = "";
        String UserWord;

        //we first need to instantiate a scanner object that will take system input.
        //Scanner object = new constructor(parameter) -> in this case parameter = System.in.
        Scanner Scan = new Scanner(System.in);

        //We need to instantiate a string variable to get the users word.
        System.out.print("Enter a Word or sentence to check if it is a palindrome: ");

        //In Java, to the next line of the string with spaces, use the scanner object.nextLine() function.
        UserWord = Scan.nextLine();

        //Verify
        System.out.println("The users word or sentence is: " + UserWord);

        //space
        System.out.println();

        //When displaying the string length, java adds the white space in the result, we need to replace the spaces.
        //To replace the spaces, use .replace(Target -> " ", replacement -> "").
        System.out.println("Your word or sentence has: " +  ((UserWord.replace(" ", "")).length()) + " characters.");

        //to get the reversal of the original string, we need to loop through
        //the original string variable (using the length as the condition as variable.length)

        for(int i = 0; i < UserWord.length(); i++)
        {
            ReversedWord = UserWord.charAt(i) + ReversedWord;
        }
        System.out.println("Users word or sentence reversed is: " + ReversedWord );

        if(UserWord.equals(ReversedWord))
        {
            System.out.println("YAY, it is a Palindrome!!!!!");
        }
        else
        {
            System.out.println("BOO, it is not a Palindrome!!!!!");
        }


    }
}
