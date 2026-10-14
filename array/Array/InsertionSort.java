
public class InsertionSort {

    static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    int[] nums = {6, 2, 8, 4};

        System.out.println("Start:");
        printArray(nums);

        for (int i = 1; i < nums.length; i++) {

            int key = nums[i];
            int j = i - 1;

            System.out.println("\ni = " + i
                    + ", key = " + key
                    + ", j = " + j);

            //while (j >= 0 && nums[j] > key) {
                while (j >= 0 && nums[j] < key){

                nums[j + 1] = nums[j];

                System.out.print("After shifting: ");
                printArray(nums);

                j--;

                System.out.println("j = " + j);
            }

            nums[j + 1] = key;

            System.out.print("After inserting key: ");
            printArray(nums);
        }

        System.out.print("\nFinal array: ");
        printArray(nums);
    }
}