import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int x=2121;
        boolean result = isPalindrome(x);
        System.out.println(result);

    }

    public static  boolean isPalindrome(int x){

      int[] digits = new int[getNumbersOfDigits(x)];
      digits = getNumbers(x,digits.length);

      int left =0;
      int right = digits.length-1;

      while(left <right){
          if(digits[left]!= digits[right]){
              return false;
          }
          left++;
          right--;
      }
      
        return  true;
    }

    private static int[] getNumbers(int x,int n) {
        int[] result = new int [n];
        int counter=0;
        while(x>0){
            int res = x % 10;
            x /=10;
            result[counter] = res;
            counter++;
        }
        return result;
    }

    private static int getNumbersOfDigits(int x) {
        //int counterOfDigits =0;
        //while(x>0){
          //  x/=10;
            //counterOfDigits++;
        //}
        //return  counterOfDigits;

        int digitos = (int)Math.floor(Math.log10(x)) + 1;
        return digitos;
    }
}