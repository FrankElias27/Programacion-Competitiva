import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] example1 ={1,2,3};
        int[] result = plusOne(example1);
        System.out.println(Arrays.toString(result));

    }

    private static int[] plusOne(int[] digits){

        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;

        }

        digits = new int[digits.length+1];
        digits[0] =1;
        return digits;
    }
}