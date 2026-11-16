
public class Trainning5 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
        int target = 507;
boolean found = false;
        for (int i = 0; i < numbers.length&&!found; i++) {
    for (int j = 0; j < numbers[i].length; j++) {

        if (numbers[i][j] == target) {
            found = true;
            break;
        }

    }
}
        if (found) {
    System.out.println("Found");
} else {
    System.out.println("Not Found");
}
    }
    
}