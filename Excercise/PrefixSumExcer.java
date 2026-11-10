
public class PrefixSumExcer{

    public static void main(String args[]){
int[] numbers = {3, 5, 2, 4, 6};
int [] prefix = new int[numbers.length];
prefix[0] = numbers[0];
int left = 2;
int right = 3;
int sum = 0;

for (int i = 1; i < numbers.length; i++) {
prefix[i] = prefix[i - 1] + numbers[i];
}
if (left == 0) {
    sum = prefix[right];
} else {
    sum = prefix[right] - prefix[left - 1];
}

  System.out.println(sum); }
}
