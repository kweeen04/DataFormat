import java.util.Scanner;

import javax.xml.bind.ValidationException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone, email, date;

        System.out.println("====== Validate Program ======");

        Validation validator = new Validation();

        while (true) {
            try {
                phone = getInput("Phone number: ");
                validator.checkPhone(phone);
                break; 
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                email = getInput("Email: ");
                validator.checkEmail(email);
                break; 
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                date = getInput("Date (dd/MM/yyyy): ");
                validator.checkDate(date);
                break; 
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Validation complete.");
    }

    private static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
