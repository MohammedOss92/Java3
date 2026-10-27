
public class ArrayInt {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {5, -3, 8, -2, 4, -7, 6};
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                continue;
            }
            else{
            sum +=numbers[i];}
        }
        
        System.out.print(sum);
    }
    
}





public class ArrayInt {

    public static void main(String[] args) {

        int[] numbers = {5, -3, 8, -2, 4, -7, 6};
        int sum = 0;
        boolean first = true;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                continue;
            }

            if (!first) {
                System.out.print(" + ");
            }

            System.out.print(numbers[i]);
            sum += numbers[i];
            first = false;
        }

        System.out.println(" = " + sum);
    }
}
