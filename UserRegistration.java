import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}";
    public static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";
    public static final String MOBILE_NO_REGEX = "^[+]{0,1}[0-9]{2,3}[: :][7-9]{1}[0-9]{9}$";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\s+$).{8,}$";
    // (?=.*[0-9])       # a digit must occur at least once
    // (?=.*[a-z])       # a lower case letter must occur at least once
    // (?=.*[A-Z])       # an upper case letter must occur at least once
    // (?=.*[@#$%^&+=])  # a special character must occur at least once
    // (?=\S+$)          # no whitespace allowed in the entire string
    // .{8,}             # anything, at least eight places though

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
    public static boolean validateMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NO_REGEX);
        return pattern.matcher(mobileNo).matches();
    }
    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        return pattern.matcher(password).matches();
    }
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int fName = 0, lName = 0, eMail = 0, mobile = 0, pswd = 0;
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
        do {
            System.out.println("Enter mobile number: ");
            String mobileNo = object.nextLine();
            if ((validateMobileNo(mobileNo)) == true) {
                mobile = 1;
                System.out.println("That's a valid mobile number.");
            } 
            else {
                mobile = 0;
                System.out.println("That's an invalid mobile number.");
            }
        } while(mobile == 0);
        do {
            System.out.println("Enter password (alphanumeric): ");
            String password = object.nextLine();
            if ((validatePassword(password)) == true) {
                pswd = 1;
                System.out.println("That's a valid password.");
            } 
            else {
                pswd = 0;
                System.out.println("That's an invalid password.");
            }
        } while(pswd == 0);
    }
}