import java.util.*;
public class ArrayList1 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int max = numbers.get(0);
        int sum = 0;
        
        for(int num : numbers){
            System.out.println(num);
            sum += num;
            
        }
        System.out.println("Size = " + numbers.size());
        System.out.println("Sum = " + sum);
        for (int num : numbers) {
    if (num > max) {
        max = num;
    }
}
        System.out.println(max);
        
        int min = numbers.get(0);
        for(int nums : numbers){
            if (nums < min) {
        min = nums;
    }
            
        }
        System.out.println(min);
      Collections.sort(numbers, Collections.reverseOrder());
        for (int number : numbers) {
            System.out.println(number);
        }
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
        
        ArrayList<String> names = new ArrayList<>();

names.add("Omar");
names.add("Abdallah");
names.add("Zaid");
names.add("Ahmad");
        Collections.sort(names);

// الطباعة
System.out.println(names);
        Collections.sort(names, Collections.reverseOrder());


// الطباعة
System.out.println(names);
        
        boolean a = names.contains("Zaid");

System.out.println(a);
        int index = names.indexOf("Zaid");

System.out.println(index);
        int index = names.indexOf("Khaled");
        int target = 40;
        for (int i = 0; i < numbers.size(); i++) {

    if (target == numbers.get(i)) {

        System.out.println("Found at index: " + i);

    }
            numbers.remove(2);                  // حذف حسب index
numbers.remove(Integer.valueOf(40)); // حذف حسب القيمة
            numbers.set(2, 100);
            
}
        
    }
    
}
/*add() الإضافة.
get() قراءة عنصر.
remove() الحذف.
set() التعديل.
size() معرفة عدد العناصر.*/
/*
 *numbers.size() numbers.size
numbers.get(0) numbers[0]
numbers.add(40) numbers.add(40)
numbers.remove(0) numbers.removeAt(0)
numbers.set(0, 50) numbers[0] = 50*/


/*صحيح! أحسنت. ✅

الناتج `0` لأن `clear()` حذفت جميع العناصر.

الآن تعلمنا هذه الدوال الأساسية:

| الدالة              | الوظيفة              |
| ------------------- | -------------------- |
| add() / append()    | إضافة                |
| get()               | قراءة                |
| set()               | تعديل                |
| remove() / pop()    | حذف                  |
| size() / len()      | عدد العناصر          |
| contains() / in     | البحث عن عنصر        |
| indexOf() / index() | معرفة موقع العنصر    |
| isEmpty()           | فحص هل القائمة فارغة |
| clear()             | حذف الكل             |

### الخطوة التالية: for-each

نريد المرور على جميع عناصر القائمة دون استخدام `index`.

Java:

```java
for (int number : numbers) {
    System.out.println(number);
}
```

Kotlin:

```kotlin
for (number in numbers) {
    println(number)
}
```

Python:

```python
for number in numbers:
    print(number)
```

لاحظ أن اللغات الثلاث تستخدم فكرة متشابهة جدًا.

سؤالي:

إذا كانت القائمة:

```java
numbers = [10, 20, 30];
```

كم مرة ستعمل الحلقة؟
*/

/*
 * int left = 0;
int right = numbers.size() - 1;

while (left < right) {

    int temp = numbers.get(left);

    numbers.set(left, numbers.get(right));
    numbers.set(right, temp);

    left++;
    right--;
}
 * */
 