import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*
         * Problema: Two Sum
         *
         * Descripción:
         * Dado un arreglo de enteros 'nums' y un entero 'target', se deben devolver los índices
         * de los dos números que suman exactamente 'target'.
         *
         * Reglas:
         * - Cada entrada tiene exactamente una única solución.
         * - No se puede usar el mismo elemento dos veces.
         * - Se puede devolver la respuesta en cualquier orden.
         *
         * Ejemplos:
         * Entrada: nums = [2, 7, 11, 15], target = 9
         * Salida: [0, 1]
         * Explicación: nums[0] + nums[1] == 9, por lo tanto se retorna [0, 1].
         *
         * Entrada: nums = [3, 2, 4], target = 6
         * Salida: [1, 2]
         *
         * Entrada: nums = [3, 3], target = 6
         * Salida: [0, 1]
         *
         * Restricciones:
         * - 2 <= nums.length <= 10⁴
         * - -10⁹ <= nums[i] <= 10⁹
         * - -10⁹ <= target <= 10⁹
         * - Existe solo una respuesta válida.
         *
         * Desafío adicional:
         * ¿Puedes implementar un algoritmo con una complejidad de tiempo menor a O(n²)?
         */

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Main main = new Main();
        int[] result = main.twoSumconHashMap(nums, target);


        System.out.println(Arrays.toString(result));
    }

    //Respuesta con TimeComplexity O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int firstElement = nums[i];
                int secondElement = nums[j];
                int sum = firstElement + secondElement;

                if (sum == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    //Respuesta con TimeComplexity O(n)

    public int[] twoSumconHashMap(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; 1< nums.length;i++){
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};

            }
            map.put(nums[i],i);
        }

        return  null;
    }

}