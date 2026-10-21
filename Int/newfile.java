package Int;
public class newfile {
    public static void main(String[] args) {

        int i = 2;
        int n = 8;
if(n<=1){ 

                System.out.println("aa");
}
        while (n > 1) {

            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
            } else {
                i++;
            }
        }
    }
}