import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Problema: Two Sum II - Input Array Is Sorted
         *
         * Descripción:
         * Dado un arreglo de enteros 'numbers' indexado desde 1 (1-based index), que ya está
         * ordenado en orden no decreciente, encuentra dos números tales que su suma sea igual
         * a un valor objetivo (target).
         *
         * Debes devolver los índices de estos dos números (index1 y index2), sumando uno a cada índice,
         * como un arreglo de enteros [index1, index2].
         *
         * Reglas:
         * - 1 <= index1 < index2 <= numbers.length
         * - No se puede usar el mismo elemento dos veces.
         * - Se garantiza que existe exactamente una solución.
         * - Tu solución debe utilizar solo espacio adicional constante (O(1)).
         *
         * Ejemplos:
         *
         * Ejemplo 1:
         * Entrada: numbers = [2, 7, 11, 15], target = 9
         * Salida: [1, 2]
         * Explicación: La suma de 2 y 7 es 9. Sus índices (1-based) son 1 y 2.
         *
         * Ejemplo 2:
         * Entrada: numbers = [2, 3, 4], target = 6
         * Salida: [1, 3]
         * Explicación: La suma de 2 y 4 es 6.
         *
         * Ejemplo 3:
         * Entrada: numbers = [-1, 0], target = -1
         * Salida: [1, 2]
         * Explicación: La suma de -1 y 0 es -1.
         *
         * Restricciones:
         * - 2 <= numbers.length <= 3 * 10⁴
         * - -1000 <= numbers[i] <= 1000
         * - -1000 <= target <= 1000
         * - El arreglo está ordenado en orden no decreciente.
         * - Existe exactamente una solución.
         */

        int[] numbers ={2,7,11,15};
        int target = 9;

        Main main = new Main();

        int[] result = main.twoSum(numbers,target);

        System.out.println(Arrays.toString(result));




    }

    public int[] twoSum(int[] numbers,int target){
        int left=0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];

            if(sum>target){
                right--;
            } else if(sum<target){
                left++;
            } else {
                return new int[]{(left+1),(right+1)};
            }
        }
        return null;
    }
}