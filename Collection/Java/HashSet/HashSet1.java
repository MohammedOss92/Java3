
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {

        // =================================
        // 1. إنشاء HashSet والإضافة
        // =================================

        HashSet<Integer> nums = new HashSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(20); // لن تتم إضافة 20 مرة ثانية

        System.out.println("Original HashSet: " + nums);


        // =================================
        // 2. المرور على العناصر for-each
        // =================================

        for (int num : nums) {
            System.out.println(num);
        }


        // =================================
        // 3. البحث عن عنصر contains
        // =================================

        System.out.println(nums.contains(20)); // true
        System.out.println(nums.contains(50)); // false


        // =================================
        // 4. حذف عنصر remove
        // =================================

        System.out.println(nums.remove(20)); // true
        System.out.println(nums);            // [10, 30]


        // =================================
        // 5. إضافة عنصر مرة أخرى
        // =================================

        System.out.println(nums.add(20)); // true
        System.out.println(nums.add(20)); // false


        // =================================
        // 6. معرفة عدد العناصر size
        // =================================

        System.out.println(nums.size());


        // =================================
        // 7. التحقق هل المجموعة فارغة
        // =================================

        System.out.println(nums.isEmpty()); // false


        // =================================
        // 8. Iterator
        // =================================

        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {

            int num = it.next();

            if (num == 20) {
                it.remove(); // حذف العنصر الحالي بأمان
            }
        }

        System.out.println(nums);


        // =================================
        // 9. إعادة إضافة عنصر للتجربة
        // =================================

        nums.add(20);
        nums.add(40);


        // =================================
        // 10. clear حذف جميع العناصر
        // =================================

        HashSet<Integer> test = new HashSet<>(nums);

        test.clear();

        System.out.println(test);       // []
        System.out.println(test.size()); // 0
        System.out.println(test.isEmpty()); // true


        // =================================
        // 11. إنشاء مجموعتين
        // =================================

        HashSet<Integer> nums1 = new HashSet<>();

        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(40);

        HashSet<Integer> nums2 = new HashSet<>();

        nums2.add(20);
        nums2.add(30);
        nums2.add(50);


        // =================================
        // 12. addAll إضافة مجموعة إلى أخرى
        // =================================

        HashSet<Integer> all = new HashSet<>(nums1);

        all.addAll(nums2);

        System.out.println("addAll: " + all);


        // =================================
        // 13. removeAll حذف العناصر المشتركة
        // =================================

        HashSet<Integer> removed = new HashSet<>(nums1);

        removed.removeAll(nums2);

        System.out.println("removeAll: " + removed);


        // =================================
        // 14. retainAll الاحتفاظ بالمشترك
        // =================================

        HashSet<Integer> common = new HashSet<>(nums1);

        common.retainAll(nums2);

        System.out.println("retainAll: " + common);


        // =================================
        // 15. containsAll فحص جميع العناصر
        // =================================

        System.out.println(nums1.containsAll(nums2));


        // =================================
        // 16. تحويل HashSet إلى Array
        // =================================

        Integer[] arr = nums1.toArray(new Integer[0]);

        // الوصول باستخدام index
        System.out.println(arr[0]);

        // المرور على Array
        for (int num : arr) {
            System.out.println(num);
        }


        // =================================
        // 17. حذف جميع العناصر من nums
        // =================================

        nums.clear();

        System.out.println(nums);
        System.out.println(nums.isEmpty());

    }
}
