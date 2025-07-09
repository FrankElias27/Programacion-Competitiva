import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String example = "/home//foo/";

        String result = simplifyPath(example);

        System.out.println(result);
    }

    private static  String simplifyPath(String path){

        StringBuilder sb = new StringBuilder("/");
        Stack<String> stack = new Stack<>();

        for(String dir:path.split("/")){

            if(dir.equals("..")&& !stack.empty()){
                stack.pop();
            } else if (isValidFileName (dir)) {
                stack.push(dir);
            }

        }

        for(String dir: stack){
            sb.append(dir);
            sb.append("/");

        }

        if(sb.length()>1){
            return sb.deleteCharAt(sb.length()-1).toString();
        }
        return sb.toString();

    }

    private static  boolean isValidFileName(String dir){
        return !dir.equals("") && !dir.equals(".") && !dir.equals("..");
    }

}
