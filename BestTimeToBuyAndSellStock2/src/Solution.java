//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {

        int [] example ={7,1,5,3,6,4};

        int result= maxProfit(example);

        System.out.println(result);

    }

    public static int maxProfit(int[]prices){
        if(prices.length==1){
            return 0;
        }
        int profit=0;

        for(int i=1; i< prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit += (prices[i] - prices[i-1]);
                //profit +=(prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}