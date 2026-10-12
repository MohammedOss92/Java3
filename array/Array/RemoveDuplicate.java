
public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] nums = {4, 2, 4,5, 7, 2, 9, 7};

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            // فحص العناصر السابقة
            for (int k = 0; k < i; k++) {

                if (nums[k] == nums[i]) {
                    found = true;
                    break;
                }
            }

            // إذا ظهر الرقم سابقًا، انتقل للعنصر التالي
            if (found) {
                continue;
            }

            // طباعة الرقم إذا كانت هذه أول مرة يظهر فيها
            System.out.println(nums[i]);
        }
    }
}

