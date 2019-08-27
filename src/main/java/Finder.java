import java.util.*;
public class Finder {
    public Finder() {
        System.out.println(">>Initializing the Finder class...");
    }
    public int findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            System.out.println("intArray is null.");

        }
        int n = intArray.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = intArray[i];
            if (max <= temp) {
                max = temp;
            }
        }
        return max;
        }
    public int findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            System.out.println("intArray is null.");
        }
        int n = intArray.length;
        int min = 0;
        for (int i = 0; i < n; i++) {
            int temp = intArray[i];
            if (min >= temp) {
                min = temp;
            }
            }
        return min;
    }
}
