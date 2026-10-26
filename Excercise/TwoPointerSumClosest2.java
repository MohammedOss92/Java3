
public class TwoPointerSumClosest2 {

    public static void main(String[] args) {

        // مصفوفة مرتبة تصاعديًا
        int[] numbers = {2, 4, 6, 8, 10};

        // المجموع الذي نريد الاقتراب منه
        int target = 13;

        // المؤشر الأيسر يبدأ عند أول عنصر
        int left = 0;

        // المؤشر الأيمن يبدأ عند آخر عنصر
        int right = numbers.length - 1;

        // أصغر فرق وجدناه حتى الآن
        // نبدأ بقيمة كبيرة جدًا
        int bestDiff = Integer.MAX_VALUE;

        // تخزين العنصر الأيسر لكل زوج
        int[] bestLeft = new int[numbers.length];

        // تخزين العنصر الأيمن لكل زوج
        int[] bestRight = new int[numbers.length];

        // تخزين مجموع كل زوج
        int[] bestSums = new int[numbers.length];

        // عدد الأزواج التي احتفظنا بها
        int count = 0;

        // نبحث ما دام لدينا عنصران مختلفان
        while (left < right) {

            // حساب مجموع العنصرين الحاليين
            int sum = numbers[left] + numbers[right];

            // حساب الفرق المطلق بين المجموع والهدف
            int diff = Math.abs(sum - target);

            // إذا وجدنا فرقًا أفضل من السابق
            if (diff < bestDiff) {

                // تحديث أفضل فرق
                bestDiff = diff;

                // حذف النتائج القديمة منطقيًا
                // نبدأ تخزين الأزواج الجديدة من الفهرس صفر
                count = 0;
            }

            // إذا كان الفرق مساويًا لأفضل فرق
            // نحتفظ بالزوج ومجموعه
            if (diff == bestDiff) {

                // حفظ العنصر الأيسر للزوج
                bestLeft[count] = numbers[left];

                // حفظ العنصر الأيمن للزوج
                bestRight[count] = numbers[right];

                // حفظ مجموع الزوج
                bestSums[count] = sum;

                // زيادة عدد الأزواج المحفوظة
                count++;
            }

            // إذا وصلنا إلى الهدف تمامًا، فالفرق صفر
            // لا يمكن إيجاد فرق أفضل من صفر
            if (sum == target) {
                break;
            }

            // إذا كان المجموع أقل من الهدف
            // نحرك المؤشر الأيسر لليمين لزيادة المجموع
            else if (sum < target) {
                left++;
            }

            // إذا كان المجموع أكبر من الهدف
            // نحرك المؤشر الأيمن لليسار لتقليل المجموع
            else {
                right--;
            }
        }

        // طباعة أفضل فرق وجدناه
        System.out.println("Best Difference = " + bestDiff);

        // طباعة جميع الأزواج التي تحقق أفضل فرق
        System.out.println("Best pairs:");

        for (int i = 0; i < count; i++) {

            // طباعة الزوج ومجموعه والفرق عن الهدف
            System.out.println(
                bestLeft[i] + " + " + bestRight[i]
                + " = " + bestSums[i]
                + ", Difference = "
                + Math.abs(bestSums[i] - target)
            );
        }
    }
}
