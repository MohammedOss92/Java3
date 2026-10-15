public class TF {

    public static void main(String[] args) {

        // جدول الحقيقة (Truth Table) للعمليات المنطقية في البرمجة

        // 1. عملية AND (التقاطع - نستخدم &&)
        System.out.println("--- AND Table ---");
        System.out.println(true  && true);   // true
        System.out.println(true  && false);  // false
        System.out.println(false && true);   // false
        System.out.println(false && false);  // false

        System.out.println("\n====================\n");

        // 2. عملية OR (الجمع - نستخدم ||)
        System.out.println("--- OR Table ---");
        System.out.println(true  || true);   // true
        System.out.println(true  || false);  // true
        System.out.println(false || true);   // true
        System.out.println(false || false);  // false

        System.out.println("\n====================\n");

        // 3. عملية NOT (العكس - نستخدم !)
        System.out.println("--- NOT Table ---");
        System.out.println(!true);           // false
        System.out.println(!false);          // true

    }
}
