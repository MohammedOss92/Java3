
fun main() {

    // =====================================
    // 1. ARRAY
    // =====================================

    // إنشاء Array من الأعداد الصحيحة
    val numbers = intArrayOf(10, 20, 30, 40, 50, 20)

    // طباعة جميع العناصر
    println(numbers.contentToString())

    // عدد العناصر
    println(numbers.size)

    // الوصول إلى عنصر بالفهرس
    println(numbers[0])

    // تعديل عنصر
    numbers[0] = 100

    // الوصول إلى جميع الفهارس
    println(numbers.indices)

    // آخر فهرس
    println(numbers.lastIndex)

    // أول عنصر
    println(numbers.first())

    // آخر عنصر
    println(numbers.last())

    // التحقق من وجود عنصر
    println(numbers.contains(20))

    // إيجاد موقع عنصر
    println(numbers.indexOf(20))

    // إيجاد آخر موقع لعنصر
    println(numbers.lastIndexOf(20))

    // المرور على العناصر
    numbers.forEach {
        println(it)
    }

    // المرور مع الفهرس
    numbers.forEachIndexed { index, value ->
        println("$index = $value")
    }

    // إيجاد أكبر عنصر
    println(numbers.maxOrNull())

    // إيجاد أصغر عنصر
    println(numbers.minOrNull())

    // حساب المجموع
    println(numbers.sum())

    // حساب المتوسط
    println(numbers.average())

    // حساب عدد العناصر الأكبر من 30
    println(numbers.count { it > 30 })

    // تصفية العناصر الأكبر من 20
    println(numbers.filter { it > 20 })

    // تصفية العناصر الزوجية
    println(numbers.filter { it % 2 == 0 })

    // تصفية العناصر الفردية
    println(numbers.filter { it % 2 != 0 })

    // تحويل كل عنصر إلى الضعف
    println(numbers.map { it * 2 })

    // ترتيب تصاعدي وإرجاع نسخة جديدة
    println(numbers.sorted())

    // ترتيب تنازلي وإرجاع نسخة جديدة
    println(numbers.sortedDescending())

    // عكس العناصر وإرجاع نسخة جديدة
    println(numbers.reversed())

    // إزالة التكرار وإرجاع قائمة جديدة
    println(numbers.distinct())

    // هل يوجد عنصر أكبر من 90؟
    println(numbers.any { it > 90 })

    // هل جميع العناصر موجبة؟
    println(numbers.all { it > 0 })

    // هل لا يوجد عنصر سالب؟
    println(numbers.none { it < 0 })

    // البحث عن أول عنصر أكبر من 30
    println(numbers.find { it > 30 })

    // استخراج أول 3 عناصر
    println(numbers.take(3))

    // تجاهل أول عنصرين
    println(numbers.drop(2))

    // تحويل Array إلى List
    val arrayListView = numbers.toList()

    // تحويل Array إلى MutableList
    val arrayMutable = numbers.toMutableList()

    // نسخ Array
    val copiedArray = numbers.copyOf()

    // البحث الثنائي: المصفوفة يجب أن تكون مرتبة
    println(numbers.sortedArray().binarySearch(30))

    // ترتيب المصفوفة الأصلية تصاعدياً
    numbers.sort()

    // ترتيب المصفوفة الأصلية تنازلياً
    numbers.sortDescending()

    // عكس المصفوفة الأصلية
    numbers.reverse()

    // خلط المصفوفة الأصلية
    numbers.shuffle()

    // تعبئة جميع العناصر بالقيمة 5
    val filledArray = numbers.copyOf()
    filledArray.fill(5)

    println(filledArray.contentToString())


    // =====================================
    // 2. LIST
    // =====================================

    // إنشاء List غير قابلة للتعديل عبر واجهتها
    val list = listOf(10, 20, 30, 40, 50, 20)

    // طباعة القائمة
    println(list)

    // عدد العناصر
    println(list.size)

    // الوصول إلى عنصر
    println(list.get(0))

    // الوصول باستخدام الفهرس
    println(list[1])

    // الوصول الآمن: يعيد null إذا كان الفهرس غير صالح
    println(list.getOrNull(100))

    // الوصول مع قيمة بديلة
    println(list.getOrElse(100) { -1 })

    // أول عنصر
    println(list.first())

    // آخر عنصر
    println(list.last())

    // أول عنصر يحقق الشرط
    println(list.first { it > 20 })

    // آخر عنصر يحقق الشرط
    println(list.last { it > 20 })

    // أول عنصر أو null
    println(list.firstOrNull())

    // آخر عنصر أو null
    println(list.lastOrNull())

    // التحقق من الفراغ
    println(list.isEmpty())

    // التحقق من عدم الفراغ
    println(list.isNotEmpty())

    // البحث عن عنصر
    println(list.contains(30))

    // البحث عن مجموعة عناصر
    println(list.containsAll(listOf(10, 20)))

    // أول موقع لعنصر
    println(list.indexOf(20))

    // آخر موقع لعنصر
    println(list.lastIndexOf(20))

    // البحث عن أول فهرس يحقق الشرط
    println(list.indexOfFirst { it > 25 })

    // البحث عن آخر فهرس يحقق الشرط
    println(list.indexOfLast { it > 25 })

    // استخراج جزء من القائمة
    println(list.subList(1, 4))

    // تصفية العناصر
    println(list.filter { it > 20 })

    // عكس شرط التصفية
    println(list.filterNot { it > 20 })

    // تحويل العناصر
    println(list.map { it * 2 })

    // إزالة التكرار
    println(list.distinct())

    // ترتيب تصاعدي
    println(list.sorted())

    // ترتيب تنازلي
    println(list.sortedDescending())

    // عكس القائمة
    println(list.reversed())

    // أخذ أول 3 عناصر
    println(list.take(3))

    // أخذ آخر عنصرين
    println(list.takeLast(2))

    // تجاهل أول عنصرين
    println(list.drop(2))

    // تقسيم القائمة إلى مجموعات من عنصرين
    println(list.chunked(2))

    // إنشاء نوافذ متحركة
    println(list.windowed(3))

    // ربط العناصر المتجاورة في أزواج
    println(list.zipWithNext())

    // تقسيم القائمة حسب شرط
    println(list.partition { it > 25 })

    // تجميع الأعداد حسب الزوجية والفردية
    println(list.groupBy { it % 2 })

    // المجموع
    println(list.sum())

    // المتوسط
    println(list.average())

    // أكبر عنصر
    println(list.maxOrNull())

    // أصغر عنصر
    println(list.minOrNull())

    // مجموع مربعات العناصر
    println(list.sumOf { it * it })

    // تجميع تراكمي
    println(list.runningFold(0) { total, num -> total + num })

    // دمج قائمتين
    println(list + listOf(60, 70))

    // تحويل List إلى Array
    val listArray = list.toTypedArray()

    // تحويل List إلى MutableList
    val listMutable = list.toMutableList()


    // =====================================
    // 3. MUTABLE LIST
    // =====================================

    // إنشاء قائمة قابلة للتعديل
    val mutable = mutableListOf(10, 20, 30, 40, 50)

    // إضافة عنصر في النهاية
    mutable.add(60)

    // إضافة عنصر في موقع محدد
    mutable.add(1, 15)

    // إضافة مجموعة عناصر
    mutable.addAll(listOf(70, 80))

    // إضافة مجموعة في موقع محدد
    mutable.addAll(0, listOf(1, 2))

    // تعديل عنصر بالفهرس
    mutable.set(0, 100)

    // تعديل باستخدام الأقواس
    mutable[1] = 200

    // حذف عنصر بالقيمة
    mutable.remove(30)

    // حذف عنصر بالفهرس
    mutable.removeAt(0)

    // حذف مجموعة عناصر
    mutable.removeAll(listOf(70, 80))

    // الاحتفاظ بعناصر محددة فقط
    mutable.retainAll(listOf(10, 20, 40, 50, 60))

    // ترتيب تصاعدي داخل القائمة الأصلية
    mutable.sort()

    // ترتيب تنازلي داخل القائمة الأصلية
    mutable.sortDescending()

    // عكس القائمة الأصلية
    mutable.reverse()

    // خلط القائمة الأصلية
    mutable.shuffle()

    // تعبئة جميع العناصر بقيمة واحدة
    mutable.fill(5)

    // استبدال كل عنصر بضعفه
    mutable.replaceAll { it * 2 }

    // حذف العناصر التي تحقق الشرط
    mutable.removeIf { it > 50 }

    // حذف جميع العناصر
    mutable.clear()

    // التحقق من النتيجة
    println(mutable)


    // =====================================
    // 4. ARRAYLIST
    // =====================================

    // إنشاء ArrayList
    val arrayList = ArrayList<Int>()

    // إضافة عناصر
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)

    // إضافة عنصر في موقع محدد
    arrayList.add(1, 15)

    // إضافة مجموعة
    arrayList.addAll(listOf(40, 50, 60))

    // عدد العناصر
    println(arrayList.size)

    // جلب عنصر
    println(arrayList.get(0))

    // تعديل عنصر
    arrayList.set(0, 100)

    // حذف بالقيمة
    arrayList.remove(20)

    // حذف بالفهرس
    arrayList.removeAt(0)

    // التحقق من وجود عنصر
    println(arrayList.contains(30))

    // إيجاد موقع عنصر
    println(arrayList.indexOf(30))

    // ترتيب
    arrayList.sort()

    // ترتيب تنازلي
    arrayList.sortDescending()

    // تصفية
    println(arrayList.filter { it > 30 })

    // تحويل العناصر
    println(arrayList.map { it * 2 })

    // إزالة التكرار
    println(arrayList.distinct())

    // إنشاء Iterator
    val iterator = arrayList.iterator()

    // المرور على العناصر
    while (iterator.hasNext()) {

        // جلب العنصر التالي
        val value = iterator.next()

        // طباعة العنصر
        println(value)
    }

    // إنشاء نسخة سطحية من ArrayList
    val cloned = arrayList.clone() as ArrayList<Int>

    // تحويل إلى List
    val convertedList = arrayList.toList()

    // تحويل إلى MutableList
    val convertedMutable = arrayList.toMutableList()

    // تحويل إلى Array
    val convertedArray = arrayList.toTypedArray()

    // حذف جميع العناصر
    arrayList.clear()


    // =====================================
    // 5. ITERATOR WITH REMOVAL
    // =====================================

    // إنشاء قائمة جديدة
    val nums = mutableListOf(10, 15, 20, 25, 30)

    // إنشاء Iterator
    val it = nums.iterator()

    // المرور على العناصر
    while (it.hasNext()) {

        // جلب العنصر الحالي
        val value = it.next()

        // إذا كان العنصر زوجياً
        if (value % 2 == 0) {

            // حذفه بأمان عبر Iterator
            it.remove()
        }
    }

    // طباعة العناصر المتبقية
    println(nums)


    // =====================================
    // 6. LIST ITERATOR
    // =====================================

    // إنشاء قائمة
    val values = mutableListOf(10, 20, 30)

    // إنشاء ListIterator
    val listIterator = values.listIterator()

    // المرور للأمام
    while (listIterator.hasNext()) {

        // جلب العنصر التالي
        println(listIterator.next())
    }

    // المرور للخلف
    while (listIterator.hasPrevious()) {

        // جلب العنصر السابق
        println(listIterator.previous())
    }

    // طباعة القائمة النهائية
    println(values)


    // =====================================
    // 7. ARRAY TYPES
    // =====================================

    // مصفوفة أعداد صحيحة
    val intNumbers = intArrayOf(10, 20, 30)

    // مصفوفة نصوص
    val stringNames = arrayOf("Ali", "Omar")

    // مصفوفة Boolean
    val booleanValues = booleanArrayOf(true, false)

    // مصفوفة Double
    val doubleNumbers = doubleArrayOf(1.5, 2.5)

    // مصفوفة Char
    val characters = charArrayOf('A', 'B', 'C')

    // طباعة المصفوفات
    println(intNumbers.contentToString())
    println(stringNames.contentToString())
    println(booleanValues.contentToString())
    println(doubleNumbers.contentToString())
    println(characters.contentToString())


    // =====================================
    // 8. COLLECTIONS COMPARISON
    // =====================================

    // إنشاء Array
    val a = arrayOf(10, 20, 30)

    // تحويل Array إلى List
    val b: List<Int> = a.toList()

    // تحويل Array إلى MutableList
    val c: MutableList<Int> = a.toMutableList()

    // تحويل Array إلى ArrayList
    val d = ArrayList(a.toList())

    // طباعة جميع الأنواع
    println(a.contentToString())
    println(b)
    println(c)
    println(d)

}
