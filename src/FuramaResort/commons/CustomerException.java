package FuramaResort.commons;

import FuramaResort.Models.Customer;

import java.util.List;

public class CustomerException extends Exception implements Regex {

    public CustomerException(String message) {
        super(message);
    }
    static boolean check=false;
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public static void checkName(String name) throws CustomerException {
         check = name.matches(NAME);
        if (!check) {
            throw new CustomerException("Name invalid");
        }
    }

    public static void  checkBirthday(String birthday) throws CustomerException{
        check= birthday.matches(BIRTHDAY);
        if (!check) {
            throw new CustomerException("Wrong input");
        }
        String[] ArrayBirhday = birthday.split("/");
        int year = Integer.parseInt(ArrayBirhday[2]);
        boolean age18Plus = year < (2021 - 18);
        if (year < 1900) {
            throw new CustomerException("Year<1900");
        } else if (!age18Plus) {
            throw new CustomerException("Less than 18 years old ");
        }
    }

    public static void checkGender(String gender) throws CustomerException {
        check=gender.matches(GENDER);
        if (!check) {
        throw new CustomerException("Email must be in the correct format (Male/Female)");
        }
    }
    public static void checkIdCard(String idcard) throws CustomerException{
        check=idcard.matches(ID_CARD);
        if (!check) {
            throw new CustomerException("The Id Card must have 9 digits and be in the format XXXXXXXXX");
        }
    }


    public static void checkPhoneNumber(String phoneNumber) throws CustomerException {
        check = phoneNumber.matches(PHONE_NUMBER);
        if (!check) {
            throw new CustomerException("The phone number must have 10 digits and be in the format 0XXXXXXXXX");
        }
    }
    // kiem tra email
    public static void checkEmail(String email) throws CustomerException {
        check = email.matches(EMAIL_REGEX);
        if (!check) {
            throw new CustomerException("Email must be in the correct format abc@abc.abc");
        }
    }
    //kiem tra lon hon khong va khong qua so luong
    public static boolean checkChoiceCustomer(String choiceCustomer, List<Customer> list) throws CustomerException {
        int choice= Integer.parseInt(choiceCustomer);
        if (list.size() <= choice &&choice<=0){
            throw new CustomerException("Wrong index");
        }else {
            return true;
        }
    }
}
