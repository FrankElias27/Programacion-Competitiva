//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String example = "Hello World";
        int result = lengthOfLastWord(example);
        System.out.println(result);

    }

    private static int lengthOfLastWord(String s){

        s=s.trim();
        String[] arr = s.split(" ");
        int lastElementIndex = arr.length-1;

        return arr[lastElementIndex].length();
    }
}