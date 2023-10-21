import java.util.regex.Pattern;

import javax.xml.bind.ValidationException;

import java.text.SimpleDateFormat;

public class Validation {
    public void checkPhone(String phone) throws ValidationException {
        if (!phone.matches("\\d+")) {
            throw new ValidationException("Phone number must be a number");
        } else if (phone.length() != 10) {
            throw new ValidationException("Phone number must be 10 digits");
        }
    }

    public void checkDate(String date) throws ValidationException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(date);
        } catch (Exception e) {
            throw new ValidationException("Date is not in the correct format (dd/MM/yyyy)");
        }
    }

    public void checkEmail(String email) throws ValidationException {
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email)) {
            throw new ValidationException("Email must be in the correct format");
        }
    }
}
