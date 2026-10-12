package Int;
public class Product_of_digits {
    public static void main(String[] args) {
        int n=456;
        int sum=1;
        while(n!=0){
            int digit= n%10;
            sum *=digit;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
