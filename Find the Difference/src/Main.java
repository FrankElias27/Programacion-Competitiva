//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String exampleS ="abc";
        String exampleT ="abcd";

        char result = findTheDifference(exampleS,exampleT);
        System.out.println(result);

    }

    private static char findTheDifference(String s, String t){
        int sumS =0;
        int sumT =0;

        for(int i =0;i<t.length();i++){

            if(i<s.length()){
                sumS += (int) s.charAt(i);
            }

            sumT += (int) t.charAt(i);

        }

        return (char) (sumT -sumS);
    }
}