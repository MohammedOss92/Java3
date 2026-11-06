public class SlidingArrayLength {

    public static void main(String args[]) {

        int[] numbers = {1, 2, 1, 1, 3, 2, 1};

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < numbers.length; right++) {

            sum += numbers[right];

            while (sum > 5) {
                sum -= numbers[left];
                left++;
            }

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }

            System.out.println(
                "right = " + right +
                " | left = " + left +
                " | sum = " + sum +
                " | length = " + length +
                " | maxLength = " + maxLength
            );
        }

        System.out.println("Final Max Length = " + maxLength);
    }
}

/*public class SlidingWindowMinLength {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 2, 4, 3};

        int left = 0;
        int sum = 0;
        int minLength = numbers.length + 1;

        for (int right = 0; right < numbers.length; right++) {

            sum += numbers[right];

            while (sum >= 7) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum -= numbers[left];
                left++;
            }

            System.out.println(
                "right = " + right +
                " | left = " + left +
                " | sum = " + sum +
                " | minLength = " + minLength
            );
        }

        System.out.println("Final Min Length = " + minLength);
    }
}*/