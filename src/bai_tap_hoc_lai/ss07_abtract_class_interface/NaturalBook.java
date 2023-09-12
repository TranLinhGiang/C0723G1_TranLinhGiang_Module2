package bai_tap_hoc_lai.ss07_abtract_class_interface;

public class NaturalBook extends Book implements IBook{
    private int numberOfPublications;


    public NaturalBook(String nameBook, String publishingCompany, int publishingYear, int numberOfPublications) {
        super(nameBook, publishingCompany, publishingYear);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
    @Override
    public String display() {
        return "NaturalBook{" +
                " nameBook = " + getNameBook() +
                ", publishingCompany = " + getPublishingCompany() +
                ", publishingYear = " + getPublishingYear() +
                ", numberOfPublications = " + numberOfPublications +
                '}' + " \n";
    }
}
