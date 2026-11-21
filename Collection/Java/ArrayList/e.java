
import java.util.*;

public class e {

    public static void main(String[] args) {

        // 1. إنشاء ArrayList
        ArrayList<Integer> nums = new ArrayList<>();

        // 2. إضافة العناصر
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);

        // 3. إضافة عنصر في موقع محدد
        nums.add(2, 25);
        System.out.println(nums);

        // 4. معرفة عدد العناصر
        System.out.println(nums.size());

        // 5. جلب عنصر حسب الموقع
        System.out.println(nums.get(3));

        // 6. تعديل عنصر
        nums.set(0, 55);
        System.out.println(nums);

        // 7. فحص وجود عنصر
        boolean a = nums.contains(100);
        System.out.println(a);

        // 8. معرفة موقع أول ظهور
        System.out.println(nums.indexOf(55));

        // 9. إضافة قيمة مكررة
        nums.add(55);

        // 10. معرفة موقع آخر ظهور
        System.out.println(nums.lastIndexOf(55));

        // 11. فحص هل القائمة فارغة
        System.out.println(nums.isEmpty());

        System.out.println("---------");

        // 12. الطباعة باستخدام for
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // 13. الطباعة باستخدام for-each
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("&&&&&");

        // 14. حساب المجموع باستخدام for
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        System.out.println(sum);

        System.out.println("&&&&&");

        // 15. حساب المجموع باستخدام for-each
        int sum2 = 0;

        for (int n : nums) {
            sum2 += n;
        }

        System.out.println(sum2);

        // 16. إيجاد أكبر وأصغر عنصر
        int max = nums.get(0);
        int min = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) > max) {
                max = nums.get(i);
            }

            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // 17. الحذف حسب الموقع
        nums.remove(0);
        System.out.println(nums);

        // 18. الحذف حسب القيمة
        nums.remove(Integer.valueOf(25));
        System.out.println(nums);

        // 19. عكس ترتيب القائمة
        Collections.reverse(nums);
        System.out.println("Reverse: " + nums);

        // 20. الترتيب التصاعدي
        Collections.sort(nums);
        System.out.println("Ascending: " + nums);

        // 21. الترتيب التنازلي
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Descending: " + nums);

        // 22. البحث الخطي Linear Search
        int target = 40;

        boolean found = false;

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i).equals(target)) {

                found = true;

                System.out.println("Found at index: " + i);

                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        // 23. استخدام Iterator
        Iterator<Integer> iterator = nums.iterator();

        while (iterator.hasNext()) {

            // جلب العنصر التالي
            int value = iterator.next();

            // حذف جميع الأرقام الأصغر من 30
            if (value < 30) {
                iterator.remove();
            }
        }

        // طباعة القائمة بعد الحذف
        System.out.println("After Iterator: " + nums);
      
      
      
         ArrayList<Integer> extraNumbers = new ArrayList<>(); // إنشاء قائمة إضافية

        extraNumbers.add(60); // إضافة 60
        extraNumbers.add(70); // إضافة 70

        nums.addAll(extraNumbers); // إضافة جميع عناصر القائمة الثانية إلى الأولى

        System.out.println("After addAll: " + nums); // طباعة القائمة

        // =================================
        // 24. الاحتفاظ بالعناصر المشتركة retainAll()
        // =================================

        ArrayList<Integer> selected = new ArrayList<>(); // إنشاء قائمة للاحتفاظ بعناصر محددة

        selected.add(40); // إضافة 40
        selected.add(60); // إضافة 60

        nums.retainAll(selected); // الاحتفاظ فقط بالعناصر الموجودة في selected

        System.out.println("After retainAll: " + nums); // طباعة العناصر المشتركة

        // =================================
        // 25. حذف مجموعة من العناصر removeAll()
        // =================================

        nums.removeAll(selected); // حذف جميع العناصر الموجودة في selected

        System.out.println("After removeAll: " + nums); // طباعة القائمة بعد الحذف

        // =================================
        // 26. تحويل القائمة إلى Array toArray()
        // =================================

        Integer[] array = nums.toArray(new Integer[0]); // تحويل ArrayList إلى مصفوفة

        System.out.println("Array length: " + array.length); // طباعة طول المصفوفة

        // =================================
        // 27. حذف جميع العناصر clear()
        // =================================

        nums.clear(); // حذف جميع عناصر القائمة

        System.out.println("After clear: " + nums); // طباعة القائمة الفارغة

        // =================================
        // 28. فحص هل القائمة فارغة
        // =================================

        System.out.println("Is Empty: " + nums.isEmpty()); // ستكون النتيجة true

      
     //main



      
      
      
    }
  
  
  
  
}
