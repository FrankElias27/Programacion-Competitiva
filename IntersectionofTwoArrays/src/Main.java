import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums1 ={1,2,2,1};
        int[] nums2 ={2,2};

        int[] result = intersection(nums1,nums2);

        System.out.println(Arrays.toString(result));

        }


    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        int[] answer = new int[intersection.size()];

        int counter = 0;

        for (Integer num : intersection) {
            answer[counter] = num;
            counter++;
        }

        return answer;
    }

}
