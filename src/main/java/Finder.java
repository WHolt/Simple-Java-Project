import java.util.*;
public class Finder {
    public Finder() {
        System.out.println(">>Initializing the Finder class...");
    }

    public static Integer findMax(int[] intArray) {
        int max = 0;
        if (intArray == null) {
            System.out.println("intArray is null.");
            return null;
        } else if (intArray.length == 0) {
            System.out.println("intArray is null.");
            return null;
        } else {
            int n = intArray.length;
            for (int i = 0; i < n; i++) {
                int temp = intArray[i];
                if (max <= temp) {
                    max = temp;
                }
            }
        }
        return max;
    }


        public static Integer findMin ( int[] intArray){
            int min = 0;
            if (intArray == null || intArray.length == 0) {
                return null;
            } else {
                int n = intArray.length;

                for (int i = 0; i < n; i++) {
                    int temp = intArray[i];
                    if (min >= temp) {
                        min = temp;
                    }
                }
            }
            return min;
        }
    }