public class Prime2{
    public static void main(String[] args) {
        int limit = 50;

        System.out.println("الأرقام الأولية من 1 إلى " + limit + " هي:");

        // حلقة تمر على كل الأرقام من 2 إلى 50
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true; // نفترض أن الرقم أولي في البداية

            // نفحص هل يقبل القسمة على أي رقم بين 2 ونصف الرقم
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // وجدنا قاسماً، إذن ليس أولياً
                    break;           // نخرج من الحلقة الداخلية
                }
            }

            // إذا ظل متأكداً أنه أولي، نقوم بطباعته
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
