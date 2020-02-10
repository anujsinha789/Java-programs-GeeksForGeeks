import java.util.*;

public class codeforces{
    static boolean haveWhiteSpace(String str){
        int i = 0,space = 0;
         for(i = 0 ; i < str.length() ;++i){
             if(str.charAt(i) != ' ')
               ++space;
         }
        if(space != 0) return false;
        else
            return true;
    }
    public static void main(String args[]){
        String test;
        Scanner input = new Scanner(System.in);
        test = input.nextLine();
        if(haveWhiteSpace(test)){
            System.out.print("The string contains only whitespaces ! \n");
        }
        else{
            System.out.print("The string contains characters other than whitespaces! \n");
        }
    }
}
