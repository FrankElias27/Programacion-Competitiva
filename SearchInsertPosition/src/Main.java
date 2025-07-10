//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] example={1,3,5,6};
        int target =5;

        int result = searchInsert(example,target);
        System.out.println(result);


    }

    private static int searchInsert (int[]nums, int target){
        int left=0;
        int right = nums.length-1;

        while(left<= right){
            int mid = (left+right) /2;

            if(target == nums[mid]){
                return mid;
            }

            if(target > nums[mid]){
                left = mid+1;
            }else {
                right=mid-1;
            }



        }
        return left;

    }

}