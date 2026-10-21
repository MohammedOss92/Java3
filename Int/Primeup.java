package Int;
import java.util.Scanner;

public class Primeup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("أدخل الرقم النهائي لطباعة الأرقام الأولية قبله: ");
        int limit = scanner.nextInt();

        System.out.println("الأرقام الأولية من 2 إلى " + limit + " هي:");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true; // نفترض أنه أولي مبدئياً

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // وجدنا قاسماً، إذن ليس أوليًا
                    break;           // اخرج من الحلقة الداخلية
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
