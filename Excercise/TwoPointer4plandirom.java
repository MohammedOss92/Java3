
public class TwoPointer4plandirom {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String word = "aab";

        int left = 0;
        int right = word.length() - 1;
        boolean isplandirome = true;
        
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                isplandirome = false;
                break;
            }
            left++;
            right--;
        }
            if(isplandirome){
                System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
            }
        
        
    }
}