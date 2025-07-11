//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    private static int strStr(String haystack, String needle){
        for(int  i=0; i<haystack.length()+1 - needle.length();i++){
            for(int j=0; j<needle.length();j++){

                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }

                if(j==needle.length()-1){
                    return i;
                }

            }

        }
        return -1;
    }

}