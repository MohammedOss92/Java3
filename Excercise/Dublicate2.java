
public class Dublicate2 {
    
    
public static void main(String[] args) {

    int[] nums = {10, 20, 30, 20, 40, 10, 50, 30, 30};

    for (int i = 0; i < nums.length; i++) {

        boolean foundBefore = false;
        boolean foundDuplicate = false;

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                foundDuplicate = true;
            }
        }

        for (int k = 0; k < i; k++) {
            if (nums[k] == nums[i]) {
                foundBefore = true;
            }
        }

        if (!foundBefore && foundDuplicate) {
            System.out.println(
                "Number: " + nums[i] + ", Index: " + i
            );
        }
    }
}

    
}
/*ممتاز، سنبدأ بالكود الأول فقط، وسنفهمه سطرًا سطرًا، ثم نتتبّع قيم المتغيرات يدويًا. لن ننتقل إلى الكود الثاني حتى تفهم الأول.

### الكود الأول: طباعة الرقم المكرر مرة واحدة مع أول `Index`

هذا الكود:

```java

public static void main(String[] args) {

    int[] nums = {10, 20, 30, 20, 40, 10, 50, 30, 30};

    for (int i = 0; i < nums.length; i++) {

        boolean foundBefore = false;
        boolean foundDuplicate = false;

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                foundDuplicate = true;
            }
        }

        for (int k = 0; k < i; k++) {
            if (nums[k] == nums[i]) {
                foundBefore = true;
            }
        }

        if (!foundBefore && foundDuplicate) {
            System.out.println(
                "Number: " + nums[i] + ", Index: " + i
            );
        }
    }
}
```

### 1\. ماذا نريد من الكود؟

نريد طباعة كل رقم مكرر مرة واحدة فقط، مع فهرس ظهوره الأول.

المصفوفة هي:

### 10

Index 0

### 20

Index 1

### 30

Index 2

### 20

Index 3

### 40

Index 4

### 10

Index 5

### 50

Index 6

### 30

Index 7

### 30

Index 8

لاحظ أن:

* `10` تكرر مرتين.

* `20` تكرر مرتين.

* `30` تكرر ثلاث مرات.

* `40` و`50` لم يتكررا.

إذن الناتج المطلوب:

```text
Number: 10, Index: 0
Number: 20, Index: 1
Number: 30, Index: 2
```

### 2\. الحلقة الخارجية `i`

```java
for (int i = 0; i < nums.length; i++)
```

هذه الحلقة تمر على كل عنصر في المصفوفة.

| قيمة i | nums[i] |
| ------ | ------- |
| 0      | 10      |
| 1      | 20      |
| 2      | 30      |
| 3      | 20      |
| 4      | 40      |
| 5      | 10      |
| 6      | 50      |
| 7      | 30      |
| 8      | 30      |

في كل دورة، نأخذ رقمًا واحدًا ونفحصه: هل تكرر؟ وهل ظهر قبل ذلك؟

### 3\. لماذا نكتب متغيرين من نوع `boolean`؟

```java
boolean foundBefore = false;
boolean foundDuplicate = false;
```

كل متغير يجيب عن سؤال مختلف.

الأول: `foundBefore`

هل ظهر هذا الرقم في موضع سابق من المصفوفة؟

* `false`: لم نعثر عليه قبل موضعه الحالي.

* `true`: وجدناه قبل موضعه الحالي.

الثاني: `foundDuplicate`

هل يوجد رقم مماثل له في موضع لاحق من المصفوفة؟

* `false`: لم نعثر على نسخة لاحقة.

* `true`: وجدنا نسخة لاحقة.

لماذا نبدأهما بـ `false` في كل دورة؟ لأننا نفحص رقمًا جديدًا، فلا يجوز أن نستخدم نتيجة الرقم السابق.

### 4\. الحلقة الأولى الداخلية: `j = i + 1`

```java
for (int j = i + 1; j < nums.length; j++) {
    if (nums[i] == nums[j]) {
        foundDuplicate = true;
    }
}
```

هذه الحلقة تبحث عن نسخة من الرقم الحالي في العناصر التي تأتي بعده.

لنأخذ أول دورة:

```java
i = 0;
nums[i] = 10;
```

بما أن `i = 0`، فإن:

```java
int j = i + 1;
```

يعني:

```java
int j = 1;
```

إذن يبدأ `j` من الفهرس `1`، ويقارن الرقم `10` بالعناصر اللاحقة:

| j   | nums[j] | هل يساوي 10؟ |
| --- | ------- | ------------ |
| 1   | 20      | لا           |
| 2   | 30      | لا           |
| 3   | 20      | لا           |
| 4   | 40      | لا           |
| 5   | 10      | نعم          |
| 6   | 50      | لا           |
| 7   | 30      | لا           |
| 8   | 30      | لا           |

عندما يصل إلى `j = 5`، يجد أن:

```java
nums[0] == nums[5]
10 == 10
```

فتُنفَّذ هذه التعليمة:

```java
foundDuplicate = true;
```

ومعناها: وجدت نسخة من الرقم الحالي بعد موضعه.

لاحظ أننا لم نكتب `break`؛ لذلك تستمر الحلقة حتى نهايتها، حتى لو وجدت نسخة بالفعل.

### 5\. الحلقة الثانية الداخلية: `k = 0`

```java
for (int k = 0; k < i; k++) {
    if (nums[k] == nums[i]) {
        foundBefore = true;
    }
}
```

هذه الحلقة تبحث عن الرقم الحالي في العناصر التي تسبقه.

في الدورة الأولى، `i = 0`، فيصبح شرط الحلقة:

```java
k < 0
```

لكن `k` يبدأ من `0`، و`0 < 0` غير صحيح؛ لذلك لا تعمل الحلقة إطلاقًا.

وهذا منطقي: العنصر الموجود في الفهرس `0` ليس له أي عنصر سابق.

إذن في هذه الدورة:

* `foundBefore = false`

* `foundDuplicate = true`

### 6\. الشرط الأخير: لماذا نحتاج إلى المتغيرين؟

```java
if (!foundBefore && foundDuplicate)
```

اقرأ الشرط هكذا:

إذا لم يظهر الرقم سابقًا، ووجدنا له نسخة لاحقة، فاطبعه.

* `!foundBefore` تعني أن `foundBefore` تساوي `false`.

* `&&` تعني أن الشرطين يجب أن يكونا صحيحين معًا.

* `foundDuplicate` يجب أن تكون `true`.

بالنسبة للرقم `10` عند الفهرس `0`، الشرطان صحيحان، ولذلك يطبع:

```text
Number: 10, Index: 0
```

أما عندما تصل الحلقة الخارجية لاحقًا إلى `10` عند الفهرس `5`، فستجد الحلقة الثانية أن الرقم `10` ظهر سابقًا عند الفهرس `0`. عندها يصبح `foundBefore = true`، وبالتالي لن يطبعه مرة أخرى.

### الآن دورك: نختبر فهمك

وصلنا إلى الدورة التي فيها:

```java
i = 3;
nums[i] = 20;
```

الرقم `20` موجود أيضًا عند الفهرس `1`.

السؤال: عندما تعمل حلقة `k`، ماذا سيحدث عند فحص `nums[1]`؟

سيبقى `foundBefore = false` لأننا لم نبحث عن الرقم `20` بعد.

سيصبح `foundBefore = true` لأن `nums[1]` يساوي `nums[3]`.

سيصبح `foundDuplicate = true` لأن `k` يبحث عن العناصر اللاحقة.

تحقّق من إجابتي
*/
