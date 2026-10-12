package Int;
public class reverse_num {
    public static void main(String[] args) {
        
        int n=123;
        int reverse=0;

        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n = n / 10;   // حذف آخر رقم
            System.out.println(reverse);
        }

        System.out.println(reverse);
    }
    
}
