
public class Array12{

    public static void main(String args[]){


        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        double avg;
        int count = 0;

        // 1. حساب المجموع
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 2. حساب المتوسط
        avg = (double) sum / numbers.length;

        // 3. حساب العناصر الأكبر من المتوسط
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > avg) {
                count++;
            }
        }
        int[] greaterNumbers = new int[count];

        // 5. تخزين القيم في المصفوفة الجديدة
        int index = 0; // مؤشر لتعبئة المصفوفة الجديدة بالترتيب
        int k = 0;
        for (k = 0; k < numbers.length; k++) {
            if (numbers[k] > avg) {
                greaterNumbers[index] = numbers[k]; // تخزين الرقم
                index++; // الانتقال للمكان التالي في المصفوفة الجديدة
            }
        }

        System.out.println("Average = " + avg);
        System.out.println("Count = " + count);
        for (k = 0; k < greaterNumbers.length; k++) {
        System.out.println( + greaterNumbers[k]);
}
    }
}

    
