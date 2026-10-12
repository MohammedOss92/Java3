package Int;
public class countOfDigit {
    public static void main(String[] args) {
        int i=123;
        int count =0;
        while(i!=0){
            i=i/10;
            count++;
        }
                                System.out.println("Digits = " + count);

    }
}
