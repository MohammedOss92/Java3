
public class Array13{

    public static void main(String args[]){
{

        int[] numbers = {10, 20, 30, 40, 50};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int swap = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = swap;

            left++;
            right--;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}}

    
