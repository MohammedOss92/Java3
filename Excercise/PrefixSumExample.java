public class PrefixSumExample {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 5, 3, 6};

        // إنشاء مصفوفة المجموع التراكمي
        int[] prefix = new int[numbers.length];

        // أول عنصر
        prefix[0] = numbers[0];

        // بناء المجموع التراكمي
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // النطاق الأول
        int left = 1;
        int right = 3;
        int sum = 0;

        if (left == 0) {
            sum = prefix[right];
        } else {
            sum = prefix[right] - prefix[left - 1];
        }

        System.out.println("First range sum: " + sum);

        // النطاق الثاني
        left = 2;
        right = 5;

        if (left == 0) {
            sum = prefix[right];
        } else {
            sum = prefix[right] - prefix[left - 1];
        }

        System.out.println("Second range sum: " + sum);
    }
}

/*العملية Time Complexity
بناء Prefix O(n)
كل Range Sum O(1)
Extra Space O(n)
ا*/