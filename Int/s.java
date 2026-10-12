package Int;
public class s {
    public static void main(String[] args) {

        int n = 145;
        int temp = n;
        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;

            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}

// العدد القوي هو عدد يكون:

// مجموع مضروب (factorial) كل رقم داخله = نفس الرقم نفسه

// مثال:

// 145
// 1! + 4! + 5! = 1 + 24 + 120 = 145 ✔️