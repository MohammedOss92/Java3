
public class LinearSearch2{

    public static void main(String args[]){

        int[] nums = {3, 5, 1, 4, 2, 9};
        int target = 4;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                found = true;
                System.out.println("Found at index: " + i);
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}

