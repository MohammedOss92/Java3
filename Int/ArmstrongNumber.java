package Int;
public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int temp = n;
        int sum = 0;

        // حساب عدد الخانات
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
System.out.println(temp);
        // إعادة القيمة الأصلية
        temp = n;

        // حساب القوة
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        // النتيجة
        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}