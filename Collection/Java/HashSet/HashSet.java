import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {

        // إنشاء HashSet
        HashSet<Integer> nums = new HashSet<>();

        // إضافة عناصر
        nums.add(10);
        nums.add(20);
        nums.add(30);

        // إضافة قيمة مكررة
        nums.add(20);

        // طباعة المجموعة
        System.out.println(nums);
    }
}