
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }
        
        // cast the obj to a Book object.
        Book comparedBook = (Book) obj;

        return this.name.equals(comparedBook.name)
                && this.publicationYear == comparedBook.publicationYear;
    }

}
