
public class Length3{

    


    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50};

        // 1: عدد العناصر
        System.out.println(num.length);             // 5

        // 2: عدد العناصر ناقص واحد
        System.out.println(num.length - 1);         // 4

        // 3: عدد العناصر زائد واحد
        System.out.println(num.length + 1);         // 6

        // 4: أول عنصر
        System.out.println(num[0]);                 // 10

        // 5: ثاني عنصر
        System.out.println(num[1]);                 // 20

        // 6: آخر عنصر
        System.out.println(num[num.length - 1]);    // 50

        // 7: العنصر قبل الأخير
        System.out.println(num[num.length - 2]);    // 40

        // 8: العنصر الثالث
        System.out.println(num[2]);                 // 30

        // 9: طباعة أول فهرس
        System.out.println(0);                      // 0

        // 10: طباعة آخر فهرس
        System.out.println(num.length - 1);         // 4

        // 11: طباعة أول عنصر باستخدام length
        System.out.println(num[num.length - 5]);    // 10

        // 12: طباعة ثاني عنصر من النهاية
        System.out.println(num[num.length - 2]);    // 40

        // 13: طباعة جميع العناصر
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // 14: طباعة جميع العناصر عدا الأخير
        for (int i = 0; i < num.length - 1; i++) {
            System.out.println(num[i]);
        }

        // 15: طباعة آخر عنصر مرة واحدة
        System.out.println(num[num.length - 1]);

        // 16: طباعة آخر عنصر خمس مرات
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[num.length - 1]);
        }

        // 17: طباعة الرقم 4 خمس مرات
        for (int i = 0; i < num.length; i++) {
            System.out.println(num.length - 1);
        }

        // 18: الطباعة من النهاية إلى البداية
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        // 19: الطباعة من البداية إلى النهاية
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // 20: الطباعة باستخدام i + 1
        for (int i = 0; i < num.length - 1; i++) {
            System.out.println(num[i + 1]);
        }

        // 21: مقارنة العنصر الحالي بالذي يليه
        for (int j = 0; j < num.length - 1; j++) {
            System.out.println(num[j] + " مقابل " + num[j + 1]);
        }

        // 22: مقارنة عنصرين باستخدام if
        for (int j = 0; j < num.length - 1; j++) {
            if (num[j] < num[j + 1]) {
                System.out.println("العنصر الحالي أصغر");
            }
        }

        // 23: مقارنة عنصرين باستخدام i
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                System.out.println("الحالي أكبر من التالي");
            }
        }

        // 24: مقارنة أول عنصر بآخر عنصر
        if (num[0] < num[num.length - 1]) {
            System.out.println("الأول أصغر من الأخير");
        }

        // 25: التحقق من وجود الرقم 30
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 30) {
                System.out.println("وجدنا الرقم 30");
            }
        }

        // 26: استخدام i و j لمقارنة جميع الأزواج
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    System.out.println(
                        num[i] + " أصغر من " + num[j]
                    );
                }
            }
        }

    }
}