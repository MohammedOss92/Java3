
public class Array6{

    public static void main(String args[]){
int[] numbers = {10, 30, 25, 30, 15, 30, 40};

int count = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == 30) {
        count++;
    }
}

System.out.println(count);
    }
}
