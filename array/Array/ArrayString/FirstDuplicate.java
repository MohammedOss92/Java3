
public class FirstDuplicate {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 20, 40, 10, 50};

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                    return;
                }

            }
        }

        System.out.println("No duplicates found");
    }
}
