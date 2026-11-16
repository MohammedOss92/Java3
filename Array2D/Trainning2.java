
public class Trainning2 {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 20, 30, 40},
            {50, 60, 70, 80, 90},
            {100, 110},
            {120, 130, 140}
        };

        // =====================================
        // 1. عدد الصفوف وأكبر عدد أعمدة
        // =====================================

        // عدد الصفوف
        int rows = numbers.length;

        System.out.println("Rows = " + rows);

        // أكبر عدد أعمدة في أي صف
        int maxCols = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i].length > maxCols) {
                maxCols = numbers[i].length;
            }
        }

        System.out.println("Maximum Columns = " + maxCols);


        // =====================================
        // 2. أكبر وأصغر عنصر في المصفوفة كلها
        // =====================================

        // نبدأ بأول عنصر في المصفوفة
        int globalMax = numbers[0][0];
        int globalMin = numbers[0][0];


        // =====================================
        // 3. طباعة الصفوف وحساب المطلوبات
        // =====================================

        // أكبر وأصغر مجموع صف
        int maxRowSum = Integer.MIN_VALUE;
        int minRowSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            // عدد العناصر في الصف الحالي
            int cols = numbers[i].length;

            // أكبر وأصغر عنصر في الصف الحالي
            int max = numbers[i][0];
            int min = numbers[i][0];

            // مجموع عناصر الصف
            int sum = 0;

            System.out.println("\nRow " + (i + 1)
                    + " = " + cols + " elements");

            // المرور على عناصر الصف
            for (int j = 0; j < numbers[i].length; j++) {

                // طباعة العنصر
                System.out.print(numbers[i][j] + " ");

                // حساب مجموع الصف
                sum += numbers[i][j];

                // أكبر عنصر في الصف
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }

                // أصغر عنصر في الصف
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }

                // أكبر عنصر في المصفوفة كلها
                if (numbers[i][j] > globalMax) {
                    globalMax = numbers[i][j];
                }

                // أصغر عنصر في المصفوفة كلها
                if (numbers[i][j] < globalMin) {
                    globalMin = numbers[i][j];
                }
            }

            // طباعة نتائج الصف
            System.out.println("\nMax = " + max);
            System.out.println("Min = " + min);
            System.out.println("Sum = " + sum);

            // أكبر مجموع صف
            if (sum > maxRowSum) {
                maxRowSum = sum;
            }

            // أصغر مجموع صف
            if (sum < minRowSum) {
                minRowSum = sum;
            }
        }


        // =====================================
        // 4. طباعة الأعمدة وحساب المطلوبات
        // =====================================

        // أكبر وأصغر مجموع عمود
        int maxColumnSum = Integer.MIN_VALUE;
        int minColumnSum = Integer.MAX_VALUE;

        for (int i = 0; i < maxCols; i++) {

            // نبحث عن أول صف يحتوي على العمود الحالي
            int firstRow = 0;

            while (i >= numbers[firstRow].length) {
                firstRow++;
            }

            // أول عنصر موجود في هذا العمود
            int max = numbers[firstRow][i];
            int min = numbers[firstRow][i];

            // مجموع عناصر العمود
            int sum = 0;

            // عدد العناصر في العمود
            int count = 0;

            System.out.print("\nColumn " + (i + 1) + ": ");

            // نبدأ من أول صف يحتوي على العمود
            for (int j = firstRow; j < numbers.length; j++) {

                // التأكد من وجود العمود في الصف الحالي
                if (i < numbers[j].length) {

                    int value = numbers[j][i];

                    // طباعة العنصر
                    System.out.print(value + " ");

                    // حساب مجموع العمود
                    sum += value;

                    // حساب عدد العناصر
                    count++;

                    // أكبر عنصر في العمود
                    if (value > max) {
                        max = value;
                    }

                    // أصغر عنصر في العمود
                    if (value < min) {
                        min = value;
                    }
                }
            }

            // طباعة نتائج العمود
            System.out.println("\nCount = " + count);
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
            System.out.println("Sum = " + sum);

            // أكبر مجموع عمود
            if (sum > maxColumnSum) {
                maxColumnSum = sum;
            }

            // أصغر مجموع عمود
            if (sum < minColumnSum) {
                minColumnSum = sum;
            }
        }


        // =====================================
        // 5. النتائج النهائية للمصفوفة
        // =====================================

        System.out.println("\n========================");

        System.out.println("Global Max = " + globalMax);
        System.out.println("Global Min = " + globalMin);

        System.out.println("Maximum Row Sum = " + maxRowSum);
        System.out.println("Minimum Row Sum = " + minRowSum);

        System.out.println("Maximum Column Sum = " + maxColumnSum);
        System.out.println("Minimum Column Sum = " + minColumnSum);

        System.out.println("========================");
    }
}
