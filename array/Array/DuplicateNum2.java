public class DuplicateNum2{

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 20, 40, 10, 50, 30, 30};

        for (int i = 0; i < nums.length; i++) {

            boolean foundBefore = false;
            boolean foundDuplicate = false;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    foundDuplicate = true;
                }
            }

            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    foundBefore = true;
                }
            }

            if (!foundBefore && foundDuplicate) {
                System.out.println("Number: " + nums[i] + ", Index: " + i);
            }
        }
      }
}
/*
public class DuplicateNumbers {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 20, 40, 10, 50,30,30};

        for (int i = 0; i < nums.length; i++) {

            boolean foundBefore = false;
            boolean foundDuplicate = false;

            // البحث عن تكرار في العناصر التالية
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    foundDuplicate = true;
                }
            }
            
            

            // فحص هل الرقم ظهر سابقًا
            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    foundBefore = true;
                }
            }

            // طباعة الرقم والـ index لأول ظهور
            if (foundBefore == false && foundDuplicate == true) {
                System.out.println("Number: " + nums[i] + ", Index: " + i);
            }
        }
    }
}*/