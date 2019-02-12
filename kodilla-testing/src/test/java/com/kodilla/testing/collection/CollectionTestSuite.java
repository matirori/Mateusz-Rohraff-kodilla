package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("The case starts");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("The Suite starts");
    }
    @After
    public void after(){
        System.out.println("The case ends");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("The Suit ends");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> numbers2 = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers2);
        //then
        Assert.assertEquals(0, result.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(3);
        numbers3.add(5);
        numbers3.add(4);
        numbers3.add(8);
        numbers3.add(7);
        numbers3.add(4);

        ArrayList<Integer> wantedResult = new ArrayList<Integer>();
        wantedResult.add(4);
        wantedResult.add(8);
        wantedResult.add(4);
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers3);
        //then
        Assert.assertEquals(wantedResult, result);
    }
}
