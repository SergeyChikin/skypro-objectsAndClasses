package skyproCourse1objectsAndClasses;

import java.util.Objects;

public class Book {
     private String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
      return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги - " + bookName + "; Автор -  " + author + "; Год издания - " + publishingYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ( other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author, publishingYear);
    }

}
