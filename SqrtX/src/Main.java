//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int example1 = 4;
        int result = mySqrt(example1);
        System.out.println(result);
    }

    private static int mySqrt(int x){
        int left =1;
        int right = x;
        int answer =0;
        int m =0;

        while (left<= right){
            m= (right-left)/2 + left;

            if(x/m == m){

                return m;

            } else if (x/m < m) {

                right=m-1;

            }else {

                left=m-1;
                answer=m;
            }
        }
        return answer;
    }
}