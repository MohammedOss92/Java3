package Int;
public class sumOfDigit {
        public static void main(String[] args) {
        

       int n=123;
       int sum =0;
       while(n!=0){
        int digit=n%10;
        sum+=digit;
        n = n / 10;
       }
System.out.println(sum);
    }
}


// | الزر        | الوظيفة         |
// | ----------- | --------------- |
// | F10         | خطوة للأمام     |
// | F11         | دخول داخل الكود |
// | Shift + F11 | خروج            |
// | F5          | متابعة          |

