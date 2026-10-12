
public class Length4{

    


    public static void main(String[] args) {

        int[] num = {10, 40, 20, 50};

        System.out.println("=== 1. معلومات المصفوفة ===");

        System.out.println("عدد العناصر num.length = " + num.length);
        System.out.println("آخر فهرس num.length - 1 = " + (num.length - 1));
        System.out.println("عدد العناصر + 1 = " + (num.length + 1));
        System.out.println("أول عنصر num[0] = " + num[0]);
        System.out.println("آخر عنصر = " + num[num.length - 1]);

        System.out.println("-----");


        System.out.println("=== 2. طباعة جميع العناصر والفهارس ===");

        for (int i = 0; i < num.length; i++) {

            System.out.println("i = " + i);
            System.out.println("الفهرس الحالي = " + i);
            System.out.println("العنصر الحالي num[i] = " + num[i]);
            System.out.println("-----");
        }


        System.out.println("=== 3. العنصر الحالي والعنصر التالي ===");

        for (int i = 0; i < num.length - 1; i++) {

            System.out.println("i = " + i);
            System.out.println("الفهرس الحالي = " + i);
            System.out.println("فهرس العنصر التالي = " + (i + 1));

            System.out.println("العنصر الحالي = " + num[i]);
            System.out.println("العنصر التالي = " + num[i + 1]);

            System.out.println("-----");
        }


        System.out.println("=== 4. هل العنصر الحالي أصغر من التالي؟ ===");

        for (int i = 0; i < num.length - 1; i++) {

            System.out.println("i = " + i);

            System.out.println("العنصر الحالي = " + num[i]);
            System.out.println("العنصر التالي = " + num[i + 1]);

            System.out.println(
                "عملية المقارنة: " + num[i] + " < " + num[i + 1]
            );

            if (num[i] < num[i + 1]) {

                System.out.println("النتيجة: TRUE");
                System.out.println("العنصر الحالي أصغر من التالي");

            } else {

                System.out.println("النتيجة: FALSE");
                System.out.println("العنصر الحالي ليس أصغر من التالي");
            }

            System.out.println("-----");
        }


        System.out.println("=== 5. هل العنصر الحالي أكبر من التالي؟ ===");

        for (int i = 0; i < num.length - 1; i++) {

            System.out.println("i = " + i);

            System.out.println("العنصر الحالي = " + num[i]);
            System.out.println("العنصر التالي = " + num[i + 1]);

            System.out.println(
                "عملية المقارنة: " + num[i] + " > " + num[i + 1]
            );

            if (num[i] > num[i + 1]) {

                System.out.println("النتيجة: TRUE");
                System.out.println("العنصر الحالي أكبر من التالي");

            } else {

                System.out.println("النتيجة: FALSE");
                System.out.println("العنصر الحالي ليس أكبر من التالي");
            }

            System.out.println("-----");
        }


        System.out.println("=== 6. مقارنة باستخدام j ===");

        for (int j = 0; j < num.length - 1; j++) {

            System.out.println("j = " + j);
            System.out.println("العنصر num[j] = " + num[j]);
            System.out.println("العنصر التالي num[j + 1] = " + num[j + 1]);

            if (num[j] < num[j + 1]) {

                System.out.println(
                    num[j] + " أصغر من " + num[j + 1]
                );

            } else if (num[j] > num[j + 1]) {

                System.out.println(
                    num[j] + " أكبر من " + num[j + 1]
                );

            } else {

                System.out.println("العنصران متساويان");
            }

            System.out.println("-----");
        }


        System.out.println("=== 7. مقارنة باستخدام i و j ===");

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                System.out.println("i = " + i);
                System.out.println("j = " + j);

                System.out.println("العنصر الأول num[i] = " + num[i]);
                System.out.println("العنصر الثاني num[j] = " + num[j]);

                if (num[i] < num[j]) {

                    System.out.println(
                        num[i] + " أصغر من " + num[j]
                    );

                } else if (num[i] > num[j]) {

                    System.out.println(
                        num[i] + " أكبر من " + num[j]
                    );

                } else {

                    System.out.println("العنصران متساويان");
                }

                System.out.println("-----");
            }
        }


        System.out.println("=== 8. الطباعة من النهاية إلى البداية ===");

        for (int i = num.length - 1; i >= 0; i--) {

            System.out.println("i = " + i);
            System.out.println("العنصر الحالي = " + num[i]);
            System.out.println("-----");
        }


        System.out.println("=== 9. الوصول إلى آخر عنصر ===");

        System.out.println("num.length = " + num.length);
        System.out.println("num.length - 1 = " + (num.length - 1));
        System.out.println(
            "num[num.length - 1] = " + num[num.length - 1]
        );

        System.out.println("-----");


        System.out.println("=== 10. البحث عن رقم ===");

        int target = 20;

        for (int i = 0; i < num.length; i++) {

            System.out.println("i = " + i);
            System.out.println("العنصر الحالي = " + num[i]);
            System.out.println("الرقم المطلوب = " + target);

            if (num[i] == target) {

                System.out.println("وجدنا الرقم!");
                System.out.println("الفهرس الذي وجدناه فيه = " + i);

            } else {

                System.out.println("هذا ليس الرقم المطلوب");
            }

            System.out.println("-----");
        }
    }
}
