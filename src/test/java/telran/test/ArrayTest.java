package telran.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.Arrays.*;
import telran.Arrays;

public class ArrayTest {

    int[] numbers= {10,7,12,-4,13,3,14};
    @Test 
    void searchTest(){
        assertEquals(0,search(numbers,10));
        assertEquals(3,search(numbers,-4));
        assertEquals(6,search(numbers,14));
        assertEquals(-1,search(numbers, 100));

    }
    @Test
    void addTest(){
        int newNumber = 100;
        int[] expected = {10,7,12,-4,13,3,14,100};
        assertArrayEquals(expected, addNumber(numbers, newNumber));
    }
    @Test
    void testInsertAtTheBeginning() {
        int[] originalArray = {10, 7, 12, -4, 13, 3, 14};
        int index = 0;
        int number = 99;
        int[] expectedArray = {99, 10, 7, 12, -4, 13, 3, 14};
        assertArrayEquals(expectedArray, insert(originalArray, index, number));
    }
    @Test
    void testInsertInTheMiddle() {
        int[] originalArray = {10, 7, 12, -4, 13, 3, 14};
        int index = 3;
        int number = 99;
        int[] expectedArray = {10, 7, 12, 99, -4, 13, 3, 14};
        assertArrayEquals(expectedArray, insert(originalArray, index, number));
    }
    @Test
    void testInsertAtTheEnd() {
        int[] originalArray = {10, 7, 12, -4, 13, 3, 14};
        int index = 7;
        int number = 99;
        int[] expectedArray = {10, 7, 12, -4, 13, 3, 14, 99};
        assertArrayEquals(expectedArray, insert(originalArray, index, number));
    }
    @Test
    void testRemoveFromBeginning() {
        int[] originalArray = {10, 7, 12, -4, 13, 3, 14};
        int index = 0;
        int[] expectedArray = {7, 12, -4, 13, 3, 14};
        assertArrayEquals(expectedArray, remove(originalArray, index));
    }
    @Test
    void testRemoveFromMiddle() {
        int[] originalArray = {10, 7, 12, -4, 13, 3, 14};
        int index = 3;
        int[] expectedArray = {10, 7, 12, 13, 3, 14};
        assertArrayEquals(expectedArray, remove(originalArray, index));
    }
    @Test
    void testRemoveFromEnd() {
        int[] originalArray = {10, 7, 12, -4, 13, 3, 14};
        int index = 6;
        int[] expectedArray = {10, 7, 12, -4, 13, 3};
        assertArrayEquals(expectedArray, remove(originalArray, index));
    }


}
