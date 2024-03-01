package Task5;

import java.util.Arrays;

public class MaxQuantitySumK {
    public static void main(String[] args) {
        int[] array = {6, 2, 2, 3, 4, 1};
        int k = 8;

        int result = lenOfLongSubarr(array, k);
        System.out.println("k = " + k + ", result = " + result);
    }
    public static int lenOfLongSubarr(int[] array, int k) {
        Arrays.sort(array);
        int n = array.length;

        int sum = 0;
        int count = 0;


        for(int i = 0; i < n; i++) {

            sum = sum + array[i];

            if (sum > k)
            {
                break;
            }
            count++;
        }

        return count;
    }

}
