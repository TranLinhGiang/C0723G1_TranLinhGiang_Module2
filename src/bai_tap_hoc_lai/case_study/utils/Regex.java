package bai_tap_hoc_lai.case_study.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String IDEMPLOYEE_REGEX = "^NV-[0-9]{4}$";
    private static final String IDCUSTOMER_REGEX = "^KH-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String IDCARD_REGEX = "^(\\d{9}|[0-9]{12})$";
    private static final String GENDER_REGEX = "^(male|female)$";
    private static final String TYPECUSTOMER_REGEX = "^(diamond|platinum|gold|silver|)$";
    private static final String PHONENUMBER_REGEX = "^0[0-9]{9}$";
    private static final String EMAIL_REGEX = "^[a-z]+([0-9]*)([@]{1})(gmail{1})*([.]{1})([com]{1})*$";
    private static final String LEVER_REGEX = "^(trung cap|cao dang|dai hoc|sau dai hoc)$";
    private static final String LOCATION_REGEX = "^(le tan|phuc vu|chuyen vien|giam sat|quan ly|giam doc)$";

    public static boolean typeCustomer(String typeCustomer) {
        pattern = Pattern.compile(TYPECUSTOMER_REGEX);
        matcher = pattern.matcher(typeCustomer);
        return matcher.matches();
    }

    public static boolean idCustomer(String idCustomer) {
        pattern = Pattern.compile(IDCUSTOMER_REGEX);
        matcher = pattern.matcher(idCustomer);
        return matcher.matches();
    }

    public static boolean locationEmployee(String locationEmployee) {
        pattern = Pattern.compile(LOCATION_REGEX);
        matcher = pattern.matcher(locationEmployee);
        return matcher.matches();
    }

    public static boolean leverEmployee(String leverEmployee) {
        pattern = Pattern.compile(LEVER_REGEX);
        matcher = pattern.matcher(leverEmployee);
        return matcher.matches();
    }

    public static boolean emailAll(String emailAll) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(emailAll);
        return matcher.matches();
    }

    public static boolean phoneNumber(String phoneNumber) {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean genderAll(String genderAll) {
        pattern = Pattern.compile(GENDER_REGEX);
        matcher = pattern.matcher(genderAll);
        return matcher.matches();
    }

    public static boolean idEmployee(String idEmployee) {
        pattern = Pattern.compile(IDEMPLOYEE_REGEX);
        matcher = pattern.matcher(idEmployee);
        return matcher.matches();
    }

    public static boolean nameAll(String nameAll) {
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(nameAll);
        return matcher.matches();
    }

    public static boolean idCardAll(String idCardAll) {
        pattern = Pattern.compile(IDCARD_REGEX);
        matcher = pattern.matcher(idCardAll);
        return matcher.matches();
    }
}
