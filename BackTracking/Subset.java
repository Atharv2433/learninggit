import java.util.Scanner;

public class Subset {


    public static void fun(int ind ,StringBuilder ans, String s){
        if(ind == s.length()){
            System.out.println(ans);
            return ;
        }

        
        fun(ind + 1, ans.append(s.charAt(ind)), s);
        ans.deleteCharAt(ans.length() - 1);
        fun(ind + 1,  ans, s);

    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String s = "abc";

        StringBuilder sb = new StringBuilder();
        fun(0,sb,s);
        
    }
}