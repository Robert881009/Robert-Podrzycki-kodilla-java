package com.kodilla.patterns.prototype.library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("My books");
        Book book1 = new Book("Pan Tadeusz","Adam Mickiewicz", LocalDate.of(2007,07,12));
        Book book2 = new Book("Przedwiosnie","Stefan Zeromski", LocalDate.of(1998,03,22));
        Book book3 = new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(2000,05,21));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My books cloned");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My books cloned 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2,library.getBooks().size());
        assertEquals(2,clonedLibrary.getBooks().size());
        assertEquals(3,deepClonedLibrary.getBooks().size());

}
}
