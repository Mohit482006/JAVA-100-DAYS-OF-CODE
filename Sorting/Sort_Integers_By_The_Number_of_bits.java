import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if (bitsA != bitsB) {
                return bitsA - bitsB;   // sort by number of 1s
            }
            return a - b;               // tie-break by value
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}

