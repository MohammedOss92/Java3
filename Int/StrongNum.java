package Int;
public class StrongNum {
    public static void main(String[] args) {
int n = 145;
int temp = n;
int sum = 0;

while(temp != 0){
    int digit = temp % 10;

    int fac = 1;
    for(int i = 1; i <= digit; i++){
        fac *= i;
    }

    sum += fac;

    temp = temp / 10;
}
if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
        System.out.println(sum);

}
    
}
// | النوع     | العملية          |
// | --------- | ---------------- |
// | Armstrong | power (^ digits) |
// | Strong    | factorial (!)    |
