import java.util.Scanner;

public class Array15_2{

    public static void main(String args[]) {

        int[] numbers = {0, 5, 5, 0, 1, 9, 1, 1, 3, 8, 9, 0, 2};

        // نبدأ العد من النهاية لنضع الأرقام المختلفة هناك
        int count = numbers.length - 1;

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // 1. نقل جميع الأرقام التي لا تساوي age إلى نهاية المصفوفة
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != age) {
                numbers[count] = numbers[i];
                count--;
            }
        }

        // 2. ملء الأماكن المتبقية في بداية المصفوفة برقم age
        for (int j = 0; j <= count; j++) {
            numbers[j] = age;
        }

        // 3. طباعة المصفوفة كاملة بشكل طبيعي من البداية (0) للنهاية
        // (ستلاحظ أن رقم age أصبح في البداية تماماً في أعلى النتائج)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("/////////////////");

        // 4. طباعة الأماكن الأولى التي تم حشوها برقم age
        for (int i = 0; i <= count; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("/////////////////");

        // 5. طباعة العناصر المختلفة التي تم نقلها إلى النهاية
        for (int i = count + 1; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
