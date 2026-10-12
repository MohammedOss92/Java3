
public class Array9{

    public static void main(String args[]){
int[] numbers = {10, 20, 30, 40, 50};

int max = numbers[1];    // 20
int second = numbers[0]; // 10

for (int i = 2; i < numbers.length; i++) {
    if (numbers[i] > max) {
        second = max;
        max = numbers[i];
    } else if (numbers[i] > second && numbers[i] < max) {
        second = numbers[i];
    }
}

System.out.println("Second Largest: " + second);


    }
}
