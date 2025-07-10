import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String example1 = "anagram";
        String example2 = "nagaram";

        boolean result = isAnagram(example1,example2);

        System.out.println(result);

    }

    private static boolean isAnagram(String s,String t){
        Map<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }
        }

        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);

            } else {
                map.put(c,1);
            }
        }

        for(int v : map.values()){
            if(v !=0){
                return false;
            }
        }
        return true;

    }
}