package Task4;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};

        int[] result = findIntersection(nums1, nums2);

        System.out.print("result = [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
        public static int[] findIntersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> commonSet = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                if (set1.contains(num)) {
                    commonSet.add(num);
                }
            }
            int[] result = new int[commonSet.size()];
            int index = 0;
            for (int num : commonSet) {
                result[index++] = num;
            }

            return result;
        }
}
