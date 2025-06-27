//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {

        int [] example ={ 0,0,1,1,2,2,3,3};

        int result = removeDuplicates(example);

        System.out.println(result);

    }

    public static int removeDuplicates(int[] nums){
        int n= nums.length;

        if(n==1){
            return 1;
        }

        int left = 1;

        for(int right =1; right<n; right++){
            int currentElement = nums[right];
            int previusElement = nums[right-1];

            if(!areEqual(currentElement,previusElement)){
                nums[left] = nums[right];
                left++;

            }

        }
        return left;
    }

    private static boolean areEqual(int currentElement, int previusElement) {
        return currentElement == previusElement;
    }

}