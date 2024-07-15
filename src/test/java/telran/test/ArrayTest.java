package telran.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.Arrays.*;

import java.util.Random;

import telran.Arrays;

public class ArrayTest {

    private static final int N_ELEMENTS = 1000;
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
    @Test 
    void testSort(){
    int[] testNumbers= java.util.Arrays.copyOf(numbers, numbers.length);
    sort(testNumbers);
    int [] expected ={-4,3,7,10,12,13,14};
     }
    @Test
    void sortTestRandomArray(){
        int[] array = getRandomArray(N_ELEMENTS);            
        int limit = array.length -1;
        sort(array);
        for(int i = 0 ; i < limit ; i++){
            assertTrue(array[i] <= array[i+1]);
        }
    }
    private int[] getRandomArray(int nElements) {
        int [] res = new int[nElements];
        Random random = new Random();
        for(int i=0; i<nElements; i++){
            res[i]= random.nextInt();
        }
        return res;
    }
    @Test 
    void testBinarySearch(){
        int[] sortedArray = {2,3,4,5};
        assertEquals(0, binarySearch(sortedArray, 2));
        assertEquals(3, binarySearch(sortedArray, 5));
        assertEquals(-1, binarySearch(sortedArray, -2));
        assertEquals(-1, binarySearch(sortedArray, 0));

    }
    @Test
    void testInsertAtBeginning() {
        int[] sortedArray = {2, 3, 4, 5};
        int number = 1;
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, insertSorted(sortedArray, number));
    }
    @Test
    void testInsertInMiddle() {
        int[] sortedArray = {1, 2, 4, 5};
        int number = 3;
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, insertSorted(sortedArray, number));
    }
    @Test
    void testInsertAtEnd() {
        int[] sortedArray = {1, 2, 3, 4};
        int number = 5;
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, insertSorted(sortedArray, number));
    }
    @Test
    void testInsertDuplicate() {
        int[] sortedArray = {1, 2, 3, 4};
        int number = 3;
        int[] expected = {1, 2, 3, 3, 4};
        assertArrayEquals(expected, insertSorted(sortedArray, number));
    }
    @Test
    void testInsertIntoEmptyArray() {
        int[] sortedArray = {};
        int number = 1;
        int[] expected = {1};
        assertArrayEquals(expected, insertSorted(sortedArray, number));
    }
    @Test
    void testBooleanSwap(){
        assertTrue(isOneSwap(new int[]{1, 3, 2, 4}));
        assertTrue(isOneSwap(new int[]{4, 2, 3, 1}));
        assertFalse(isOneSwap(new int[]{1, 2, 3, 4}));
        assertFalse(isOneSwap(new int[]{4, 3, 2, 1}));
        assertTrue(isOneSwap(new int[]{3, 3, 2, 3, 3}));
        assertTrue(isOneSwap(new int[]{2, 1}));
        assertFalse(isOneSwap(new int[]{1, 2}));
        assertFalse(isOneSwap(new int[]{2, 3, 1}));

    }
}
