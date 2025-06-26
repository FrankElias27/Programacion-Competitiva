import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {

    public static void main(String[] args) {

        String NumRomano = "IXX";

        int respuesta = romanToInt(NumRomano);

        System.out.println(respuesta);

    }

    public static int romanToInt(String s){
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int sum=0;

        for(int i=0; i<s.length(); i++){

            if(i == s.length()-1){
                sum += map.get(Character.toString(s.charAt(i)));
                break;
            }

            int actualDecimalValue = map.get(Character.toString(s.charAt(i)));
            int nextDecimalValue = map.get(Character.toString(s.charAt(i+1)));

            if(actualDecimalValue <nextDecimalValue){
                sum += (-actualDecimalValue);
            }else{
                sum += actualDecimalValue;

            }

        }
        return sum;

    }
}