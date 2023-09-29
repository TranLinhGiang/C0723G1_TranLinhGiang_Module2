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
    private static final String GENDER_REGEX = "^(male|female|lgpt)$";
    private static final String TYPECUSTOMER_REGEX = "^(diamond|platinum|gold|silver|)$";
    private static final String PHONENUMBER_REGEX = "^0[0-9]{9}$";
    private static final String EMAIL_REGEX = "^[a-z]+([0-9]*)([@]{1})(gmail{1})*([.]{1})([com]{1})*$";
    private static final String LEVER_REGEX = "^(trung cap|cao dang|dai hoc|sau dai hoc)$";
    private static final String LOCATION_REGEX = "^(le tan|phuc vu|chuyen vien|giam sat|quan ly|giam doc)$";

    private static final String IDVILLA_REGEX = "^SVVL-[0-9]{4}$";
    private static final String IDHOUSE_REGEX = "^SVHO-[0-9]{4}$";

    private static final String NAME_VILLA = "^[A-Z][a-z]*(\\\\s[A-Z][a-z]*)*$";
    private static final String TYLE_REGEX = "^(Year|Month|Day|Hourly)$";
    private static final String TYPE_ROOMVILLA = "^(suite|deluxe)$";
    private static final String IDROOM_REGEX = "^SVRO-[0-9]{4}$";
    private static final String NAME_ROOM = "^[A-Z][a-z]*(\\\\s[A-Z][a-z]*)*$";
    private static final String FREE_ROOM = "^(water|wifi)$";


    public static boolean freeRoom(String freeRoom) {
        pattern = Pattern.compile(FREE_ROOM);
        matcher = pattern.matcher(freeRoom);
        return matcher.matches();
    }

    public static boolean rentalTypeRoom(String rentalType) {
        pattern = Pattern.compile(TYLE_REGEX);
        matcher = pattern.matcher(rentalType);
        return matcher.matches();
    }

    public static boolean nameRoom(String nameRoom) {
        pattern = Pattern.compile(NAME_ROOM);
        matcher = pattern.matcher(nameRoom);
        return matcher.matches();
    }

    public static boolean serviceCode(String serviceCode) {
        pattern = Pattern.compile(IDROOM_REGEX);
        matcher = pattern.matcher(serviceCode);
        return matcher.matches();
    }

    public static boolean rentalTypeHouse(String rentalTypeHouse) {
        pattern = Pattern.compile(TYLE_REGEX);
        matcher = pattern.matcher(rentalTypeHouse);
        return matcher.matches();
    }

    public static boolean nameHouse(String nameHouse) {
        pattern = Pattern.compile(NAME_VILLA);
        matcher = pattern.matcher(nameHouse);
        return matcher.matches();
    }

    public static boolean idHouse(String idHouse) {
        pattern = Pattern.compile(IDHOUSE_REGEX);
        matcher = pattern.matcher(idHouse);
        return matcher.matches();
    }

    public static boolean typeRoomVilla(String typeRoomVilla) {
        pattern = Pattern.compile(TYPE_ROOMVILLA);
        matcher = pattern.matcher(typeRoomVilla);
        return matcher.matches();
    }

    public static boolean rentalType(String rentalType) {
        pattern = Pattern.compile(TYLE_REGEX);
        matcher = pattern.matcher(rentalType);
        return matcher.matches();
    }

    public static boolean nameVilla(String namVilla) {
        pattern = Pattern.compile(NAME_VILLA);
        matcher = pattern.matcher(namVilla);
        return matcher.matches();
    }

    public static boolean idVilla(String idVilla) {
        pattern = Pattern.compile(IDVILLA_REGEX);
        matcher = pattern.matcher(idVilla);
        return matcher.matches();
    }

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
