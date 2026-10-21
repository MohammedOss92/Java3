package string;

public class ReverseString {
    public static void main(String[] args) {

        String s = "hello world java";
        String[] a = s.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}