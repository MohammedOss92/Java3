import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("أدخل رقمًا لتحليله إلى عوامله الأولية: ");
        int n = scanner.nextInt();
        
        int i = 2;

        if (n <= 1) {
            System.out.println("الرقم أصغر من أو يساوي 1، ليس له عوامل أولية.");
        } else {
            System.out.println("العوامل الأولية للرقم " + n + " هي:");
            while (n > 1) {
                if (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                } else {
                    i++;
                }
            }
        }
        
        scanner.close();
    }
}
