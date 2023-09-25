package bai_tap_hoc_lai.ss19_string_regex;

import java.util.regex.Pattern;

public class CheckMail {
    public static void main(String[] args) throws Exception {
        String email1 = "NguyenVanA2000@gmail.com";  // true
        String email2 = "nguyenVanA1234gmail.com";   // false
        String email3 = "Nguyen_VanA1234@gmail.com";   // true
        String email4 = "nguyenVan_A@gmail.com";   // false

        String regexPattern = "^[\\w-\\.]+[0-9]+@(gmail\\.)+[\\w-]{3}$";

        System.out.println("Check 1: " + email1 + ":  " + patternMatches(email1, regexPattern));
        System.out.println("Check 2: " + email2 + ":  " + patternMatches(email2, regexPattern));
        System.out.println("Check 3: " + email3 + ":  " + patternMatches(email3, regexPattern));
        System.out.println("Check 4: " + email4 + ":  " + patternMatches(email4, regexPattern));
    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}

