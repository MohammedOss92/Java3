

public class TwoPointerSumClosest {

    public static void main(String[] args) {

        // إنشاء مصفوفة مرتبة تصاعديًا
        int[] numbers = {2, 4, 6, 8, 10};

        // المجموع الذي نريد الاقتراب منه
        int target = 13;

        // المؤشر الأيسر يبدأ عند أول عنصر
        int left = 0;

        // المؤشر الأيمن يبدأ عند آخر عنصر
        int right = numbers.length - 1;

        // حفظ أصغر فرق نجده، ونبدأ بقيمة كبيرة جدًا
        int bestDiff = Integer.MAX_VALUE;

        // حفظ المجموع الذي حقق أفضل فرق
        int bestSum = 0;

        // نستمر ما دام المؤشران يشيران إلى عنصرين مختلفين
        while (left < right) {

            // جمع العنصر الأيسر مع العنصر الأيمن
            int sum = numbers[left] + numbers[right];

            // طباعة الزوج الحالي ومجموعه لمتابعة خطوات الخوارزمية
            System.out.println(
                numbers[left] + " + " + numbers[right] + " = " + sum
            );

            // حساب الفرق المطلق بين المجموع والهدف
            int diff = Math.abs(sum - target);

            // إذا كان الفرق الحالي أصغر من أفضل فرق سابق
            if (diff <= bestDiff) {

                // تحديث أفضل فرق
                bestDiff = diff;

                // حفظ المجموع الذي حقق هذا الفرق
                bestSum = sum;
            }

            // إذا وصلنا إلى الهدف تمامًا، فالفرق يساوي صفرًا
            if (sum == target) {
                break; // الخروج من الحلقة
            }

            // إذا كان المجموع أصغر من الهدف، نحرك اليسار لزيادة المجموع
            else if (sum < target) {
                left++;
            }

            // إذا كان المجموع أكبر من الهدف، نحرك اليمين لتقليل المجموع
            else {
                right--;
            }
        }

        // طباعة أفضل مجموع تم العثور عليه
        System.out.println("Best Sum = " + bestSum);

        // طباعة أصغر فرق عن الهدف
        System.out.println("Best Difference = " + bestDiff);
    }
}
