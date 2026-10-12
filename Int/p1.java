package Int;
public class p1 {
    public static void main(String[] args) {
        int n=123;
        int reverse=0;
        int original=n;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
            System.out.println("digit = " + digit);
    System.out.println("reversed = " + reverse);
    System.out.println("n = " + n);
    System.out.println("--------------");
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
            System.out.println("reversed = " + reverse);

    }
}
