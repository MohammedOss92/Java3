
public class Array2D1 {

    public static void main(String[] args) {

        // إنشاء مصفوفة ثنائية الأبعاد
        int[][] numbers = {
            {10, 20, 90},
            {1, 2, 3},
            {4, 5, 6}
        };

        // معرفة عدد الصفوف
        int rows = numbers.length;

        // معرفة عدد الأعمدة
        int cols = numbers[0].length;


        // =====================================
        // 1. أكبر وأصغر عنصر في كل صف
        // =====================================

        System.out.println("Max and Min in Each Row:");

        // المرور على جميع الصفوف
        for (int i = 0; i < rows; i++) {

            // افتراض أن أول عنصر في الصف هو الأكبر
            int max = numbers[i][0];

            // افتراض أن أول عنصر في الصف هو الأصغر
            int min = numbers[i][0];

            // مجموع الصف الحالي
            int sum = 0;

            // المرور على أعمدة الصف الحالي
            for (int j = 0; j < cols; j++) {

                // البحث عن أكبر عنصر
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }

                // البحث عن أصغر عنصر
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }

                // جمع عناصر الصف
                sum += numbers[i][j];
            }

            // طباعة أكبر عنصر في الصف
            System.out.println("Row " + (i + 1) + " Max = " + max);

            // طباعة أصغر عنصر في الصف
            System.out.println("Row " + (i + 1) + " Min = " + min);

            // طباعة مجموع الصف
            System.out.println("Row " + (i + 1) + " Sum = " + sum);

            System.out.println();
        }


        // =====================================
        // 2. أكبر وأصغر عنصر في كل عمود
        // =====================================

        System.out.println("Max and Min in Each Column:");

        // المرور على الأعمدة
        for (int j = 0; j < cols; j++) {

            // افتراض أن أول عنصر في العمود هو الأكبر
            int max = numbers[0][j];

            // افتراض أن أول عنصر في العمود هو الأصغر
            int min = numbers[0][j];

            // مجموع العمود الحالي
            int sum = 0;

            // المرور على صفوف العمود الحالي
            for (int i = 0; i < rows; i++) {

                // البحث عن أكبر عنصر في العمود
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }

                // البحث عن أصغر عنصر في العمود
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }

                // جمع عناصر العمود
                sum += numbers[i][j];
            }

            // طباعة أكبر عنصر في العمود
            System.out.println("Column " + (j + 1) + " Max = " + max);

            // طباعة أصغر عنصر في العمود
            System.out.println("Column " + (j + 1) + " Min = " + min);

            // طباعة مجموع العمود
            System.out.println("Column " + (j + 1) + " Sum = " + sum);

            System.out.println();
        }


        // =====================================
        // 3. أكبر وأصغر عنصر في المصفوفة كاملة
        // =====================================

        // افتراض أن أول عنصر هو الأكبر
        int globalMax = numbers[0][0];

        // افتراض أن أول عنصر هو الأصغر
        int globalMin = numbers[0][0];

        // مجموع جميع عناصر المصفوفة
        int totalSum = 0;

        // المرور على جميع الصفوف
        for (int i = 0; i < rows; i++) {

            // المرور على جميع الأعمدة
            for (int j = 0; j < cols; j++) {

                // البحث عن أكبر عنصر في المصفوفة
                if (numbers[i][j] > globalMax) {
                    globalMax = numbers[i][j];
                }

                // البحث عن أصغر عنصر في المصفوفة
                if (numbers[i][j] < globalMin) {
                    globalMin = numbers[i][j];
                }

                // حساب مجموع المصفوفة
                totalSum += numbers[i][j];
            }
        }

        // طباعة أكبر عنصر في المصفوفة
        System.out.println("Global Max = " + globalMax);

        // طباعة أصغر عنصر في المصفوفة
        System.out.println("Global Min = " + globalMin);

        // طباعة مجموع المصفوفة
        System.out.println("Total Sum = " + totalSum);


        // =====================================
        // 4. أكبر وأصغر مجموع صف
        // =====================================

        // نبدأ بأقل قيمة ممكنة حتى يكون أول مجموع أكبر منها
        int maxRowSum = Integer.MIN_VALUE;

        // نبدأ بأكبر قيمة ممكنة حتى يكون أول مجموع أصغر منها
        int minRowSum = Integer.MAX_VALUE;

        // رقم الصف صاحب أكبر مجموع
        int maxRow = 0;

        // رقم الصف صاحب أصغر مجموع
        int minRow = 0;

        // المرور على الصفوف
        for (int i = 0; i < rows; i++) {

            // تصفير المجموع عند بداية كل صف
            int sum = 0;

            // جمع عناصر الصف الحالي
            for (int j = 0; j < cols; j++) {
                sum += numbers[i][j];
            }

            // مقارنة مجموع الصف بأكبر مجموع سابق
            if (sum > maxRowSum) {

                // تحديث أكبر مجموع
                maxRowSum = sum;

                // حفظ رقم الصف
                maxRow = i + 1;
            }

            // مقارنة مجموع الصف بأصغر مجموع سابق
            if (sum < minRowSum) {

                // تحديث أصغر مجموع
                minRowSum = sum;

                // حفظ رقم الصف
                minRow = i + 1;
            }
        }

        // طباعة أكبر مجموع صف
        System.out.println("Max Row Sum = " + maxRowSum);

        // طباعة رقم الصف صاحب أكبر مجموع
        System.out.println("Max Row Number = " + maxRow);

        // طباعة أصغر مجموع صف
        System.out.println("Min Row Sum = " + minRowSum);

        // طباعة رقم الصف صاحب أصغر مجموع
        System.out.println("Min Row Number = " + minRow);


        // =====================================
        // 5. أكبر وأصغر مجموع عمود
        // =====================================

        // نبدأ بأقل قيمة ممكنة
        int maxColSum = Integer.MIN_VALUE;

        // نبدأ بأكبر قيمة ممكنة
        int minColSum = Integer.MAX_VALUE;

        // رقم العمود صاحب أكبر مجموع
        int maxCol = 0;

        // رقم العمود صاحب أصغر مجموع
        int minCol = 0;

        // المرور على الأعمدة
        for (int j = 0; j < cols; j++) {

            // تصفير المجموع عند بداية كل عمود
            int sum = 0;

            // المرور على صفوف العمود الحالي
            for (int i = 0; i < rows; i++) {
                sum += numbers[i][j];
            }

            // مقارنة مجموع العمود بأكبر مجموع سابق
            if (sum > maxColSum) {

                // تحديث أكبر مجموع عمود
                maxColSum = sum;

                // حفظ رقم العمود
                maxCol = j + 1;
            }

            // مقارنة مجموع العمود بأصغر مجموع سابق
            if (sum < minColSum) {

                // تحديث أصغر مجموع عمود
                minColSum = sum;

                // حفظ رقم العمود
                minCol = j + 1;
            }
        }

        // طباعة أكبر مجموع عمود
        System.out.println("Max Column Sum = " + maxColSum);

        // طباعة رقم العمود صاحب أكبر مجموع
        System.out.println("Max Column Number = " + maxCol);

        // طباعة أصغر مجموع عمود
        System.out.println("Min Column Sum = " + minColSum);

        // طباعة رقم العمود صاحب أصغر مجموع
        System.out.println("Min Column Number = " + minCol);

    }
}
