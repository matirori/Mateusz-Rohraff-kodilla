package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testMedianAdapter() {
        //Given
        Set set = new HashSet();
        Book book = new Book("Władysław Reymont", "Chłopi", 1, "AF/456/256");
        Book book1 = new Book("Władysław Reymont", "Chłopi", 1904, "AF/456/256");
        Book book2 = new Book("Władysław Reymont", "Chłopi", 2000, "AF/456/256");
        set.add(book);
        set.add(book1);
        set.add(book2);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result =  medianAdapter.publicationYearMedian(set);
        //Then
        assertEquals(1904, result);
    }
}
