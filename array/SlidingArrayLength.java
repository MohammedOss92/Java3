public class SlidingArrayLength {

    public static void main(String args[]) {

        int[] numbers = {1, 2, 1, 1, 3, 2, 1};

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < numbers.length; right++) {

            sum += numbers[right];

            while (sum > 5) {
                sum -= numbers[left];
                left++;
            }

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }

            System.out.println(
                "right = " + right +
                " | left = " + left +
                " | sum = " + sum +
                " | length = " + length +
                " | maxLength = " + maxLength
            );
        }

        System.out.println("Final Max Length = " + maxLength);
    }
}

/*public class SlidingWindowMinLength {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 2, 4, 3};

        int left = 0;
        int sum = 0;
        int minLength = numbers.length + 1;

        for (int right = 0; right < numbers.length; right++) {

            sum += numbers[right];

            while (sum >= 7) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum -= numbers[left];
                left++;
            }

            System.out.println(
                "right = " + right +
                " | left = " + left +
                " | sum = " + sum +
                " | minLength = " + minLength
            );
        }

        System.out.println("Final Min Length = " + minLength);
    }
}*/
/*
 * ### اختبار مراجعة Sliding Window 💻

هذا اختبار قصير لمراجعة ما تعلمته. حاول حل الأسئلة بنفسك قبل الاطلاع على مفتاح الإجابة.

### السؤال الأول: تتبّع النافذة

لدينا:

```java
int[] numbers = {2, 1, 3, 2, 1};
int k = 3;
```

نريد إيجاد أكبر مجموع لنافذة حجمها `3`.

* ما مجموع أول نافذة؟

* ما مجموع النافذة الثانية؟

* ما أكبر مجموع `maxSum`؟

### السؤال الثاني: Variable Size

لدينا:

```java
int[] numbers = {1, 2, 1, 1, 3, 2, 1};
int limit = 5;
```

نريد إيجاد أطول نافذة مجموعها ≤ 5.

* ما شرط `while`؟

* هل نحسب `length` قبل تقليص النافذة أم بعده؟

* ما قيمة `maxLength` النهائية؟

### السؤال الثالث: أقصر نافذة

لدينا:

```java
int[] numbers = {2, 3, 1, 2, 4, 3};
int limit = 7;
```

نريد إيجاد أقصر نافذة مجموعها ≥ 7.

اكتب الجزء الناقص:

```java
while (__________) {

    int length = right - left + 1;

    if (__________) {
        minLength = length;
    }

    sum -= numbers[left];
    left++;
}
```

ملاحظة: مسائل Sliding Window المعتمدة على مجموع النافذة تفترض أن عناصر المصفوفة غير سالبة.

### مفتاح الإجابة

حاول أولًا، ثم افتح الإجابات عند الحاجة.

عرض الإجابات
*/
 */