package bai_tap_hoc_lai.ss07_abtract_class_interface;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook() {
    }

    public SocialBook(String nameBook, String publishingCompany, int publishingYear, String author) {
        super(nameBook, publishingCompany, publishingYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String display() {
        return "SocialBook{" +
                " nameBook = " + getNameBook() +
                ", publishingCompany = " + getPublishingCompany() +
                ", publishingYear = " + getPublishingYear() +
                ", author='" + author + '\'' +
                '}' + "\n";
    }
}
