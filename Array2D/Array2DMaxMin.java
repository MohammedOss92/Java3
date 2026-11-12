public class Array2DMaxMin {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 90, 30},
            {50, 20, 80},
            {4, 70, 60}
        };

        // المرور على الأعمدة
        for (int j = 0; j < numbers[0].length; j++) {

            // افتراض أن أول عنصر في العمود هو الأكبر والأصغر
            int max = numbers[0][j];
            int min = numbers[0][j];

            // المرور على جميع الصفوف في العمود الحالي
            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }

                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }

            // الطباعة بعد الانتهاء من فحص العمود
            System.out.println("Column " + (j + 1));
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
            System.out.println("----------------");
        }
    }
}
//numbers[رقم الصف][رقم العمود]
/*
لنفهم السبب:
1. الحلقة الخارجية j
for (int j = 0; j < numbers[0].length; j++)
numbers[0].length تعني عدد الأعمدة.
إذن j يتحرك بين الأعمدة.
2. الحلقة الداخلية i
for (int i = 0; i < numbers.length; i++)
numbers.length تعني عدد الصفوف.
إذن i يتحرك بين الصفوف.*/
