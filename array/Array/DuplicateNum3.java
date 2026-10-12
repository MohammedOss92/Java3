public class DuplicateNum3 {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 20, 40, 10, 50, 30, 30};

        for (int i = 0; i < nums.length; i++) {

            boolean foundBefore = false;
            int count = 0;

            // هل ظهر الرقم سابقًا؟
            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    foundBefore = true;
                    break;
                }
            }

            // نحسب عدد مرات ظهور الرقم
            if (!foundBefore) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                // نطبع الأرقام التي تكررت فقط
                if (count > 1) {
                    System.out.println(
                        "Number: " + nums[i] + ", Count: " + count
                 + ", index" +i );
                }
            }
        }
    }
}