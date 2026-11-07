
public class PrefixSum{

    public static void main(String args[]){
int[] numbers = {4, 3, 2, 6, 5};
int[] prefix = new int[numbers.length];
prefix[0] = numbers[0];
for (int i = 1; i < numbers.length; i++) {
prefix[i] = prefix[i - 1] + numbers[i];
}

for(int i=0;i < prefix.length;i++){
    System.out.println(prefix[i]);
}

    }
}
