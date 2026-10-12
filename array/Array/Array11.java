
public class Array11{

    public static void main(String args[]){

        int[] numbers = {30, 10, 50, 20, 40};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int sum = max + min;

        // طباعة التفاصيل والنتيجة النهائية
        System.out.println("أكبر عنصر (Max): " + max);
        System.out.println("أصغر عنصر (Min): " + min);
        System.out.println("مجموع أكبر وأصغر عنصر: " + sum);
    }
}

    
