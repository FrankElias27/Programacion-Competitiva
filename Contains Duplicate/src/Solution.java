import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    /*
    Dada una matriz de enteros nums, devuelve truesi algún valor aparece al menos dos veces en la matriz y devuelve falsesi cada elemento es distinto.

        Ejemplo 1:

        Entrada: nums = [1,2,3,1]

        Salida: verdadero

        Explicación:

        El elemento 1 aparece en los índices 0 y 3.

        Ejemplo 2:

        Entrada: nums = [1,2,3,4]

        Salida: falso

        Explicación:

        Todos los elementos son distintos.

        Ejemplo 3:

        Entrada: nums = [1,1,1,3,3,4,3,2,4,2]

        Salida: verdadero



        Restricciones:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109
    */

    public static void main(String[] args) {

        int [] example={ 1,2,3,4,5,6,1};

        boolean result = ContainsDuplicate(example);

        System.out.println(result);

    }
    public static  boolean ContainsDuplicate( int[]nums){

        HashMap <Integer,Integer> map =new HashMap<>();

        for( int i=0; i<nums.length; i++){

            int numero = nums[i];

            if(map.containsKey(numero)){
                return  true;
            }

            map.put(nums[i],i );
        }
        return false;

    }
}