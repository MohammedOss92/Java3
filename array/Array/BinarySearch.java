
public class BinarySearch{

    public static void main(String args[]){


     

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int target = 4;

        int low = 0;
        int high = numbers.length - 1;

        System.out.println("Target = " + target);
        System.out.println("Initial low = " + low);
        System.out.println("Initial high = " + high);
        System.out.println("--------------------");

        while (low <= high) {

            System.out.println("Start of loop");
            System.out.println("low = " + low);
            System.out.println("high = " + high);

            int mid = (low + high) / 2;

            System.out.println("mid = " + mid);
            System.out.println("numbers[mid] = " + numbers[mid]);

            if (numbers[mid] == target) {

                System.out.println("Target found!");
                System.out.println("Found at index: " + mid);
                System.out.println("Found value: " + numbers[mid]);

                break;

            } else if (numbers[mid] < target) {

                System.out.println(numbers[mid] + " < " + target);
                System.out.println("Search right");

                low = mid + 1;

                System.out.println("New low = " + low);

            } else {

                System.out.println(numbers[mid] + " > " + target);
                System.out.println("Search left");

                high = mid - 1;

                System.out.println("New high = " + high);
            }

            System.out.println("--------------------");
        }

        System.out.println("Loop finished");
    }
}

/*عندما تكون قيمة المنتصف أصغر من الهدف.
مثال: قيمة المنتصف 2 والهدف 4. نبحث يمينًا لأن 2 < 4.
نبحث يسارًا
عندما تكون قيمة المنتصف أكبر من الهدف.
مثال: قيمة المنتصف 5 والهدف 4. نبحث يسارًا لأن 5 > 4.*/

/*نعم، فهمك صحيح جدًا! 👍 بقيت نقطة واحدة مهمة وهي كيف نتعامل مع mid.
إذا كان target أصغر من numbers[mid]، نذهب يسارًا.
إذا كان target أكبر من numbers[mid]، نذهب يمينًا.
نعم، نحدّث low أو high حسب الاتجاه.
أما mid، فنحسبه من جديد بعد تحديث الحدود.*/