package bai_tap_hoc_lai.ss07_abtract_class_interface;

public class Main {
    public static void main(String[] args) {
        NaturalBook naturalBook = new NaturalBook("Gao", "Kim Dong", 2021, 7);
        System.out.println(naturalBook.display());
        SocialBook socialBook = new SocialBook("De Men", "Anh Duong", 2017, "To Hoai");
        System.out.println(socialBook.display());
    }
}
