package Int;
public class Count_even_and_odd_digits {
    public static void main(String[] args) {
        int n=123456;
           int even=0; 
           int sumE=0;
           int digit=0;
        while(n!=0){
         digit =n%10;
            if(digit %2==0){
                sumE=sumE+digit;
               even++; 
            }
            n=n/10;
        }
        System.out.println(even);
        System.out.println(sumE);
    }
}
