
public class TwoPointerRepeat2 {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 5, 7};

        // المؤشر الأول يبدأ عند الفهرس 0
        int left = 0;

        // المؤشر الثاني يبدأ عند الفهرس 1
        int right = 1;

        // نفترض أنه لا يوجد تكرار في البداية
        boolean found = false;

        // نستمر ما دام right داخل حدود المصفوفة
        while (right < numbers.length) {

            // نقارن العنصرين اللذين يشير إليهما المؤشران
            if (numbers[left] == numbers[right]) {

                found = true;
                break;
            }

            // ننتقل إلى الزوج المتجاور التالي
            left++;
            right++;
        }

        // نطبع النتيجة بعد انتهاء الحلقة
        if (found) {
            System.out.println("Adjacent duplicate found");
        } else {
            System.out.println("No adjacent duplicates");
        }
    }
}
