package BackTracking;

import java.util.Scanner;

public class Practice8 {
    
    public static void calaculate(int ind , StringBuilder sb , String s){
        if(ind == s.length()){
            System.out.println(sb);
            return;
        }

        calaculate(ind + 1 , sb.append(s.charAt(ind)) , s);
        sb.deleteCharAt(sb.length() - 1);
        calaculate(ind + 1 , sb , s);
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        String s = "abc";

        StringBuilder sb = new StringBuilder();

        calaculate(0, sb, s);
    }
}
