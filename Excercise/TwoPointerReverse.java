
public class TwoPointerReverse {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};

        // المؤشر الأول: يبدأ من اليسار
        int left = 0;

        // المؤشر الثاني: يبدأ من اليمين
        int right = numbers.length - 1;

        // نستمر ما دام المؤشر الأيسر قبل المؤشر الأيمن
        while (left < right) {

            // حفظ قيمة العنصر الأيسر مؤقتًا
            int temp = numbers[left];

            // وضع العنصر الأيمن مكان العنصر الأيسر
            numbers[left] = numbers[right];

            // وضع القيمة المحفوظة مكان العنصر الأيمن
            numbers[right] = temp;

            // تحريك المؤشر الأيسر إلى اليمين
            left++;

            // تحريك المؤشر الأيمن إلى اليسار
            right--;
        }

        // طباعة المصفوفة بعد عكسها
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
