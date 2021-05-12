import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}";
    public static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";
    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lastName).matches();
    }
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        return pattern.matcher(email).matches();
    }
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int fName = 0, lName = 0, eMail = 0;
        do {
            System.out.println("Enter first name: ");
            String fname = object.nextLine();
            if ((validateFirstName(fname)) == true) {
                fName = 1;
                System.out.println("That's a valid first name.");
            } 
            else {
                fName = 0;
                System.out.println("That's an invalid first name.");
            }
        } while(fName == 0);
        do {
            System.out.println("Enter last name: ");
            String lname = object.nextLine();
            if ((validateLastName(lname)) == true) {
                lName = 1;
                System.out.println("That's a valid last name.");
            } 
            else {
                lName = 0;
                System.out.println("That's an invalid last name.");
            }
        } while(lName == 0);
        do {
            System.out.println("Enter email address: ");
            String email = object.nextLine();
            if ((validateEmail(email)) == true) {
                eMail = 1;
                System.out.println("That's a valid email address.");
            } 
            else {
                eMail = 0;
                System.out.println("That's an invalid email address.");
            }
        } while(eMail == 0);
    }
}