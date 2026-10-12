
public class ArrayDigit{

    public static void main(String args[]){


        int[] numbers = {10, 25, 41, 7, 100, 32};

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];
            boolean found = false;

            while (number != 0) {

                int digit = number % 10;

                

                number = number / 10;
                if (digit == 1) {
    System.out.println(1);
    found = true;
}

            }

            if (found) {
                System.out.println(numbers[i]);
            }
        }
    }
}

    

