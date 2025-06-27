//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] precios= {7,1,5,3,6,4};

        int resultado = maxProfit(precios);

        System.out.println(resultado);

    }

    public static int maxProfit(int[]prices){
        int maxProfit=0;
        int buyDay=0;

        for(int sellDay =1;sellDay<prices.length;sellDay++){
            if(prices[sellDay]<prices[buyDay]){
                buyDay = sellDay;
            }
            else {
                int profit = prices[sellDay]-prices[buyDay];
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}