
public class Trainning6 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
}; 
        
        for (int i = numbers.length - 1; i >= 0; i--) {

    for (int j = 0; j < numbers[i].length; j++) {

        System.out.print(numbers[i][j] + " ");
    }

    System.out.println();
            
            
}
        
        for (int i = 0; i < numbers.length; i++) {

    for (int j = numbers[i].length - 1; j >= 0; j--) {

        System.out.print(numbers[i][j] + " ");
    }

    System.out.println();
}
        
        for (int i = numbers.length - 1; i >= 0; i--) {

    for (int j = numbers[i].length - 1; j >= 0; j--) {

        System.out.print(numbers[i][j] + " ");
    }

    System.out.println();
}
    }
    
}