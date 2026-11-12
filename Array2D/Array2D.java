public class Array2D {

    public static void main(String[] args) {

      /*  int[][] numbers = {
            {10, 20, 30},
            {1, 50, 2},
            {70, 80, 90}
        };*/
        int[][] numbers = {
    {10, 20, 90},
    {1, 2, 3},
    {4, 5, 6}
};

//int max = numbers[0][0];
        // عدد الصفوف
        int a = numbers.length;

        // عدد الأعمدة
        int b = numbers[0].length;

        System.out.println("Rows: " + a);
        System.out.println("Columns: " + b);

        // المرور على الصفوف
        for (int i = 0; i < numbers.length; i++) {
int max = numbers[i][0];
            // مجموع الصف الحالي
            int sum = 0;
//int max = numbers[i][0];
            // المرور على أعمدة الصف
            for (int j = 0; j < numbers[i].length; j++) {

                // طباعة العنصر
                System.out.print(numbers[i][j] + " ");

                // جمع العناصر
                sum = sum + numbers[i][j];
                if (numbers[i][j] > max){
                    max = numbers[i][j];
                }
            }

            // الانتقال إلى سطر جديد بعد انتهاء الصف
            System.out.println();

            // طباعة مجموع الصف
            System.out.println("Sum of row " + (i + 1) + " = " + sum);

            System.out.println();
            System.out.println(max);
        }
        
    }
}

/*
قبل الحلقة الخارجية: متغير واحد يحتفظ بنتيجة جميع الصفوف.
داخل الحلقة الخارجية: متغير جديد لكل صف.
داخل الحلقة الداخلية: متغير يُعاد إنشاؤه لكل عنصر (إذا عرّفناه هناك).*/
