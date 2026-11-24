
import java.util.ArrayDeque

fun main() {

    // إنشاء ArrayDeque
    val nums = ArrayDeque<Int>()

    // إضافة عناصر في النهاية
    nums.addLast(10)
    nums.addLast(20)
    nums.addLast(30)
    nums.addLast(40)

    // إضافة عنصر في البداية
    nums.addFirst(5)

    // إضافة عنصر في النهاية
    nums.addLast(50)

    // حذف أول عنصر
    nums.removeFirst()

    // طباعة القائمة
    println(nums)

    // التحقق من وجود الرقم 30
    println(nums.contains(30))

    // حذف جميع الأرقام الأكبر من 30
    nums.removeAll { num -> num > 30 }

    // طباعة القائمة بعد الحذف
    println(nums)

    // متغير لتخزين المجموع
    var sum = 0

    // متغير لأكبر رقم
    var max = nums.first()

    // متغير لأصغر رقم
    var min = nums.first()

    // المرور على جميع العناصر
    for (num in nums) {

        // حساب المجموع
        sum += num

        // مقارنة الرقم بأكبر رقم
        if (num > max) {
            max = num
        }

        // مقارنة الرقم بأصغر رقم
        if (num < min) {
            min = num
        }
    }

    // طباعة النتائج
    println("Sum = $sum")
    println("Max = $max")
    println("Min = $min")
    
    
    
    
    // الرقم الذي نريد البحث عنه
val target = 70

// متغير لمعرفة هل وجدنا الرقم
var found = false

// المرور على جميع العناصر
for (num in nums) {

    // مقارنة العنصر الحالي بالرقم المطلوب
    if (num == target) {

        // تغيير found إلى true
        found = true

        // إيقاف الحلقة
        break
    }
}

// طباعة نتيجة البحث
println("Found = $found")

// إنشاء Iterator
val iterator = nums.iterator()

// الاستمرار ما دام يوجد عنصر قادم
while (iterator.hasNext()) {

    // جلب العنصر التالي
    val num = iterator.next()

    // طباعة العنصر
    println(num)
}
// عدد العناصر
println(nums.size)

// هل القائمة فارغة؟
println(nums.isEmpty())

// هل القائمة تحتوي على عناصر؟
println(nums.isNotEmpty())

println(nums.isEmpty())
println(nums.isNotEmpty())

// حذف جميع العناصر
nums.clear()

// طباعة القائمة
println(nums)

// التأكد من أنها فارغة
println(nums.isEmpty())


}
