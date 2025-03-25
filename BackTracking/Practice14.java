package BackTracking;

import java.util.Scanner;

public class Practice14 {


    public void fun(int ind , String s , StringBuilder sb){
        if(ind == s.length()){
            System.out.println(sb);
            return;
        }

        fun(ind + 1, s, sb.append(s.charAt(ind)));
        sb.deleteCharAt(sb.length() - 1);
        fun(ind + 1, s, sb);
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        Practice14 p = new Practice14();
        StringBuilder sb = new StringBuilder("");
        p.fun(0, s, sb);

    }
}
