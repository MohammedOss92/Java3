import java.util.Scanner;

public class Array15 {
    


    public static void main(String args[]){

int[] numbers = {0, 5,5, 0,1,1,1, 3, 8, 0, 2};

int count = 0;

Scanner sc = new Scanner(System.in);
int age = sc.nextInt();

// نقل جميع الأرقام التي لا تساوي 1 إلى بداية المصفوفة بالترتيب، بينما يتجاهل رقم 1 مؤقتاً.
for (int i = 0; i < numbers.length; i++) {

    if (numbers[i] != age) {
        numbers[count] = numbers[i];
        count++;
    }
}


// ملء الأماكن الفارغة (أو المتبقية) في نهاية المصفوفة برقم 1.
for (int j = count; j < numbers.length; j++) {
    numbers[j] = 5;
}

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

    System.out.println("/////////////////");

for (int i = 0; i < count; i++) {
    System.out.println(numbers[i]);
}


    System.out.println("/////////////////");

// طباعة الأماكن المتبقية التي تم حشوها برقم 1
for (int j = count; j < numbers.length; j++) {
    System.out.println(numbers[j]);
}
}}