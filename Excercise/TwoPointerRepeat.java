
public class TwoPointerRepeat {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {3, 5, 5, 7};
        boolean found = false;
        
        for(int i=0;i<=numbers.length-2;i++){
            if(numbers[i]==numbers[i+1]){
                System.out.println("found");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }
        
    }
    
    /*boolean found = false;

for (int i = 0; i <= numbers.length - 2; i++) {
    if (numbers[i] == numbers[i + 1]) {
        found = true;
        break;
    }
}

if (found) {
    System.out.println("found");
} else {
    System.out.println("not found");
}*/
    
}