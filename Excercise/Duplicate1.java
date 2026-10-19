
public class Duplicate1 {
    
    
public static void main(String[] args) {

    int[] nums = {10, 20, 30, 20, 40, 10, 50, 30, 30};

    for (int i = 0; i < nums.length; i++) {

        boolean foundBefore = false;
        int count = 0;

        for (int k = 0; k < i; k++) {
            if (nums[k] == nums[i]) {
                foundBefore = true;
                break;
            }
        }

        if (foundBefore) {
            continue;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println(
                "Number: " + nums[i] + ", Count: " + count
            );
        }
    }
}

    
}
/*public static void main(String[] args) {

    int[] nums = {10, 20, 30, 20, 40, 10, 50, 30, 30};

    for (int i = 0; i < nums.length; i++) {

        boolean foundBefore = false;
        int count = 0;

        for (int k = 0; k < i; k++) {
            if (nums[k] == nums[i]) {
                foundBefore = true;
                break;
            }
        }

        if (foundBefore) {
            continue;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println(
                "Number: " + nums[i] + ", Count: " + count
            );
        }
    }
}*/
