//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String example1 = "abc";
        String example2 = "pqr";

        String result = mergeAlternately(example1,example2);

        System.out.println(result);

    }

    private static String mergeAlternately(String word1, String word2){

        StringBuilder sb = new StringBuilder();

        int c=0;

        while(c<word1.length()|| c<word2.length()){

            if(c<word1.length()){
                sb.append(word1.charAt(c));
            }

            if(c<word2.length()){
                sb.append(word2.charAt(c));
            }

            c++;
        }
        return sb.toString();
    }
}