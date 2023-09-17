package bai_tap_hoc_lai.mvc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String LICENSEPLATESCAR_REGEX = "^[0-9]{2}[CAR]{3}([-])([0-9]){4}$";
    private static final String LICENSEPLATESMOTO_REGEX = "^[0-9]{2}[MOTO]{4}([-])([0-9]){4}$";
    private static final String LICENSEPLATESTRUCK_REGEX = "^[0-9]{2}[TRUCK]{5}([-])([0-9]){4}$";
    private static final String WATTAGEMOTO_REGEX = "^(manh|yeu|qua yeu)$";
    private static final String TYPECAR_REGEX = "^(ca nhan|du lich|xe khach)$";
    private static final String YEAR_REGEX = "^[0-9]{4}$";   // chung cho tat ca


    public static boolean licensePlatesTruck(String licensePlatesTruck) {
        pattern = Pattern.compile(LICENSEPLATESTRUCK_REGEX);
        matcher = pattern.matcher(licensePlatesTruck);
        return matcher.matches();
    }

    public static boolean licensePlatesCar(String licensePlatesCar) {
        pattern = Pattern.compile(LICENSEPLATESCAR_REGEX);
        matcher = pattern.matcher(licensePlatesCar);
        return matcher.matches();
    }

    public static boolean wattageMoto(String wattage) {
        pattern = Pattern.compile(WATTAGEMOTO_REGEX);
        matcher = pattern.matcher(wattage);
        return matcher.matches();
    }

    public static boolean licensePlatesMoto(String licensePlatesMoto) {
        pattern = Pattern.compile(LICENSEPLATESMOTO_REGEX);
        matcher = pattern.matcher(licensePlatesMoto);
        return matcher.matches();
    }

    public static boolean typeCar(String typeCar) {
        pattern = Pattern.compile(TYPECAR_REGEX);
        matcher = pattern.matcher(typeCar);
        return matcher.matches();
    }

    public static boolean yearAll(String yearAll) {
        pattern = Pattern.compile(YEAR_REGEX);
        matcher = pattern.matcher(yearAll);
        return matcher.matches();
    }
}
