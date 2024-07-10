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
    
}
