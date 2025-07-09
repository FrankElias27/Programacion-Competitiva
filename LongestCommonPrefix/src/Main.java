//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] case1 ={"flower","flow","flight"};

        String result = longestCommonPrefix(case1);

        System.out.println(result);

        }


    private static String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return  strs[0];
        }

        int p=0;
        String fs = strs[0];
        String ls= strs[strs.length-1];

        while(isWithinStrBounds(p,fs,ls)){

            if(fs.charAt(p) != ls.charAt(p)){
                break;
            }

            p++;

        }

        return fs.substring(0,p);



    }

    private static boolean isWithinStrBounds(int p,String fs, String ls){
        return p< fs.length() && p<ls.length();
    }
}