
public class PrefixSum2{

    public static void main(String args[]){

int[] numbers = {4, 3, 2, 6, 5};
int[] prefix = {4, 7, 9, 15, 20};
int sum=0;
int left = 1;
int right = 3;
sum = prefix[right] - prefix[left - 1];

System.out.print(sum);
    }
}
