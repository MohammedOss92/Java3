
public class Length2 {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50};

        // 1
        System.out.println(num.length);
        System.out.println("-----");

        // 2
        System.out.println(num.length - 1);
        System.out.println("-----");

        // 3
        System.out.println(num.length + 1);
        System.out.println("-----");

        // 4
        System.out.println(num[0]);
        System.out.println("-----");

        // 5
        System.out.println(num[1]);
        System.out.println("-----");

        // 6
        System.out.println(num[num.length - 1]);
        System.out.println("-----");

        // 7
        System.out.println(num[num.length - 2]);
        System.out.println("-----");

        // 8
        System.out.println(num[2]);
        System.out.println("-----");

        // 9
        System.out.println(0);
        System.out.println("-----");

        // 10
        System.out.println(num.length - 1);
        System.out.println("-----");

        // 11
        System.out.println(num[num.length - 5]);
        System.out.println("-----");

        // 12
        System.out.println(num[num.length - 2]);
        System.out.println("-----");

        // 13: جميع العناصر
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("-----");

        // 14: جميع العناصر عدا الأخير
        for (int i = 0; i < num.length - 1; i++) {
            System.out.println(num[i]);
        }
        System.out.println("-----");

        // 15: آخر عنصر مرة واحدة
        System.out.println(num[num.length - 1]);
        System.out.println("-----");

        // 16: آخر عنصر خمس مرات
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[num.length - 1]);
        }
        System.out.println("-----");

        // 17: الرقم 4 خمس مرات
        for (int i = 0; i < num.length; i++) {
            System.out.println(num.length - 1);
        }
        System.out.println("-----");

        // 18: من النهاية إلى البداية
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
        System.out.println("-----");

        // 19: من البداية إلى النهاية
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("-----");

        // 20: العنصر التالي باستخدام i + 1
        for (int i = 0; i < num.length - 1; i++) {
            System.out.println(num[i + 1]);
        }
        System.out.println("-----");

        // 21: مقارنة العنصر الحالي بالذي يليه
        for (int j = 0; j < num.length - 1; j++) {
            System.out.println(num[j] + " مقابل " + num[j + 1]);
        }
        System.out.println("-----");

        // 22: مقارنة باستخدام if
        for (int j = 0; j < num.length - 1; j++) {
            if (num[j] < num[j + 1]) {
                System.out.println("العنصر الحالي أصغر");
            }
        }
        System.out.println("-----");

        // 23: مقارنة باستخدام i
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                System.out.println("الحالي أكبر من التالي");
            }
        }
        System.out.println("-----");

        // 24: مقارنة أول عنصر بآخر عنصر
        if (num[0] < num[num.length - 1]) {
            System.out.println("الأول أصغر من الأخير");
        }
        System.out.println("-----");

        // 25: البحث عن الرقم 30
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 30) {
                System.out.println("وجدنا الرقم 30");
            }
        }
        System.out.println("-----");

        // 26: مقارنة كل عنصر بالعناصر التي بعده
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    System.out.println(
                        num[i] + " أصغر من " + num[j]
                    );
                }
            }
        }
        System.out.println("-----");
    }
}
