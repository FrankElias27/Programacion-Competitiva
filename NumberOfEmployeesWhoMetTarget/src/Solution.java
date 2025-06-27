//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {

        int [] WorkHours = {1,2,3,4,5,4,3,2,1};
        int Tarjets=2;

        int result = numbersOfEmployeesWhoMetTarget(WorkHours,Tarjets);

        System.out.println(result);

    }

    public static int  numbersOfEmployeesWhoMetTarget(int [] hours, int target){

        int contador =0;

        for (int i=0; i<hours.length;i++){

            if(hours[i]>=target){
                contador++;
            }

        }
        return contador;

    }
}