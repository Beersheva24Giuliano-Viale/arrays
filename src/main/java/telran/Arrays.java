package telran;

import java.lang.reflect.Array;

public class Arrays {

    public static int search(int[] array, int key){
        int i = 0;
        while (i<array.length && key != array[i]) {
            
            i++;
        }
        return i==array.length ? -1 : i;

    }
    public static int[] addNumber(int[] array, int number){

        int [] result =java.util.Arrays.copyOf(array, array.length+1);
        result[array.length]= number;
        return result;
    }
    public static int[] insert(int[] ar, int index, int number) {
        if (ar == null || ar.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int[] newArray = new int[ar.length+1];
        System.arraycopy(ar, 0, newArray, 0, index);
        newArray[index] = number;
        System.arraycopy(ar, index, newArray, index + 1, ar.length - index);
        return newArray; 
    }
    public static int[] remove(int[] numbers, int index) {
        if (numbers == null || index < 0 || index >= numbers.length) {
            throw new IllegalArgumentException("Array is null or index is out of bounds");
        } 
        int[] newArray = new int[numbers.length - 1];        
        System.arraycopy(numbers, 0, newArray, 0, index);        
        System.arraycopy(numbers, index + 1, newArray, index, numbers.length - index - 1);        
        return newArray;
    }
    private static boolean pushMaxAtEnd(int[] array, int lenght){
        boolean res = true;
        for(int i =0; i<lenght;i++){
            if (array[i]>array[i+1]) {
                res=false;
                swap(array,i,i+1);
            }
        }
        return res;
    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i]= array[j];
        array[j] = tmp;  
    }
   public static void sort (int [] array){
    int lenght = array.length;
    boolean flagSorted=false;
    while (!flagSorted) {
        lenght--;
        flagSorted=pushMaxAtEnd(array, lenght);
    }
   }
public static int binarySearch(int[] ar, int number) {
    int low = 0;
    int high = ar.length - 1;
    while (low <= high) {
        int midIndex = low + (high-low) / 2;
        if (ar[midIndex] == number) {
            return midIndex;
        }
        if (ar[midIndex] < number) {
            low = midIndex + 1;
        } else {
            high = midIndex - 1;
        }
    }
    return -1;
}
public static int[] insertSorted(int[] arSorted, int number) {
    int[] newArray = new int[arSorted.length + 1];
    int i = 0;
    while (i < arSorted.length && arSorted[i] < number) {
        i++;
    }
    for (int j = 0; j < i; j++) {
        newArray[j] = arSorted[j];
    }
    newArray[i] = number;
    for (int j = i; j < arSorted.length; j++) {
        newArray[j + 1] = arSorted[j];
    }
    return newArray;
}
public static boolean isOneSwap(int[] array) {
    int[] sortedArray = array.clone(); //found a method that clones the array
    //int[] sortedArray = java.util.Arrays.copyOf(array,array.length);
    sort(sortedArray);
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] != sortedArray[i]) {
            count++;
        }
    }
    return count == 2;
}
}