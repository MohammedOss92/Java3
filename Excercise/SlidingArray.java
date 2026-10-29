
public class SlidingArray {

    public static void main(String[] args) {

        // مصفوفة الأرقام التي نريد البحث فيها
        int[] numbers = {2, 1, 5, 1, 3, 2};

        // حجم النافذة: نريد جمع 3 أرقام متجاورة في كل مرة
        int k = 3;

        // حساب مجموع أول نافذة: أول 3 أرقام
        // 2 + 1 + 5 = 8
        int windowSum = numbers[0] + numbers[1] + numbers[2];

        // نفترض أن مجموع أول نافذة هو أكبر مجموع حتى الآن
        int maxSum = windowSum;

        // نبدأ من i = k، أي i = 3
        // لأن أول 3 أرقام حسبنا مجموعها بالفعل
        for (int i = k; i < numbers.length; i++) {

            // numbers[i - k] هو الرقم الذي سيخرج من النافذة
            // numbers[i] هو الرقم الجديد الذي سيدخل النافذة
            // نطبع المعادلة قبل تحديث مجموع النافذة
            System.out.println(
                windowSum + " - " + numbers[i - k] +
                " + " + numbers[i] + " = " +
                (windowSum - numbers[i - k] + numbers[i])
            );

            // نحذف قيمة الرقم الخارج من المجموع
            // ثم نضيف قيمة الرقم الجديد الداخل
            windowSum = windowSum - numbers[i - k] + numbers[i];

            // إذا أصبح مجموع النافذة أكبر من أكبر مجموع سابق
            // نحدّث maxSum
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }

            // نطبع رقم الدورة ومجموع النافذة وأكبر مجموع
            System.out.println(
                "i = " + i +
                " | windowSum = " + windowSum +
                " | maxSum = " + maxSum
            );
        }

        // طباعة أكبر مجموع وصلنا إليه
        System.out.println("Maximum Sum = " + maxSum);
    }
}
