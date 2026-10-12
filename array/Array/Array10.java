
public class Array10{

    public static void main(String args[]){

int[] numbers = {50, 10, 30, 40, 20}; // حتى لو كان الأول أكبر من الثاني

int max;
int second;

// مقارنة أول عنصرين لضمان الإسناد الصحيح
if (numbers[0] > numbers[1]) {
    max = numbers[0];
    second = numbers[1];
} else {
    max = numbers[1];
    second = numbers[0];
}

// البدء من العنصر الثالث (المؤشر 2)
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
