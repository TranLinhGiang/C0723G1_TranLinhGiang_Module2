package bai_tap_hoc_lai.ss07_abtract_class_interface;

public abstract class Book {
    private String nameBook;
    private String publishingCompany;
    private int publishingYear;

    public Book() {
    }

    public Book(String nameBook, String publishingCompany, int publishingYear) {
        this.nameBook = nameBook;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
