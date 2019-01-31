package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("The case starts");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("The Suite starts");
    }
    @After
    public void after(){
        System.out.println("The case ends");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("The Suit ends");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.exterminate();
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(3);
        numbers3.add(5);
        numbers3.add(4);
        numbers3.add(8);
        numbers3.add(7);
        numbers3.exterminate();
    }
}
