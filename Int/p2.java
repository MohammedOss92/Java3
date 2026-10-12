package Int;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
//         يقرأ سطرًا كاملاً من المستخدم.
// يخزنه في المتغير s.
        String s =in.nextLine();

        int i =0;
        int j= s.length()-1;
        int jj= s.length();
        System.out.println(j);
        System.out.println(jj);
            boolean isPalindrome = true;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPalindrome = false;
                break;
            
            }
            j--;
            i++;
        }
         if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        in.close();
    }
}
